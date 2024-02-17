package exceptions_and_exception_handling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lesson1 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // các câu lệnh kế tiếp phía sau
        System.out.println("Thực hiện các câu lệnh tiếp theo...");
    }

    private static void method1() throws ParseException {
        SimpleDateFormat dateFormat =
                new SimpleDateFormat("dd/MM/yyyy");
        var dateString = "27/05-2025";
        // chuyển đổi string sang đối tượng date:
        // dòng code dưới đây có thể xảy ra ngoại lệ:
        Date myBirthday = null;
        myBirthday = dateFormat.parse(dateString);
        System.out.println("Đối tượng date hoàn chỉnh: " + dateFormat.format(myBirthday));
    }

}
