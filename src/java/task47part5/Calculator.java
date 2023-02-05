package task47part5;

public class Calculator {
    static int add(int x, int y) { return x + y; }
    static int sub(int x, int y) {
        return x - y;
    }
    static int mul(int x, int y) {
        return x * y;
    }
    static int divide(int x, int y) {
        if (y == 0) {
            System.out.println("В школе не учили? На ноль - 0 - делить нельзя! Программа завершается!");
            System.exit(0);
        }
        return x / y;
    }
}
