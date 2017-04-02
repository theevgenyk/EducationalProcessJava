package ru.kuznetsov;

/**
 * Created by Evgeny
 */
public class Main {
    public static void main (String[] args) {

        Object waitObject = new Object();
        Demo firstThread = new Demo(waitObject, "firstThread ");
        Demo secondThread = new Demo(waitObject, "secondThread ");

        firstThread.start();
        secondThread.start();

        try{
            firstThread.join();
            secondThread.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Result " + Demo.count);
    }
}
