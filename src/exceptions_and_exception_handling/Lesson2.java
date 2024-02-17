package exceptions_and_exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        method1();

        System.out.println("Thực hiện các lệnh kế tiếp...");
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        String str = null;
        try {
            System.out.println("Số kí tự của str: " + str.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }


//        File file = new File("input.txt");
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        String str = "27/05/2025";
//        try {
//            Date birthday = simpleDateFormat.parse(str);
//            System.out.println("Sinh nhật: " + simpleDateFormat.format(birthday));
//            Scanner fileReader = new Scanner(file);
//
//        } catch (ParseException | FileNotFoundException e) {
//            System.out.println(e.getMessage());
//            var stack = e.getStackTrace();
//            for (var item : stack) {
//                System.out.println(item);
//            }
//        }
    }
}
