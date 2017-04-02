package ru.kuznetsov;

/**
 * Created by Evgeny on 13.10.2015.
 */
public class Chicken implements Pets{
    @Override
    public void talk() {
        System.out.println("Свободная касса!");
    }

    @Override
    public void name() {
        System.out.println("Курочка");
    }
}
