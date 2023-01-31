package task47part6;

import java.sql.Time;

public class Timer {
    private int seconds;

    public Timer(int seconds) {
        this.seconds = seconds;
    }

    /*
    - статический метод void waitSecond() - метод реализует паузу
    одной секунды. Реализовать с помощью цикла.
    - метод printTime вывода оставшегося времени в минутах и секундах.
    - объектный метод start() - запускает обратный отсчет
    и каждую секунды выводит оставшееся количество секунд.
     */
    static void waitSecond() {
        long timeImSec = System.currentTimeMillis() + 1000;
        while (System.currentTimeMillis() < timeImSec)
            continue;
    }
    void printTime(int time) {
        String pattern_min;
        String pattern_sec;
        pattern_min = (time/60 < 10?"0":"");
        pattern_sec = (time % 60 < 10?"0":"");
        System.out.println(pattern_min + time/60 + ":" + pattern_sec + time % 60);
    }
    void start() {
       printTime(this.seconds);
        for (int i = this.seconds-1; i >= 0; i--) {
            Timer.waitSecond();
            printTime(i);
        }
    }


}
