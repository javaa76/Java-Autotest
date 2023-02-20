package task58part1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[20];
        fillArray(a);
    }
    static void fillArray(int[] a) {
        Random numRand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = numRand.nextInt(-9, 10);
            System.out.print(a[i] + " ");
        }
    }
}
