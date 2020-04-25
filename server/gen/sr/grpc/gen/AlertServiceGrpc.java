package sr.grpc.gen;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.27.0)",
    comments = "Source: danger-alert.proto")
public final class AlertServiceGrpc {

  private AlertServiceGrpc() {}

  public static final String SERVICE_NAME = "alert.AlertService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sr.grpc.gen.Empty,
      sr.grpc.gen.StateCodes> getGetCodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCodes",
      requestType = sr.grpc.gen.Empty.class,
      responseType = sr.grpc.gen.StateCodes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sr.grpc.gen.Empty,
      sr.grpc.gen.StateCodes> getGetCodesMethod() {
    io.grpc.MethodDescriptor<sr.grpc.gen.Empty, sr.grpc.gen.StateCodes> getGetCodesMethod;
    if ((getGetCodesMethod = AlertServiceGrpc.getGetCodesMethod) == null) {
      synchronized (AlertServiceGrpc.class) {
        if ((getGetCodesMethod = AlertServiceGrpc.getGetCodesMethod) == null) {
          AlertServiceGrpc.getGetCodesMethod = getGetCodesMethod =
              io.grpc.MethodDescriptor.<sr.grpc.gen.Empty, sr.grpc.gen.StateCodes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sr.grpc.gen.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sr.grpc.gen.StateCodes.getDefaultInstance()))
              .setSchemaDescriptor(new AlertServiceMethodDescriptorSupplier("GetCodes"))
              .build();
        }
      }
    }
    return getGetCodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sr.grpc.gen.SubscriptionParams,
      sr.grpc.gen.Alert> getGetAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAlerts",
      requestType = sr.grpc.gen.SubscriptionParams.class,
      responseType = sr.grpc.gen.Alert.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sr.grpc.gen.SubscriptionParams,
      sr.grpc.gen.Alert> getGetAlertsMethod() {
    io.grpc.MethodDescriptor<sr.grpc.gen.SubscriptionParams, sr.grpc.gen.Alert> getGetAlertsMethod;
    if ((getGetAlertsMethod = AlertServiceGrpc.getGetAlertsMethod) == null) {
      synchronized (AlertServiceGrpc.class) {
        if ((getGetAlertsMethod = AlertServiceGrpc.getGetAlertsMethod) == null) {
          AlertServiceGrpc.getGetAlertsMethod = getGetAlertsMethod =
              io.grpc.MethodDescriptor.<sr.grpc.gen.SubscriptionParams, sr.grpc.gen.Alert>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sr.grpc.gen.SubscriptionParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sr.grpc.gen.Alert.getDefaultInstance()))
              .setSchemaDescriptor(new AlertServiceMethodDescriptorSupplier("GetAlerts"))
              .build();
        }
      }
    }
    return getGetAlertsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AlertServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlertServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlertServiceStub>() {
        @java.lang.Override
        public AlertServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlertServiceStub(channel, callOptions);
        }
      };
    return AlertServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlertServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlertServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlertServiceBlockingStub>() {
        @java.lang.Override
        public AlertServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlertServiceBlockingStub(channel, callOptions);
        }
      };
    return AlertServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AlertServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlertServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlertServiceFutureStub>() {
        @java.lang.Override
        public AlertServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlertServiceFutureStub(channel, callOptions);
        }
      };
    return AlertServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AlertServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCodes(sr.grpc.gen.Empty request,
        io.grpc.stub.StreamObserver<sr.grpc.gen.StateCodes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCodesMethod(), responseObserver);
    }

    /**
     */
    public void getAlerts(sr.grpc.gen.SubscriptionParams request,
        io.grpc.stub.StreamObserver<sr.grpc.gen.Alert> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAlertsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCodesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sr.grpc.gen.Empty,
                sr.grpc.gen.StateCodes>(
                  this, METHODID_GET_CODES)))
          .addMethod(
            getGetAlertsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                sr.grpc.gen.SubscriptionParams,
                sr.grpc.gen.Alert>(
                  this, METHODID_GET_ALERTS)))
          .build();
    }
  }

  /**
   */
  public static final class AlertServiceStub extends io.grpc.stub.AbstractAsyncStub<AlertServiceStub> {
    private AlertServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlertServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCodes(sr.grpc.gen.Empty request,
        io.grpc.stub.StreamObserver<sr.grpc.gen.StateCodes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAlerts(sr.grpc.gen.SubscriptionParams request,
        io.grpc.stub.StreamObserver<sr.grpc.gen.Alert> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAlertsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AlertServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AlertServiceBlockingStub> {
    private AlertServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlertServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sr.grpc.gen.StateCodes getCodes(sr.grpc.gen.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetCodesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<sr.grpc.gen.Alert> getAlerts(
        sr.grpc.gen.SubscriptionParams request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAlertsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AlertServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AlertServiceFutureStub> {
    private AlertServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlertServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sr.grpc.gen.StateCodes> getCodes(
        sr.grpc.gen.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCodesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CODES = 0;
  private static final int METHODID_GET_ALERTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlertServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AlertServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CODES:
          serviceImpl.getCodes((sr.grpc.gen.Empty) request,
              (io.grpc.stub.StreamObserver<sr.grpc.gen.StateCodes>) responseObserver);
          break;
        case METHODID_GET_ALERTS:
          serviceImpl.getAlerts((sr.grpc.gen.SubscriptionParams) request,
              (io.grpc.stub.StreamObserver<sr.grpc.gen.Alert>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AlertServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AlertServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sr.grpc.gen.DangerAlert.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AlertService");
    }
  }

  private static final class AlertServiceFileDescriptorSupplier
      extends AlertServiceBaseDescriptorSupplier {
    AlertServiceFileDescriptorSupplier() {}
  }

  private static final class AlertServiceMethodDescriptorSupplier
      extends AlertServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AlertServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AlertServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AlertServiceFileDescriptorSupplier())
              .addMethod(getGetCodesMethod())
              .addMethod(getGetAlertsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
