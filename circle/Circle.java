package ru.kuzn;
import java.lang.Math;
import java.util.Scanner;


/**
 * Класс для представления окружности(круга)
 *
 * @author Evgeny
 */
public class Circle {
    private double x;
    private double y;
    private double r;

    /**
     * Метод позволяет ввести первоначальные данные( координаты центра окружности и радиус) с помощью клавиатуры
     *
     */
    public void input(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите координаты и радиус окружности ");
        System.out.println("x: ");
        x = reader.nextInt();
        System.out.println("y: ");
        y = reader.nextInt();
        System.out.println("r: ");
        r = reader.nextInt();
    }

    public Circle(double x, double y, double r){
        this.x=x;
        this.y=y;
        this.r=r;
    }

    public Circle(){
        this.x=0.0;
        this.y=0.0;
        this.r=1.0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    /**
     * Метод выводит данные об окружности
     */
    public void printCircle() {
        System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r);
    }

    /**
     * Метод рассчитывает площадь круга
     *
     * @return (area) Площадь круга
     */
    public double area (){
        double area = Math.PI*Math.pow(r,2);
        return area;
    }

    /**
     * Метод рассчитывает длину окружности
     *
     * @return (length) длина окружности
     */
    public double length(){
        double length = 2 * Math.PI * r;
        return length;
    }

    /**
     * Метод сравнивает площадь двух кругов
     *
     * @param B Второй круг
     */
    public void equalsArea(Circle B){
        if(this.area() == B.area()){
            System.out.println("Круги A и B имеют равную площадь ");
        }
        else {
            System.out.println("Круги A и B имеют различную площадь");
        }
    }

    /**
     * Метод перемещает центр окружности в случайную точку из диапазона ([-99;99],[-99;99])
     */
    public void move(){
        this.x=-99 + (int)(Math.random() * ((198)+1));
        this.y=-99 + (int)(Math.random() * ((198)+1));
    }

    /**
     * Метод находится расстояние между центрами окружностей и определяет касаются ли они
     *
     * @param B Вторая окружность
     * @return (d) - Расстояние между центрами окружностей
     */
    public double howLong(Circle B){
        double dX = (this.x - B.getX())*(this.x - B.getX());
        double dY = (this.y - B.getY())*(this.y - B.getY());
        double d = Math.sqrt(dX+dY);
        if ((d==this.r+B.r)||(d==this.r-B.r)){
            System.out.println("Окружности касаются");
        }
        else{
            System.out.println("Окружности не касаются");
        }
        return d;
    }
}
