package model;

import java.util.List;

public class State {
    private String stateName;
    private String stateCode;
    private List<String> cities;

    public State(String stateName, String stateCode, List<String> cities) {
        this.stateName = stateName;
        this.stateCode = stateCode;
        this.cities = cities;
    }

    public String getStateName() {
        return stateName;
    }

    public String getStateCode() {
        return stateCode;
    }

    public List<String> getCities() {
        return cities;
    }
}
