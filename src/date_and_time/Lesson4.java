package date_and_time;

import java.time.LocalTime;

public class Lesson4 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();// đối tượng đại diện thời gian hiện thời
        LocalTime other = LocalTime.of(21, 15, 52);
        LocalTime time = LocalTime.parse("05:15:31");

        System.out.println(time);
        System.out.println(now);
        System.out.println(other);

//        time=time.plusHours(5);
//        time = time.minusMinutes(15);
//        System.out.println(time);

        var otherTime = time.minusMinutes(15);
        System.out.println(otherTime);
    }
}
