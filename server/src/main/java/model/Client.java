package model;

import io.grpc.stub.StreamObserver;
import sr.grpc.gen.Alert;
import sr.grpc.gen.SubscriptionParams;

import java.util.Objects;

public class Client {
    private SubscriptionParams request;
    private StreamObserver<Alert> responseObserver;

    public Client(SubscriptionParams request, StreamObserver<Alert> responseObserver) {
        this.request = request;
        this.responseObserver = responseObserver;
    }

    public SubscriptionParams getRequest() {
        return request;
    }

    public StreamObserver<Alert> getResponseObserver() {
        return responseObserver;
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
