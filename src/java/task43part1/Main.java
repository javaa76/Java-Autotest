package task43part1;

public class Main {
    public static void main(String[] args) {
        int max = 0;
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a > b) {
            if (c < a)
                max = a;
            else
                max = c;
        }
        else {
            if (c < b)
                max = b;
            else
                max = c;
        }

        System.out.println("Максимальное значение: " + max);
    }
}
