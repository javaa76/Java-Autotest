package task47part4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int num = nextInt(101010);
        System.out.println("Число: " + num + " четное? - " + isPrime(num));
    }

    static int nextInt(int x) {
        Random number = new Random();
        return number.nextInt(x);
    }

    static boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num);i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
