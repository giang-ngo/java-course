package conditions_and_loops;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
////        Ví dụ 1
//        var input = new Scanner(System.in);
//
//        System.out.println("Nhập vào chiều dài, chiều rộng: ");
//        var m = input.nextInt();
//        var n = input.nextInt();
//
//        if (m > 0 && n > 0) {
//            for (int i = 1; i <= m; i++) {
//                for (int j = 1; j <= n; j++) {
//                    System.out.print(" * ");
//                }
//                System.out.println();
//
//            }
//        } else {
//            System.out.println("Kích thước phải nguyên dương");
//        }

////        Ví dụ 2
//
//        var input = new Scanner(System.in);
//
//        System.out.println("Nhập vào chiều dài, chiều rộng: ");
//        var m = input.nextInt();
//        var n = input.nextInt();
//
//        if (m > 0 && n > 0) {
//            for (int i = 1; i <= m; i++) {
//                for (int j = 1; j <= n; j++) {
//                    if (i == 1 || i == m || j == 1 || j == n) {
//                        System.out.print(" * ");
//                    } else {
//                        System.out.print("   ");
//
//                    }
//                }
//                System.out.println();
//
//            }
//        } else {
//            System.out.println("Kích thước phải nguyên dương");
//        }

//        Ví dụ 3

        var input = new Scanner(System.in);

        System.out.println("Nhập vào chiều cao của tam giác: ");
        var h = input.nextInt();


        if (h > 0) {
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();

            }
        } else {
            System.out.println("Chiều cao phải nguyên dương");
        }
    }
}
