package date_and_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Lesson2 {
    public static void main(String[] args) throws ParseException {
        var format = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        var dateStr = "27/04/1999 20:15:50";
        Date date = dateFormat.parse(dateStr);
        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        calendar.set(Calendar.MONTH, 11);


        int month = calendar.get(Calendar.MONTH) + 1;


        System.out.println("Ngày: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Tháng: " + month);
        System.out.println("Năm: " + calendar.get(Calendar.YEAR));
        System.out.println("Giờ của ngày: " + calendar.get(Calendar.HOUR));
        System.out.println("Số phút: " + calendar.get(Calendar.MINUTE));
        System.out.println("Mili giây: " + calendar.getTimeInMillis());
        System.out.println("Timezone: " + calendar.getTimeZone().getID());


        Date other = calendar.getTime();

        System.out.println(date.compareTo(other));
    }
}
