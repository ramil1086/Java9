package ru.gb.task3;

public class Round implements Figure{
    private int radius;

    public Round(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw Round");
    }
}
