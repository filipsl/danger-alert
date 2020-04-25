import grpc

from gen.danger_alert_pb2_grpc import AlertServiceStub
from gen.danger_alert_pb2 import DangerType, Empty, SubscriptionParams, StateAlertFilter

import logging


class AlertClient:
    def __init__(self):
        self.available_codes = set()

    # def parse_input

    def run(self):
        with grpc.insecure_channel('localhost:50051') as channel:
            stub = AlertServiceStub(channel)
            codes = stub.GetCodes(Empty())

            for code in codes.stateCodes:
                self.available_codes.add(code)

            print(self.available_codes)
            print(DangerType.Name(DangerType.FLOOD))

            sub_params = SubscriptionParams()
            sub_params.alertFilters.append(StateAlertFilter())


if __name__ == '__main__':
    logging.basicConfig()
    alert_client = AlertClient()
    alert_client.run()
