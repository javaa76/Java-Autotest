package task54part4;

public class Main {
    public static void main(String[] args) {
        StringBuilder pattern = new StringBuilder(args[0]);
        System.out.println("Пример аргумента: " + pattern);
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) < 48 || pattern.charAt(i) > 57 ) {
                pattern.delete(i, i + 1);
                i--;
            }
        }
        System.out.println("Вывод: " + pattern);
    }
}
