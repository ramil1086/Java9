package ru.gb.task2;

abstract class Car implements Moveable {
    public IEngine engine;
    private String color;
    private String name;

    public Car() {
    }

    public Car(IEngine engine, String color, String name) {
        this.engine = engine;
        this.color = color;
        this.name = name;
    }

    protected void start() {
        System.out.println("Car starting");
    }

    abstract void open();

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
