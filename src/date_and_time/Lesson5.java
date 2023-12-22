package date_and_time;

import java.time.LocalDateTime;
import java.time.Month;

public class Lesson5 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Thời gian hiện tại: " + now);

        LocalDateTime birthday = LocalDateTime.of(2003,
                Month.APRIL, 20, 15, 32, 51);
        LocalDateTime other = LocalDateTime.parse("1999-02-20T15:37:21");
        System.out.println("Other: " + other);

        System.out.println("Sinh nhật: " + birthday);
        var otherBirthday = birthday.plusYears(12);
        System.out.println("Sinh nhật: " + birthday);

        System.out.println(otherBirthday);
    }
}
