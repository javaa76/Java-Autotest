package task54part5;

public class Main {
    static boolean isInteger(String str) {
        return (str.matches("\\A\\d{1,}"));
    }

    public static void main(String[] args) {
        System.out.println("Входная строка: " + args[0]);
        if (isInteger(args[0]))
            System.out.println("Вывод: строка является целым числом");
        else
            System.out.println("Вывод: строка не является целым числом");
    }
}
