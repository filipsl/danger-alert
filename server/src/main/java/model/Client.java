package model;

import io.grpc.stub.StreamObserver;
import sr.grpc.gen.Alert;
import sr.grpc.gen.StateAlertFilter;
import sr.grpc.gen.SubscriptionParams;

import java.util.Objects;

public class Client {
    private SubscriptionParams request;
    private StreamObserver<Alert> responseObserver;

    public Client(SubscriptionParams request, StreamObserver<Alert> responseObserver) {
        this.request = request;
        this.responseObserver = responseObserver;
    }

    public StreamObserver<Alert> getResponseObserver() {
        return responseObserver;
    }

    public boolean acceptsAlert(Alert alert) {
        for (StateAlertFilter alertFilter : request.getAlertFiltersList()) {
            if (alert.getStateCode().equals(alertFilter.getStateCode())) {
                if (alertFilter.getDangerTypesList().contains(alert.getDangerType()))
                    return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return Objects.equals(request, client.request) &&
                Objects.equals(responseObserver, client.responseObserver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(request, responseObserver);
    }
}
