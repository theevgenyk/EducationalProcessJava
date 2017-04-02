package com.vehicle;

/**
 * Класс для представления Машины
 *
 * @author Evgeny Kuznetsov
 */

public class Car extends Vehicle {
    private int wheels;

    /**
     *
     * @param maxSpeed Максимальная скорость
     * @param numberOfWheels Количество колёс
     */
    public Car(int maxSpeed, int numberOfWheels) {
        super(1, maxSpeed);
        this.wheels = numberOfWheels;
    }

    /**
     * Метод для вывода сообщения
     */
    public void Message() {
        super.Message();
        System.out.println("This is a message from Car class");
    }

    public String toString() {
        return "Car: " + super.toString() + ", wheels: " + this.wheels;
    }
}