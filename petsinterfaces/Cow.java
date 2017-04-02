package ru.kuznetsov;

/**
 * Created by Evgeny on 13.10.2015.
 */
public class Cow  implements Pets{
    @Override
    public void talk() {
        System.out.println("Мууууууууу!");
    }

    @Override
    public void name() {
        System.out.println("Корова");
    }
}
