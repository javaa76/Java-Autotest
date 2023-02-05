package task47part5;

public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);
        int result = 0;
        switch (args[1]) {
            case "+":
                result = Calculator.add(x, y);
                break;
            case "-":
                result = Calculator.sub(x, y);
                break;
            case "*":
                result = Calculator.mul(x, y);
                break;
            case "/":
                result = Calculator.divide(x, y);
                break;
            default:
                System.out.println("Не поддерживаемая операция: " + args[1]);
                System.out.println("Список доступных операций: \n" +
                        "\t'+' - операция сложения\n" +
                        "\t'-' - операция вычитания\n" +
                        "\t'*' - операция умножения\n" +
                        "\t'/' - операция деления\n" );
                System.out.println("Завершение работы программы");
                System.exit(0);
        }
        System.out.println("Результат: " + result);
    }
}
