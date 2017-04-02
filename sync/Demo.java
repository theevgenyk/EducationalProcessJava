package ru.kuznetsov;

/**
 * Created by Evgeny
 */
public class Demo extends Thread {
    private static boolean ready = false;
    private final Object waitObject;
    public static int count;
    public String name;

    public Demo(Object waitObject, String name){
        this.waitObject=waitObject;
        setName(name);
    }
    public static void firstThreadIncrement(Object waitObject, String name){
        synchronized (waitObject) {
            count++;
            System.out.println(name + count);
            ready = true;
            waitObject.notifyAll();
            while (ready) {
                try {
                    waitObject.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void secondThreadIncrement(Object waitObject, String name){
        synchronized (waitObject) {
            while (!ready) {
                try {
                    waitObject.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count++;
            System.out.println(name + count);
            ready = false;
            waitObject.notifyAll();
        }
    }

    public void run(){
        for(int j=0; j < 100; j++) {
            name=getName();
            if(name.compareTo("firstThread ") == 0 ) {
                firstThreadIncrement(waitObject, getName());
            }
            if(name.compareTo("secondThread ") == 0 ){
                secondThreadIncrement(waitObject, getName());
            }
        }
    }
}