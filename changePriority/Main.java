package ru.kuznetsov;

/**
 * Created by Evgeny
 */
public class Main {
    public static void main(String args[]) {
        Demo normThread = new Demo();
        normThread.setName("Поток с нормальным приоритетом ");

        Demo minThread = new Demo();
        minThread.setName("Поток с минимальным приоритетом ");

        normThread.setPriority(Thread.NORM_PRIORITY);
        minThread.setPriority(Thread.MIN_PRIORITY);

        normThread.start();
        minThread.start();

    }
}
