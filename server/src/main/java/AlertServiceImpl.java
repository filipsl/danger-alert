import io.grpc.stub.StreamObserver;
import sr.grpc.gen.Alert;
import sr.grpc.gen.AlertServiceGrpc.AlertServiceImplBase;
import sr.grpc.gen.Empty;
import sr.grpc.gen.StateCodes;
import sr.grpc.gen.SubscriptionParams;

public class AlertServiceImpl extends AlertServiceImplBase {

    @Override
    public void getCodes(Empty request, StreamObserver<StateCodes> responseObserver) {
        System.out.println("Got Codes Request");
        StateCodes stateCodes = StateCodes.newBuilder().addStateCodes("OR").addStateCodes("NY").build();
        responseObserver.onNext(stateCodes);
        responseObserver.onCompleted();
    }

    @Override
    public void getAlerts(SubscriptionParams request, StreamObserver<Alert> responseObserver) {
        super.getAlerts(request, responseObserver);
    }
}
