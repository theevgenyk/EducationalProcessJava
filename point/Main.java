package ru.kuznetsov;

/**
 * Created by Evgeny.
 */
public class Main {
    public static void main(String[] args) {
        Point a = new Point('A', 2, 4);
        Point b = new Point('B',2, 6);
        System.out.println(a);
        a.whichPart();
        System.out.println(b);
        b.whichPart();
        System.out.println(a.howLong(b));
    }
}