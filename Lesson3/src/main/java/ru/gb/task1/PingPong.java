package ru.gb.task1;

public class PingPong {
    private volatile boolean pingPongValue;

    {
        new Thread(() -> {
            while (true) {
                try {
                    if (!pingPongValue) System.out.println("Ping");
                    else System.out.println("Pong");
                    Thread.sleep(1000);
                    pingPongValue = !pingPongValue;
                } catch (InterruptedException e) {}
            } }).start();
    }

}
