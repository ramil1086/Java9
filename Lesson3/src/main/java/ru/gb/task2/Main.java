package ru.gb.task2;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " started");
                c.increaseCounter();
                System.out.println(Thread.currentThread().getName() + " increased Counter to " + c.getCounter());
            }).start();
        }
    }
}
