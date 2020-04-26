import io.grpc.Server;
import io.grpc.ServerBuilder;
import model.Client;
import model.State;
import sr.grpc.gen.Alert;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Logger;

public class AlertServer {

    public static final Logger logger = Logger.getLogger(AlertServer.class.getName());

    private int port = 50051;
    private Server server;
    private List<State> states = new LinkedList<>();
    private List<Client> clients = new CopyOnWriteArrayList<>();
    private AlertGenerator alertGenerator;

    private void start() throws IOException {

        setStates();
        alertGenerator = new AlertGenerator(states);
        server = ServerBuilder.forPort(port)
                .addService(new AlertServiceImpl(this))
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            AlertServer.this.stop();
            System.err.println("Alert server shut down");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
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

    public void printAvailableStates() {
        System.out.println("Alerts available for selected states:");
        for (State state : states) {
            System.out.println(" " + state.getStateName());
        }
    }

    public void sendAlerts() throws InterruptedException {
        Random rand = new Random();

        while (true) {
            Alert alert = this.alertGenerator.generateAlert();
            Thread.sleep(((rand.nextInt(2) + 1) * 1000));
            logger.info("New alert generated\n" + "   state: " + alert.getStateName()
                    + "; type: " + alert.getDangerType() + "\n");
            for (Client c : clients) {
                if (c.acceptsAlert(alert)) {
                    c.getResponseObserver().onNext(alert);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final AlertServer server = new AlertServer();
        server.start();
        server.printAvailableStates();
        server.sendAlerts();
    }
}
