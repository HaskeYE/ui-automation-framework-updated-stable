package main;

import java.util.HashMap;

public class ScenarioContext {
    private HashMap<String, Object> testDataStorage;

    ScenarioContext() {
        testDataStorage = new HashMap<>();
    }

    public <T> T get(String key) {
        return (T) testDataStorage.get(key);
    }

    public void put(String key, Object value) {
        testDataStorage.put(key, value);}

    public void remove(String key) {
        testDataStorage.remove(key);
    }

    public void removeAll() {
        testDataStorage.clear();
    }
}
