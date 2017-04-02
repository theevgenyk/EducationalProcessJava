package ru.kuzn;

/**
 * Created by Evgeny on 03.10.2015.
 */
public class Horse extends Pet {

    @Override
    void move() {
        progress += 10;
        System.out.println("Скачет " + progress);
    }

    @Override
    void talk() {
        System.out.println("И-го-го!");
    }

    @Override
    void legs() {
        System.out.println("4 ноги.");
    }
}
