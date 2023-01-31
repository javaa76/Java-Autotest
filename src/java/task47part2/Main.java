package task47part2;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = 0;
        try {
            m = Integer.parseInt(args[1]) * 60;
            }
        catch (Exception e) {
            m = (int)((Double.parseDouble(args[1])) * 60);
        }
        //int m = Integer.parseInt(args[1]);

        if ((m | n) > 0) {
            int hours = m;
            for (int i = 1; i < n; i++) hours += 10;
            System.out.println("Бригада работала: " + hours/60 + " часов " + hours % 60 + " минут");
        }
        else {
            System.out.println("Такого просто не может быть! Вы настолько ошиблись, что " +
                    "программа не может больше работать!");
            System.exit(0
            );
        }
    }

}
