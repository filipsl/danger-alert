import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import model.Client;
import model.State;
import sr.grpc.gen.Alert;
import sr.grpc.gen.AlertOrBuilder;
import sr.grpc.gen.DangerType;
import sr.grpc.gen.SeverityLevel;

import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;

public class AlertServer {

    private static final Logger logger = Logger.getLogger(AlertServer.class.getName());

    private int port = 50051;
    private Server server;
    private List<State> states = new LinkedList<>();
    private List<Client> clients = new LinkedList<>();

    private void start() throws IOException {

        setStates();

        server = ServerBuilder.forPort(port)
                .addService(new AlertServiceImpl(this))
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            // Use stderr here since the logger may have been reset by its JVM shutdown hook.
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            AlertServer.this.stop();
            System.err.println("*** server shut down");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    private void setStates() {
        State or = new State("Oregon", "OR", Arrays.asList("Eugene", "Portland", "New Port"));
        State ny = new State("New York", "NY", Arrays.asList("New York", "Albany", "Buffalo"));
        State wa = new State("Washington", "WY", Arrays.asList("Seattle", "Tacoma", "Redmond"));
        states.add(or);
        states.add(ny);
        states.add(wa);
    }

    public List<State> getStates() {
        return states;
    }

    public List<Client> getClients() {
        return clients;
    }

    public Alert generateAlert() {

        Random rand = new Random();

        Collections.shuffle(states);
        State state = states.get(0);

        Alert.Builder alertBuilder = Alert.newBuilder();
        alertBuilder.setStateName(state.getStateName());
        alertBuilder.setStateCode(state.getStateCode());
        alertBuilder.setDangerType(DangerType.forNumber(rand.nextInt(4)));

        Collections.shuffle(state.getCities());

        int n = Math.min(rand.nextInt(state.getCities().size()), 1);
        for (int i = 0; i < n; i++) {
            Alert.CityLevel cityLevel = Alert.CityLevel.newBuilder()
                    .setCityName(state.getCities().get(i))
                    .setSeverityLevel(SeverityLevel.forNumber(rand.nextInt(3)))
                    .build();
            alertBuilder.addAffectedCities(cityLevel);
        }

        return alertBuilder.build();
    }


    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        final AlertServer server = new AlertServer();
        server.start();
        server.blockUntilShutdown();
    }
}
