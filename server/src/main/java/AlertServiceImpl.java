import io.grpc.stub.ServerCallStreamObserver;
import io.grpc.stub.StreamObserver;
import model.State;
import sr.grpc.gen.*;
import sr.grpc.gen.AlertServiceGrpc.AlertServiceImplBase;

public class AlertServiceImpl extends AlertServiceImplBase {

    private final AlertServer alertServer;

    public AlertServiceImpl(AlertServer alertServer) {
        this.alertServer = alertServer;
    }

    @Override
    public void getCodes(Empty request, StreamObserver<StateCodes> responseObserver) {
        System.out.println("Got state codes request");

        StateCodes.Builder stateCodesBuilder = StateCodes.newBuilder();

        for (State s : alertServer.getStates()) {
            stateCodesBuilder.addStateCodes(s.getStateCode());

        }
        StateCodes stateCodes = stateCodesBuilder.build();

        responseObserver.onNext(stateCodes);
        responseObserver.onCompleted();
    }

    @Override
    public void getAlerts(SubscriptionParams request, StreamObserver<Alert> responseObserver) {

        System.out.println("Started new subscription");
        ServerCallStreamObserver<Alert> obs = (ServerCallStreamObserver<Alert>) responseObserver;

        obs.setOnCancelHandler(() -> {
            System.err.println();
            System.out.println("Client cancelled");
        });


        Alert alert = Alert.newBuilder().build();

        obs.onNext(alert);
        obs.onNext(alert);
        obs.onNext(alert);

//        responseObserver.onCompleted();

    }
}
