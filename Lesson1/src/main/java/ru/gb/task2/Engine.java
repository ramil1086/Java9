package ru.gb.task2;

public class Engine implements IEngine {
    private String engineName;

    public Engine(String engineName) {
        this.engineName = engineName;
    }

    public String getEngineName() {
        return engineName;
    }
}
