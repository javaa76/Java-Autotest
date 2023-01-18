package task25part2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(100, 00,01); // 2000-01-01
        Date dateNow = new Date();
        long deltaDays = (((dateNow.getTime()  - date.getTime()) / 3600) / 1000) / 24;
        System.out.println("Класс Date разница с текущей датой: " + deltaDays + " дней");

        LocalDate localDate = LocalDate.of(2000, 01,01);
        LocalDate localDateNow = LocalDate.now();
        System.out.println("Класс LocalDate разница с текущей датой: " +
                localDate.until(localDateNow, ChronoUnit.DAYS) + " дней");

        LocalDateTime localDateTime = LocalDateTime.of(2000, 01, 01,
                00, 00);
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println("Класс LocalDateTime разница с текущей датой: " +
                localDateTime.until(localDateTimeNow, ChronoUnit.DAYS) + " дней");

        ZonedDateTime zoneDT = ZonedDateTime.parse("2000-01-01T00:00:00Z[Europe/Moscow]");
        ZonedDateTime zoneDTNow = ZonedDateTime.now();
        System.out.println("Класс ZoneDateTime разница с текущей датой: " +
                zoneDT.until(zoneDTNow, ChronoUnit.DAYS) + " дней");

        Calendar calendar = new GregorianCalendar(2000, 00, 01);
        Calendar calendarNow = new GregorianCalendar();
        long deltaCalendarDays = (((calendarNow.getTimeInMillis()  - calendar.getTimeInMillis())
                / 3600) / 1000) / 24;
        System.out.println("Класс GregorianCalendar разница с текущей датой: " +
                deltaCalendarDays + " дней");
    }
}
