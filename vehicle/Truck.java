package com.vehicle;

/**
 * Класс для представления Грузовика
 *
 * @author Evgeny Kuznetsov
 */

public class Truck extends Car {
    private int loadCapacity;

    /**
     *
     * @param loadCapacity Максимальная грузоподъёмность
     */
    public Truck(int loadCapacity){
        super(190, 1);
        this.loadCapacity = loadCapacity;
    }

    /**
     * Метод для вывода сообщения
     */
    public void Message(){
        super.Message();
        System.out.println("This is a message from Truck class");
    }


    public String toString() {
        return "Truck: " + super.toString() + ", Load capacity: " + this.loadCapacity;
    }
}
