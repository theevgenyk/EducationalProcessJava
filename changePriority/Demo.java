package ru.kuznetsov;

/**
 * Created by Evgeny
 */
public class Demo extends Thread {

    public int count;
    public synchronized void increment(String name){
        count++;
        System.out.println(name+count);
    }

    public void run() {
        for (int j = 0; j < 30; j++) {
            increment(getName());
        }
    }

}