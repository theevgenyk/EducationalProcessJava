package ru.kuznetsov;

/**
 * Created by Evgeny on 07.11.2015.
 */
public class EggVoice extends Thread {
    @Override
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {

            System.out.println("яйцо!");
        }
    }
}
