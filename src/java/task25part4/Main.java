package task25part4;

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
        long deltaDate, deltaLocalDate, deltaLocalDateTime, deltaZoneDT, deltaGregCalendar;

        Date dateNowStart = new Date();
        Date date = new Date(100, 00, 01); // 2000-01-01
        System.out.println("Класс Date: " + new SimpleDateFormat("dd-MM-yyyy").format(date));
        Date dateNowEnd = new Date();
        deltaDate = dateNowEnd.getTime() - dateNowStart.getTime();

        dateNowStart = new Date();
        LocalDate localDate = LocalDate.of(2000, 01, 01);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println("Класс LocalDate: " + localDate.format(formatter));
        dateNowEnd = new Date();
        deltaLocalDate = dateNowEnd.getTime() - dateNowStart.getTime();

        dateNowStart = new Date();
        LocalDateTime localDateTime = LocalDateTime.of(2000, 01, 01,
                00, 00);
        System.out.println("Класс LocalDateTime: " + localDateTime.format(formatter));
        dateNowEnd = new Date();
        deltaLocalDateTime = dateNowEnd.getTime() - dateNowStart.getTime();

        dateNowStart = new Date();
        ZonedDateTime zoneDT = ZonedDateTime.parse("2000-01-01T00:00:00Z[Europe/Moscow]");
        DateTimeFormatter zoneFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Класс ZoneDateTime: " + zoneDT.format(zoneFormatter) + " " +
                zoneDT.getZone());
        dateNowEnd = new Date();
        deltaZoneDT = dateNowEnd.getTime() - dateNowStart.getTime();

        dateNowStart = new Date();
        Calendar calendar = new GregorianCalendar(2000, 00, 01);
        System.out.println("Класс GregorianCalendar: " + new SimpleDateFormat("День: dd " +
                "Месяц: MM Год: yyyy")
                .format(calendar.getTime()));
        dateNowEnd = new Date();
        deltaGregCalendar = dateNowEnd.getTime() - dateNowStart.getTime();

        System.out.println("\nDate: " + deltaDate + " - ms" +
                "\nLocalDate: " + deltaLocalDate + " - ms" +
                "\nLocalDateTime: " + deltaLocalDateTime +" - ms" +
                "\nZoneDT: " + deltaZoneDT +" - ms" +
                "\nGregorianCalendar: " + deltaGregCalendar + " - ms");
    }
}

