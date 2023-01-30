package task43part5;

public class Main {
    public static void main(String[] args) {
        int orderPriceRub = Integer.parseInt(args[0]);
        int orderPriceKop = Integer.parseInt(args[1]);
        int payOrderRub = Integer.parseInt(args[2]);
        int payOrderKop = Integer.parseInt(args[3]);
        if ((orderPriceRub | orderPriceKop | payOrderKop | payOrderRub) < 0) {
            System.out.println("Ошибка введенных параметров");
            System.exit(0);
        }

        int balanceAfterPurchase = (payOrderRub * 100 + payOrderKop) -(orderPriceRub * 100 + orderPriceKop);

        if (balanceAfterPurchase == 100) System.out.println("Сдача: 1 Руб 0 Коп");
        else if (balanceAfterPurchase > 100) System.out.println("Сдача: " + balanceAfterPurchase/100 +
                " Руб " + (balanceAfterPurchase % 100) + " Коп");
        else if (balanceAfterPurchase < 100 && balanceAfterPurchase > 0) System.out.println("Сдача: 0 Руб " +
                balanceAfterPurchase + " Коп");
        else System.out.println("Не хватает средств на покупку");
    }
}
