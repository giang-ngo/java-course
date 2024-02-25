package date_and_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Lesson1ex1 {
    public static void main(String[] args) {
        Date date = new Date(5 * 24 * 60 * 60 * 1000);
        System.out.println(date);
        var format = "dd/MM/yyyy";
        var format2 = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        System.out.println("Kết quả sau định dạng: " + simpleDateFormat.format(date));
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat(format2);
        System.out.println("Kết quả sau định dạng 2: "+simpleDateFormat1.format(date));

    }
}
