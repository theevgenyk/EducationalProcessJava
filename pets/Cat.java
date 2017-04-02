package ru.kuzn;

/**
 * Created by Evgeny on 03.10.2015.
 */
public class Cat extends Pet {

    @Override
    void move() {
        System.out.println("Крадется " + ++progress);
    }

    @Override
    void talk() {
        System.out.println("Мяу-мяу!");
    }

    @Override
    void legs() {
        System.out.println("4 лапки.");
    }
}
