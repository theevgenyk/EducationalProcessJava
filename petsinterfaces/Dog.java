package ru.kuznetsov;

/**
 * Created by Evgeny on 13.10.2015.
 */
public class Dog implements Pets {
    @Override
    public void talk() {
        System.out.println("Гав-Гав!");
    }

    @Override
    public void name() {
        System.out.printf("Собака");
    }
}
