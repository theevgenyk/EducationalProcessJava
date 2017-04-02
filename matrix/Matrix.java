package ru.kuzn;

/**
 * Created by Evgeny on 01.10.2015.
 */
import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] arr = new int[6][];
        int lengthOfRow;
        for(int j=0; j<6;j++) {
            lengthOfRow = rand.nextInt(7);
            arr[j] = new int[lengthOfRow];
            for (int i = 0; i < lengthOfRow; i++) {
                arr[j][i]=rand.nextInt(28);
                System.out.print(arr[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
