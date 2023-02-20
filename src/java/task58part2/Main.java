package task58part2;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("В аргументах ничего не передано! " +
                    "\nЗавершение работы");
            System.exit(0);
        }
        String maxWordTemp = ""; // Здесь берем самое первое и от-льно него сравниваем
        for (int i = 0; i < args.length; i++) {
            if (args[i].matches("^[a-z0-9]{1,}.$")) {
                if (args[i].length() == maxWordTemp.length())
                    System.out.print(args[i] + " ");
                if (args[i].length() > maxWordTemp.length())
                    maxWordTemp = args[i];
            }
            else
                System.out.print("{Слово " + "'" + args[i] + "'" + " не соответствует " +
                        "прописному латинскому алфавиту - Исправьте или удалите} ");
        }
        System.out.println(maxWordTemp);
    }
}
