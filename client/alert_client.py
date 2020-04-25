import grpc
import re

from gen.danger_alert_pb2_grpc import AlertServiceStub
from gen.danger_alert_pb2 import DangerType, Empty, SubscriptionParams, StateAlertFilter

import logging


def special_match(strg, search=re.compile(r'[^FHEB]').search):
    return not bool(search(strg))


class AlertClient:
    def __init__(self):
        self.available_codes = set()
        self.subs_params = {}

    def define_subscription(self):
        print('State codes available for subscription:', list(self.available_codes), '\n')
        print('Define subscription: Enter state code and danger type filters')
        print('Danger types: F - flood, H - hurricane, E - earthquake, B - blizzard')
        print('For example: NY FHE')
        print('Leave field empty to finish configuration')
        text = ''

        while not self.subs_params or text:
            text = input("Enter new parameter: ")
            params = text.split()
            if len(params) == 2:
                state_code = params[0]
                danger_types = params[1]
                if state_code in self.available_codes:
                    if state_code not in self.subs_params:
                        if special_match(danger_types):
                            self.subs_params[state_code] = list(danger_types)
                        else:
                            print('Invalid danger type')
                    else:
                        print('Filters already defined for state', state_code)
                else:
                    print('Invalid state code')
            elif len(params) != 0:
                print('Invalid number of arguments')

        print(self.subs_params)

    def run(self):
        logging.info('Starting alert client...')
        with grpc.insecure_channel('localhost:50051') as channel:
            stub = AlertServiceStub(channel)

            logging.info('Requesting state codes available for subscription...')
            codes = stub.GetCodes(Empty())
            logging.info('Got available state codes!')

            for code in codes.stateCodes:
                self.available_codes.add(code)

            self.define_subscription()

            # sub_params = SubscriptionParams()
            # sub_params.alertFilters.append(StateAlertFilter())


if __name__ == '__main__':
    logging.basicConfig(format='%(asctime)s %(message)s', datefmt='%m/%d/%Y %H:%M:%S', level=logging.DEBUG)
    alert_client = AlertClient()
    alert_client.run()
