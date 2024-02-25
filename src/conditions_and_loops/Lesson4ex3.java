package conditions_and_loops;

import java.util.Scanner;

public class Lesson4ex3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Nhập 2 số nguyên a,b: ");
        var a = scanner.nextInt();
        var b = scanner.nextInt();

        System.out.println("=================CÁC TÙY CHỌN=================");
        System.out.println("1. Cộng 2 số nguyên");
        System.out.println("2. Trừ 2 số nguyên");
        System.out.println("3. Nhân 2 số nguyên");
        System.out.println("4. Chia 2 số nguyên");
        System.out.println("0. Thoát");
        System.out.println("Xin mời chọn: ");

        var choice = scanner.nextInt();

        switch (choice) {
            case 0 -> System.out.println("Thoát");
            case 1 -> {
                var sum = a + b;
                System.out.println(STR."Tổng \{a} + \{b} = \{sum}");
            }
            case 2 -> {
                var sub = a - b;
                System.out.println(STR."Hiệu \{a} - \{b} = \{sub}");
            }
            case 3 -> {
                var mul = a * b;
                System.out.println(STR."Tích \{a} * \{b} = \{mul}");
            }
            case 4 -> {
                var div = a * 1.0f / b;
                if (b == 0) {
                    System.out.println("Không thể chia");
                } else {
                    System.out.println(STR."Thương \{a} / \{b} = \{div}");
                }

            }
            default -> System.out.println("Sai tùy chọn");

        }

    }
}
