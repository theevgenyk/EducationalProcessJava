package ru.kuznetsov;

/**
 * Created by Evgeny on 13.10.2015.
 */
public class Cat implements Pets{

    @Override
    public void talk() {
        System.out.println("Мяу-мяу!");
    }

    @Override
    public void name() {
        System.out.println("Кот");
    }
}