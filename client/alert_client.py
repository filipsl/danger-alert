import os
import sys
from random import randint
from time import sleep

import grpc
import re

from gen.danger_alert_pb2_grpc import AlertServiceStub
from gen.danger_alert_pb2 import DangerType, Empty, SubscriptionParams, StateAlertFilter, Alert, SeverityLevel

import logging


def special_match(strg, search=re.compile(r'[^FHEB]').search):
    return not bool(search(strg))


def get_danger_type(letter):
    if letter == 'F':
        return DangerType.FLOOD
    elif letter == 'H':
        return DangerType.HURRICANE
    elif letter == 'E':
        return DangerType.EARTHQUAKE
    elif letter == 'B':
        return DangerType.BLIZZARD
    else:
        raise TypeError('Unknown danger type letter')


class AlertClient:
    def __init__(self):
        self.available_codes = set()
        self.subs_params_dict = {}
        self.subs_params_message = SubscriptionParams()

    def make_subs_request_message(self):
        for state_code in self.subs_params_dict:
            state_alert_filter = StateAlertFilter()
            state_alert_filter.stateCode = state_code
            for danger_letter in self.subs_params_dict[state_code]:
                state_alert_filter.dangerTypes.append(get_danger_type(danger_letter))
            self.subs_params_message.alertFilters.append(state_alert_filter)

    def define_subscription(self):
        print('State codes available for subscription:', list(self.available_codes), '\n')
        print('Define subscription: enter state code and danger type filters')
        print('Danger types: F - flood, H - hurricane, E - earthquake, B - blizzard')
        print('For example: NY FHE')
        print('Leave field empty to finish configuration')
        text = ''

        while not self.subs_params_dict or text:
            text = input("Enter new parameter: ")
            params = text.split()
            if len(params) == 2:
                state_code = params[0]
                danger_types = params[1]
                if state_code in self.available_codes:
                    if state_code not in self.subs_params_dict:
                        if special_match(danger_types):
                            self.subs_params_dict[state_code] = set(danger_types)
                        else:
                            print('Invalid danger type')
                    else:
                        print('Filters already defined for state', state_code)
                else:
                    print('Invalid state code')
            elif len(params) != 0:
                print('Invalid number of arguments')

        self.make_subs_request_message()

    def handle_alert(self, alert):
        alert_string = ' '.join(
            ['\nNEW ALERT:', DangerType.Name(alert.dangerType) + '!', 'State:', alert.stateName, '\n'])
        cities_string = ''
        for city_level in alert.affectedCities:
            cities_string = ' '.join([cities_string, '  City: ', city_level.cityName + ';', 'Severity level: ',
                                      SeverityLevel.Name(city_level.severityLevel)]) + '\n'
        logging.info(alert_string + cities_string)

    def run(self):
        logging.info('Starting alert client...')
        with grpc.insecure_channel(
                target='localhost:50051',
                options=[('grpc.keepalive_time_ms', 30000)]) as channel:
            stub = AlertServiceStub(channel)
            reconnection_time = 3.0
            while True:
                try:
                    if not self.available_codes:
                        codes = stub.GetCodes(Empty())

                        for code in codes.stateCodes:
                            self.available_codes.add(code)

                        self.define_subscription()

                    for alert in stub.GetAlerts(self.subs_params_message):
                        self.handle_alert(alert)
                        reconnection_time = 1.0

                except grpc.RpcError:
                    reconnection_time *= 1 + randint(1, 10) / 100
                    logging.warning('Attempting reconnection after {:.2f} s...'.format(reconnection_time))
                    sleep(reconnection_time)


if __name__ == '__main__':
    try:
        logging.basicConfig(format='%(asctime)s %(message)s', datefmt='%m/%d/%Y %H:%M:%S', level=logging.DEBUG)
        alert_client = AlertClient()
        alert_client.run()
    except KeyboardInterrupt:
        print('Alert client shut down')
        try:
            sys.exit(0)
        except SystemExit:
            os._exit(0)
