package ru.gb.task3;

public class Rectangle implements Figure {
    private int lengthLongSide;
    private int lengthShortSide;

    public Rectangle(int lengthLongSide, int lengthShortSide) {
        this.lengthLongSide = lengthLongSide;
        this.lengthShortSide = lengthShortSide;
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
