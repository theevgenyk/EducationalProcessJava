package ru.kuznetsov;
import java.util.Scanner;


/**
 * Created by Evgeny.
 */

public class Hospital {
    public static void main(String argc[]) {

        int numberOfPatients = input();
        double patients[]=initialize(numberOfPatients);

        System.out.print("Исходный массив температур пациентов:");
        output(patients);
        averageTemperature(patients);
        minTemperature(patients);
        maxTemperature(patients);
        bubbleSort(patients);
        System.out.print("\nОтсортированный массив по возрастанию ");
        output(patients);
    }
    //Ввод размера массива
    public static int input() {
        Scanner reader = new Scanner(System.in);
        int numberOfPatients;
        System.out.println("Введите количество пациентов");
        numberOfPatients = reader.nextInt();
        return numberOfPatients;

    }
    //Заполнение массива
    public static double[] initialize ( int numberOfPatients){
        double patients[] = new double [numberOfPatients];
        for (int i=0; i< numberOfPatients; i++ ) {
            patients[i] = 35 + (Math.random() * 6);
        }
        return patients;
    }
    //Вывод массива
    public static void output(double patients[]){
        for(int i=0; i<patients.length; i++){
            System.out.printf(" '%4.1f' ", patients[i]);
        }
    }
    //Вычисление среднего арифметического
    public static void averageTemperature(double patients[]){
        double sum=0;
        for (int i=0; i < patients.length; i++){
            sum=sum+patients[i];
        }
        System.out.print("\nСредняя температура ");
        System.out.printf("'%4.1f'", sum / patients.length);
    }

    //Вычисление минимального элемента массива
    public static void minTemperature(double patients[]){
        double min=patients[0];
        for (int j=1; j<patients.length; j++){
            if(patients[j]<min)
                min=patients[j];
        }
        System.out.print("\nМинимальная температура ");
        System.out.printf("'%4.1f'", min);
    }

    //Вычисление максимального элемента массива
    public static void maxTemperature(double patients[]){
        double max=patients[0];
        for (int j=1; j<patients.length; j++){
            if(patients[j]>max)
                max=patients[j];
        }
        System.out.print("\nМаксимальная температура ");
        System.out.printf("'%4.1f'", max);

    }
    //Сортировка по возрастанию
    public static void bubbleSort(double[] patients) {
        for (int i = 0; i < patients.length; i++) {
            for (int j = 0; j < patients.length - i - 1; j++) {
                if (patients[j] > patients[j + 1]) {
                    double t = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = t;
                }
            }
        }
    }
}






