package ru.kuzn;

/**
 * Created by Evgeny on 03.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Cat matilda = new Cat();
        Horse flash = new Horse();
        Snake agusha = new Snake();
        Frog kvaker = new Frog();
        matilda.move();
        matilda.talk();
        matilda.move();
        matilda.legs();
        flash.move();
        flash.talk();
        flash.move();
        flash.legs();
        agusha.talk();
        agusha.move();
        agusha.legs();
        kvaker.talk();
        kvaker.move();
        kvaker.legs();
    }
}
