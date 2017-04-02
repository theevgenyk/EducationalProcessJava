package ru.kuznetsov;

/**
 * Created by Evgeny.
 */
public class Point {
    private char name;
    private double x;
    private double y;

    public Point(char name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Point{" +
                "name=" + name +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    /**Метод возвращает расстояние от текущего объекта
     *до объекта b типа Point
     */

    public double howLong(Point b){
        double dx = (x - b.getX()) * (x-b.getX());
        double dy = (y - b.getY()) * (y-b.getY());
        return Math.sqrt(dx + dy);
    }

    public void whichPart(){
        if(x > 0 && y > 0){
            System.out.print("1 четверть\n");
        }
        if (x > 0 && y < 0){
            System.out.print("3 четверть\n");
        }
        if (x < 0 && y > 0){
            System.out.print("2 четверть\n");
        }
        if (x < 0 && y < 0){
            System.out.print("4 четверть\n");
        }
        if (x==0){
            System.out.print("Точка на оси X\n");
        }
        if(y==0){
            System.out.print("Точка на оси Y\n");
        }
    }
}
