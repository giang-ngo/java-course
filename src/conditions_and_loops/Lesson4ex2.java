package conditions_and_loops;

import java.util.Scanner;

public class Lesson4ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float gpa = input.nextFloat();
        String level;
        int amount;

        //kiểm tra
        if (gpa > 4.0f || gpa < 0.0) {
            System.out.println("Điểm gpa không hợp lệ");
        } else {
            if (gpa >= 3.6f) {
                level = "Xuất sắc";
                amount = 10_000_000;
            } else if (gpa >= 3.2f) {
                level = "Giỏi";
                amount = 5_000_000;
            } else if (gpa >= 3.0f) {
                level = "Khá";
                amount = 3_500_000;
            } else {
                level = "Không đạt";
                amount = 0;
            }
            System.out.println(STR."Loại hc bổng: \{level}");
            System.out.println(STR."Số tiền thưởng: \{amount}đ");
        }

    }
}
