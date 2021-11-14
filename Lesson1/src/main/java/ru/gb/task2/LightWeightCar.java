package ru.gb.task2;

class LightWeightCar extends Car {
    @Override
    void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        // реализация
    }
}
