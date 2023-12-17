package conditions_and_loops;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.println("Nhập điểm TB:");
        var gpa = input.nextFloat();
        var amount = 0;
        var level = "";

        if (gpa >= 3.6f) {
            level = "Xuất sắc";
            amount = 10_000_000;
        } else if (gpa >= 3.2) {
            level = "Loại giỏi";
            amount = 4_600_00;
        } else if (gpa >= 3.0) {
            level = "Khá";
            amount = 3_200_000;
        } else {
            level = "Không đạt học bổng";
        }

        System.out.println("Loại học bổng: " + level);
        System.out.println("Mức thưởng: " + amount + "đ");
    }
}
