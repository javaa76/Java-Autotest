package task47part6;

import java.sql.Time;

public class Main {
    public static void main(String[] args) {
        int timeInSeconds = Integer.parseInt(args[0]);
        if (timeInSeconds <= 0 ) {
            System.out.println("Значение неприемлемо. Завершение работы!");
            System.exit(0);
        }
            Timer times = new Timer(90);
            times.start();
    }
}
