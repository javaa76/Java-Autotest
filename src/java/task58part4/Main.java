package task58part4;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[20];
        System.out.println("Вывод:");
        fillArray(a, 1, 20);
        medianArray(a);
        System.out.print("Повторный вывод исходного массива: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    static void fillArray(int[] a, int from, int to) {
        Random numRand = new Random();
        System.out.print("Создан массив: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = numRand.nextInt(from, to);
            System.out.print(a[i] + " ");
        }
    }

    static void medianArray(int[] a) {
        int[] b = a.clone();
        Arrays.sort(b);
        if (b.length % 2 == 1)
            System.out.println("\nМедиана: " + b[b.length/2]);
        else if (b.length % 2 == 0) {
            System.out.println("\nМедиана: " + (double)(b[b.length/2 - 1] + b[b.length/2])/2);
        }
    }
}
