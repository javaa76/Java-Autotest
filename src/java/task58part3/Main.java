package task58part3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[20];
        fillArray(a);
        bubleSortArray(a);
    }

    static void fillArray(int[] a) {
        Random numRand = new Random();
        System.out.print("       Исходный массив: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = numRand.nextInt(-9, 10);
            System.out.print(a[i] + " ");
        }
    }

    static void bubleSortArray(int[] a) {
        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for(int i = 0; i < a.length - 1; i++) {
                if(a[i] > a[i+1]) {
                    isSorted = false;
                    a[i] = a[i] + a[i+1];
                    a[i+1] = a[i] - a[i+1];
                    a[i] = a[i] - a[i+1];
                }
            }
        }
        System.out.print("\nОтсортированный массив: ");
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}