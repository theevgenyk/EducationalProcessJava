package ru.kuzn.figures;

/**
 * Created by Evgeny on 08.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,3);
        Rectangle rectangle1 = new Rectangle(5);
        Rectangle rectangle2 = new Rectangle();
        Triangle triangle = new Triangle(4,4);
        Triangle triangle1 = new Triangle(2);
        Triangle triangle2 = new Triangle();
        rectangle.output();
        rectangle1.output();
        rectangle2.output();
        triangle.output();
        triangle1.output();
        triangle2.output();
    }
}
