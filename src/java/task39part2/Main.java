package task39part2;

import task39part2.summa.Summa;

public class Main {
    public static void main(String[] args) {
        int a = 6, b = 5;
        double x = 0.5, y = 0.97, z = 1.16;
        Summa result = new Summa();

        System.out.println("(int, int), return int = " + result.sum(a, b));
        System.out.println("(double, double), return double = " + result.sum(z, y));
        System.out.println("(int, double, double), return double = " + result.sum(b, x, y));
        System.out.println("(int, Int, int), retrun double = " + result.sum(a, b, b));
        System.out.println("(double, double, double), return double = " + result.sum(x, y, z));
        System.out.println("(Integer, Integer), return double = " + result.sum(Integer.valueOf(a), Integer.valueOf(b)));
    }
}
