package ru.gb.task3;

public class Triangle implements Figure{
    private int setLeftSideLength;
    private int setRightSideLength;

    public Triangle(int setLeftSideLength, int setRightSideLength) {
        this.setLeftSideLength = setLeftSideLength;
        this.setRightSideLength = setRightSideLength;
    }

    @Override
    public void draw() {
        System.out.println("Draw Triangle");
    }
}
