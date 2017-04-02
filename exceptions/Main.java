package ru.kuzn;

/**
 * Created by Evgeny
 */
public class Main {
    public static void main (String[] argc){
        Circle A = new Circle ();
        Circle B = new Circle ();
        A.input();
        B.input();
        A.printCircle();
        B.printCircle();
        System.out.println("Площдь окружности A = " + A.area());
        System.out.println("Длина круга A = " + A.length());
        System.out.println("Площдь окружности B = " + B.area());
        System.out.println("Длина круга B = " + B.length());
        A.equalsArea(B);
        System.out.println("Расстояние между центрами окружностей = " + A.howLong(B));
        A.move();
        B.move();
        A.printCircle();
        B.printCircle();

    }
}
