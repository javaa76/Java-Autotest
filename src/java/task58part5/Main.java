package task58part5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] zubMas = new int[rand.nextInt(1, 5)][]; // Не более 5 строк
        for (int i = 0; i < zubMas.length; i++) zubMas[i] = fillArray();

        Arrays.stream(zubMas).sorted((arr1,arr2) -> sumArray(arr2) - sumArray(arr1)).
                forEach(mas -> System.out.println(Arrays.toString(mas)));
    }

    static int[] fillArray() {
        Random numRand = new Random();
        int[] a = new int[numRand.nextInt(1, 8)];
        for (int i = 0; i < a.length; i++) {
            a[i] = numRand.nextInt(-9, 10);
        }
        return a;
    }

    static int sumArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum;
    }
}

