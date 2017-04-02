package ru.kuzn;

/**
 * Created by Evgeny on 08.10.2015.
 */
public class Snake extends Pet {
    @Override
    void move() {
        System.out.println("Ползает");
    }

    @Override
    void talk() {
        System.out.println("Ш-ш-ш-ш!");
    }

    @Override
    void legs() {
        System.out.println("Ног нету:(");
    }
}
