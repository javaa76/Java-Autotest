package task31part1;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("Значения до изменений: a = "+ a + " b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Значения после изменений: a = "+ a + " b = " + b);
    }
}
