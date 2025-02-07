# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import danger_alert_pb2 as danger__alert__pb2


class AlertServiceStub(object):
    """Missing associated documentation comment in .proto file"""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.GetCodes = channel.unary_unary(
                '/alert.AlertService/GetCodes',
                request_serializer=danger__alert__pb2.Empty.SerializeToString,
                response_deserializer=danger__alert__pb2.StateCodes.FromString,
                )
        self.GetAlerts = channel.unary_stream(
                '/alert.AlertService/GetAlerts',
                request_serializer=danger__alert__pb2.SubscriptionParams.SerializeToString,
                response_deserializer=danger__alert__pb2.Alert.FromString,
                )


class AlertServiceServicer(object):
    """Missing associated documentation comment in .proto file"""

    def GetCodes(self, request, context):
        """Missing associated documentation comment in .proto file"""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetAlerts(self, request, context):
        """Missing associated documentation comment in .proto file"""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_AlertServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'GetCodes': grpc.unary_unary_rpc_method_handler(
                    servicer.GetCodes,
                    request_deserializer=danger__alert__pb2.Empty.FromString,
                    response_serializer=danger__alert__pb2.StateCodes.SerializeToString,
            ),
            'GetAlerts': grpc.unary_stream_rpc_method_handler(
                    servicer.GetAlerts,
                    request_deserializer=danger__alert__pb2.SubscriptionParams.FromString,
                    response_serializer=danger__alert__pb2.Alert.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'alert.AlertService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class AlertService(object):
    """Missing associated documentation comment in .proto file"""

    @staticmethod
    def GetCodes(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/alert.AlertService/GetCodes',
            danger__alert__pb2.Empty.SerializeToString,
            danger__alert__pb2.StateCodes.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetAlerts(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(request, target, '/alert.AlertService/GetAlerts',
            danger__alert__pb2.SubscriptionParams.SerializeToString,
            danger__alert__pb2.Alert.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)
