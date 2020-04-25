import io.grpc.stub.ServerCallStreamObserver;
import io.grpc.stub.StreamObserver;
import model.Client;
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
        AlertServer.logger.info("Got state codes request\n");

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
        ServerCallStreamObserver<Alert> obs = (ServerCallStreamObserver<Alert>) responseObserver;

        Client client = new Client(request, responseObserver);

        obs.setOnCancelHandler(() -> {
            alertServer.getClients().remove(client);
            AlertServer.logger.info("Client disconnected\n");
        });

        alertServer.getClients().add(client);
        AlertServer.logger.info("Started new subscription\n");
    }
}
