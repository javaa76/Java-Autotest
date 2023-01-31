package task47part1;

public class Main {
    public static void main(String[] args) {
        for (int i = Integer.parseInt(args[0]); i <= Integer.parseInt(args[1]); i++) {
            if (i % 3 == 0 && i % 5 != 0)
                System.out.println(i);
        }
    }
}
