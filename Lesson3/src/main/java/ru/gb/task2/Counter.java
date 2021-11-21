package ru.gb.task2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int counter = 0;
    private Lock lock = new ReentrantLock();

    public int getCounter() {
        return counter;
    }

    public void increaseCounter() {
        lock.lock();
        counter++;
        lock.unlock();
    }
}
