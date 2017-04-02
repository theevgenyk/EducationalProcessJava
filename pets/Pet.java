package ru.kuzn;

/**
 * Created by Evgeny on 03.10.2015.
 */
public abstract class Pet {
    protected int progress;

    /**
     *Абстрактный метод, который сообщает,
     * как животное двигается
     */
    abstract void move();
    /**
     *Абстрактный метод, который сообщает,
     * как животные разговаривают
     */
    abstract void talk();
    /**
     *Абстрактный метод, который сообщает,
     * сколько ног у животных
     */
    abstract void legs();
}
