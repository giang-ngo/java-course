package date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Lesson6 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm:ss:SSS");

//        LocalDate now = LocalDate.now();
//        LocalDate date = LocalDate.of(2001, 1, 1);
//        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss:SSS:nnnnnnnnn");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss:SSS");
        LocalTime time = LocalTime.parse("21:15:27:699", timeFormatter);

//        ZonedDateTime zonedDateTime = ZonedDateTime.now();
//        System.out.println(timeFormatter.format(zonedDateTime));
//        var myDate = formatter.parse("21/11/2029");
//        System.out.println(formatter.format(myDate));

//        System.out.println(timeFormatter.format(time));
//        System.out.println(formatter.format(date));

//        System.out.println(time);
//
//        LocalDate date = LocalDate.parse("12/12/2012", formatter);
//        System.out.println(date);

        LocalDateTime myDateTime = LocalDateTime.parse("21/11/2029 21:15:27:699",formatter);
        System.out.println(myDateTime);


    }
}
