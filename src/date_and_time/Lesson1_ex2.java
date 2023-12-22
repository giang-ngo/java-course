package date_and_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lesson1_ex2 {
    public static void main(String[] args) {
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        var input = new Scanner(System.in);
        System.out.println("Nhập ngày tháng năm sinh");
        var dobStr = input.nextLine();
        try {
            Date birthday = dateFormat.parse(dobStr);
            System.out.println("Sinh nhật của bạn: " + dateFormat.format(birthday));
            System.out.println("Ngày hiện tại: " + dateFormat.format(new Date()));
            var age = findAge(birthday.getTime());
            System.out.printf("Tuổi của bạn là: %5.2f\n", age);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    private static Object findAge(long time) {
        var currentTime = new Date().getTime();
        var hours = 365 * 24 + 6;
        var min = hours * 60;
        var sec = min * 60;
        var millisec = sec * 1000L;
        return 1.0f * (currentTime - time) / (millisec);
    }
}
