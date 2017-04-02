package ru.kuzn.figures;

/**
 * Created by Evgeny on 08.10.2015.
 */
public class Triangle extends Figure{
    /**
     * Конструктор для треугольника с разными катетами
     *
     * @param sideA одна из сторон треугольника
     * @param sideB другая сторона треугольника
     */
    public Triangle(double sideA, double sideB){
        super(sideA, sideB);
    }

    /**
     * Конструктор для треугольника с равными катетами
     *
     * @param sideA стороная треугольнки
     */
    public Triangle(double sideA){
        super(sideA);
    }

    /**
     * Конструктор по умолчанию для треугольника, сторона которого равна 1
     */
    public Triangle(){
        super();
    }

    @Override
    void output() {
        System.out.println("Площадь треугольника: " + square());
    }

    @Override
    double square() {
        return (sideA*sideB)/2;
    }
}
