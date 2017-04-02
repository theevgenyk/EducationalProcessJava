package ru.kuznetsov;

/**
 * Created by Evgeny on 17.11.2015.
 */
public class Demo {
    public  static int count=0;
    static ChildThread first;
    static ChildThread second;

    public static void main(String[] args) {
        first = new ChildThread();
        second = new ChildThread();

        first.start();
        second.start();

        try {
            first.join();
            second.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
}
