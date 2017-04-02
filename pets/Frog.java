package ru.kuzn;

/**
 * Created by Evgeny on 08.10.2015.
 */
public class Frog extends Pet {

    @Override
    void move() {
        System.out.println("Прыгает");
    }

    @Override
    void talk() {
        System.out.println("Ква-ква!");
    }

    @Override
    void legs() {
        System.out.println("2 лапки.");
    }
}
