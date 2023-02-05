package task47part4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int num = nextInt(1010100);
            while (!isPrime(num))  {
                num = nextInt(1010100);
                System.out.println("iteration...");
            }
        System.out.println("Число: " + num + " простое");
    }

    static int nextInt(int x) {
        if (x <= 0) {
            System.out.println("Ну я так не играю - закругляемся!");
            System.exit(0);
        }
        Random number = new Random();
        return number.nextInt(x);
    }

    static boolean isPrime(int num) {
        if (num > 0) {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0)
                    return false;
            }
        }
        return true;
    }
}
