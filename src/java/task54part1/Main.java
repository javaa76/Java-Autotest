package task54part1;

public class Main {
    static String someText = "Циклом называется многократное " +
                            "выполнение одних и тех же действий.";
    public static void main(String[] args) {
        String searchSymbol = args[0];
        System.out.println("Через аргументы передается \"" + searchSymbol+ "\", " +
                "Вывод: " + someText.replaceAll(" ", "").indexOf(searchSymbol) + ".");
    }
}
