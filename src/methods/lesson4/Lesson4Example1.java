package methods.lesson4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lesson4Example1 {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("Ngày sinh, ví dụ:10/10/2009:  ");
        var dateFormat = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        var dateStr = input.nextLine();
        Date birthday = simpleDateFormat.parse(dateStr);
        System.out.println(simpleDateFormat.format(birthday));
        java.sql.Date otherDate = new java.sql.Date(birthday.getTime());
        System.out.println(otherDate);

        //12/10/2009

//        float salary = input.nextFloat();
//        DecimalFormat format = new DecimalFormat("#,###.##");
//        System.out.println(STR."Lương \{format.format(salary)}");
    }
}
