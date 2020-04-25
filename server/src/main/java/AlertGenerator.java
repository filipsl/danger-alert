import model.State;
import sr.grpc.gen.Alert;
import sr.grpc.gen.DangerType;
import sr.grpc.gen.SeverityLevel;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AlertGenerator {
    private List<State> states;

    public AlertGenerator(List<State> states) {
        this.states = states;
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

        int n = Math.max(rand.nextInt(state.getCities().size()+1), 1);
        for (int i = 0; i < n; i++) {
            Alert.CityLevel cityLevel = Alert.CityLevel.newBuilder()
                    .setCityName(state.getCities().get(i))
                    .setSeverityLevel(SeverityLevel.forNumber(rand.nextInt(3)))
                    .build();
            alertBuilder.addAffectedCities(cityLevel);
        }
        return alertBuilder.build();
    }
}
