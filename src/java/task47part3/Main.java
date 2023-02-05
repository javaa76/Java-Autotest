package task47part3;

public class Main {
    static void snakePrint(int n, int col) {

        if (n < 1 || col <= 0) {
            System.out.println("Параметры неверны!");
            System.exit(0);
        }

        int value = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < col; j++) {
                    System.out.print(value + " ");
                    value++;
                    if (value >= n + 1) break;
                }
            }
            else {
                for (int j = 0; j < col; j++) {
                    if (col + (value - 1) - j >= n + 1)
                        if (n < 10) System.out.print(" ");
                        else System.out.print("   ");
                    else
                        System.out.print(col + (value - 1) - j + " ");

                }
                value += col;
                }
            if ((value - 1) % col == 0) System.out.println();
            if (value >= n) break;
            }



    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        snakePrint(n, col);
    }
}
