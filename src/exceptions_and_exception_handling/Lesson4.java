package exceptions_and_exception_handling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lesson4 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ParseException | NullPointerException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        //..
        System.out.println("Các lệnh kế tiếp...");
    }

    private static void method1() throws ParseException, NullPointerException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date myBirthday = null;
        var dateStr = "22-10/2020";
        try {
            myBirthday = simpleDateFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            throw e;
        }


        System.out.println("Sinh nhật của tôi là: " +
                simpleDateFormat.format(myBirthday));
    }
}
