package task54part3;

public class Main {
    public static void main(String[] args) {
        StringBuilder pattern = new StringBuilder(args[0]);
        System.out.println("Пример аргумента: " + pattern);
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == '0') pattern.replace(i,i + 1,"1");
            else if (pattern.charAt(i) == '1') {
                pattern.replace(i,i + 1,"0");
            }
        }
        System.out.println("Вывод: " + pattern);

    }
}
