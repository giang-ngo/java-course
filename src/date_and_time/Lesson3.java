package date_and_time;

import java.time.LocalDate;

public class Lesson3 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate otherDate = LocalDate.of(2152, 12, 25);
        LocalDate date1 = LocalDate.parse("1999-12-21");

        System.out.println(date1);
        System.out.println("Tháng: "+date1.getMonthValue());
        System.out.println("Ngày: "+date1.getDayOfMonth());
        System.out.println("Năm: "+date1.getYear());

//        System.out.println("Ngày hiện tại: " + now);
//        System.out.println(now.getMonthValue());

//        var hundredYearLater = now.plusYears(100);
//        hundredYearLater = hundredYearLater.plusMonths(3);
//        hundredYearLater = hundredYearLater.minusDays(20);
//        System.out.println("100 năm sau: " + hundredYearLater);
    }
}
