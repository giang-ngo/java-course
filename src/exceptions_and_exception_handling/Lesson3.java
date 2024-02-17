package exceptions_and_exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date myBirthday = null;
        var dateString = "";

        // dòng code dưới đây có thể xảy ra ngoại lệ:
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(new File("input.txt"));
            myBirthday = dateFormat.parse(dateString);
            dateString = fileReader.nextLine();
            System.out.println("Sinh nhật của tôi là: " +
                    dateFormat.format(myBirthday));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        } finally {
            if (myBirthday == null) {
                try {
                    myBirthday = dateFormat.parse("01/01/2000");
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Sinh nhật của tôi là: " +
                    dateFormat.format(myBirthday));
        }


        // các câu lệnh kế tiếp phía sau
        System.out.println("Chúc Síp Vy lun quyến rũ, ngọt ngào," +
                " trẻ trung, xinh đẹp!!\n=)) Sớm tìm được bạn tình");
    }
}
