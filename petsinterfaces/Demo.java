package ru.kuznetsov;

/**
 * Created by Evgeny on 13.10.2015.
 */
public class Demo {
    public static void main(String[] args) {
        Dog bobik = new Dog();
        Cat vasiliska = new Cat();
        Cow zorka = new Cow();
        Chicken ciplenok = new Chicken();

        bobik.name();
        bobik.talk();
        vasiliska.name();
        vasiliska.talk();
        zorka.name();
        zorka.talk();
        ciplenok.name();
        ciplenok.talk();
    }
}
