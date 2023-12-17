package conditions_and_loops;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
////       Ví dụ 1: Kiểm tra n có phải số đẹp hay ko?
//        var input = new Scanner(System.in);
//
//        System.out.println("Nhập vào số nguyên dương n: ");
//        var n = input.nextInt();
//        var m = n;// để không thay đổi giá trị gốc của n
//        var rev = 0;
//
//        while (m > 0) {
//            rev = rev * 10 + m % 10;
//            m /= 10;
//        }
//
//        if (n == rev) {
//            System.out.println("n là số đối xứng");
//        } else {
//            System.out.println("n không phải là số đối xứng");
//        }

//        Ví dụ 2

        var input = new Scanner(System.in);
        System.out.println("Nhập vào 2 số thực a,b: ");
        var a = input.nextDouble();
        var b = input.nextDouble();
        var choice = 0;

        do {
            System.out.println("Chọn chức năng");
            System.out.println("1. Cộng 2 số");
            System.out.println("2. Trừ 2 số");
            System.out.println("3. Nhân 2 số");
            System.out.println("4. Chia 2 số");
            System.out.println("0. Thoát chương trình");
            System.out.println("Xin mời chọn");
            choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Đã thoát chương trình");
                    break;
                case 1:
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;
                case 2:
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;
                case 3:
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                case 4:
                    System.out.println(a + " / " + b + " = " + (a / b));
                    break;
                default:
                    System.out.println("Không hợp lẹ. Hãy thử lại!");
                    break;
            }
            System.out.println("==============================");
        } while (choice != 0);
    }
}
