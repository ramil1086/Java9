package ru.gb.task2;

class Lorry extends Car {
    public void move() {
        System.out.println("Car is moving");
    }

    public void stop() {
        System.out.println("Car is stop");
    }

    @Override
    void open() {
// реализация
    }
}
