package com.vehicle;

/**
 * Класс для представления Самолёта
 *
 * @author Evgeny Kuznetsov
 */

public class Airplane extends Vehicle {
    private int maxHeight;
    private int numberOfSeats;

    /**
     * @param maxSpeed Максимальная скорость
     * @param maxHeight Максимальная высота
     * @param numberOfSeats Количество мест
     */
    public Airplane(int maxSpeed, int maxHeight, int numberOfSeats) {
        super(3, maxSpeed);
        this.maxHeight = maxHeight;
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * Метод для вывода сообщения
     */
    public void Message(){
        super.Message();
        System.out.println("This is a message from Airplane class");
    }

    public String toString() {
        return "Airplane: " + super.toString() + ", max height: " + this.maxHeight +", numberOfSeats: "+this.numberOfSeats;
    }

}