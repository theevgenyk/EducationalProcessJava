package ru.kuzn.figures;

    /**
     * Класс для вычисления площади треугольников, прямоугольника, квадрата
     * @author Evgeny Kuznetsov
     */
public abstract class Figure {

    double sideA;
    double sideB;

    /**
     * Абстрактный метод выводит результат вычислений
      */
    abstract void output();

        /**
         * Абстрактный метод вычисляет площадь фигур
          * @return возвращает площадь фигуры
         */
    abstract double square();

    Figure(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    Figure(double sideA){
        this(sideA, sideA);
    }
    Figure(){
        this(1);
    }
}
