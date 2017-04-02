package ru.kuzn.figures;

/**
 * Created by Evgeny on 08.10.2015.
 */
public class Rectangle extends Figure {
    /**
     * Конструктор для прямоугольника
     *
     * @param sideA одна из сторон прямоугольника
     * @param sideB другая сторона прямоугольника
     */
    public Rectangle(double sideA, double sideB){
        super(sideA,sideB);
    }

    /**
     * Конструктор для квадрата
     *
     * @param sideA сторона квадрата
     */
    public Rectangle (double sideA){
        super(sideA);
    }
    /**
     *Конструктор по умолчанию задает сторону фигуры равной 1
     */
    public Rectangle(){
        super();
    }

    @Override
    void output() {
        System.out.println("Площадь прямугольника: " + square());
    }

    @Override
    double square() {
        return sideA*sideB;
    }
}
