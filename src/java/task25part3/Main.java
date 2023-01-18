package task25part3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Date dateNowStart = new Date();

        Date date = new Date(100, 00,01); // 2000-01-01
        System.out.println("Класс Date: " + new SimpleDateFormat("dd-MM-yyyy").format(date));

        LocalDate localDate = LocalDate.of(2000, 01,01);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println("Класс LocalDate: " + localDate.format(formatter));

        LocalDateTime localDateTime = LocalDateTime.of(2000, 01, 01,
                00, 00);
        System.out.println("Класс LocalDateTime: " + localDateTime.format(formatter));

        ZonedDateTime zoneDT = ZonedDateTime.parse("2000-01-01T00:00:00Z[Europe/Moscow]");
        DateTimeFormatter zoneFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Класс ZoneDateTime: " + zoneDT.format(zoneFormatter) +" " +
                zoneDT.getZone());

        Calendar calendar = new GregorianCalendar(2000, 00, 01);
        System.out.println("Класс GregorianCalendar: " + new SimpleDateFormat("День: dd " +
                "Месяц: MM Год: yyyy")
                .format(calendar.getTime()));
        Date dateNowEnd = new Date();
        System.out.println((dateNowEnd.getTime()) - (dateNowStart.getTime()) + " - ms");
    }
}
