package conditions_and_loops;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập 2 số nguyên a,b: ");
        var a = input.nextInt();
        var b = input.nextInt();
        System.out.println("Hãy nhập lựa chọn: ");
        System.out.println("1. Cộng 2 số");
        System.out.println("2. Trừ 2 số");
        System.out.println("3. Nhân 2 số");
        System.out.println("4. Chia 2 số");
        System.out.println("0. Thoát chương trình");
        var choice = input.nextInt();
//        float x = 3.14f;

        switch (choice) {
            case 0:
                System.out.println("Kết thúc chương trình");
                break;
            case 1:
                var sum = a + b;
                System.out.println(a + " + " + b + " = " + sum);
                break;
            case 2:
                var sub = a - b;
                System.out.println(a + " - " + b + " = " + sub);
                break;
            case 3:
                var mul = a * b;
                System.out.println(a + " * " + b + " = " + mul);
                break;
            case 4:
                if (b != 0) {
                    var div = 1.0 * a / b;
                    System.out.println(a + " / " + b + " = " + div);
                    break;
                } else {
                    System.out.println("Không thể chia");
                }
                break;


            default:
                System.out.println("Không hợp lệ");
                break;
        }
    }
}
