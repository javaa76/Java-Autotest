package task31part2;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("Значения до изменений: a = "+ a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Значения после изменений: a = "+ a + " b = " + b);
    }
}
