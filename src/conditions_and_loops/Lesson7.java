package conditions_and_loops;

import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
////        Ví dụ 1: tìm giá trị đầu tiên trong đoạn [a,b] chia hết cho k!=0
//        var input = new Scanner(System.in);
//
//        System.out.println("Nhập vào 2 số nguyên a<b: ");
//        var a = input.nextInt();
//        var b = input.nextInt();
//
//        System.out.println("Nhập số nguyên k!=0: ");
//        var k = input.nextInt();
//
//        if (k != 0) {
//            for (int i = a; i <= b; i++) {
//                if (i % k == 0) {
//                    System.out.println("Gía trị đâu tiên trong" +
//                            " đoạn [" + a + "," + b + "]:" + i);
//                    break;
//                }
//            }
//
//        } else {
//            System.out.println("Nhập k khác 0");
//        }


//        Ví dụ 2: liệt kê các giá trị trong đoạn [a,b] chia hết cho k!=0
        var input = new Scanner(System.in);
        System.out.println("Nhập vào 2 số nguyên a < b:");
        var a = input.nextInt();
        var b = input.nextInt();

        System.out.println("Nhập k!=0: ");

        var k = input.nextInt();
        if (k != 0) {
            for (int i = a; i <= b; i++) {
                if (i % k != 0) {
                    continue;//bỏ qua i chia dư cho k
                }
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Nhập k khác 0");
        }

    }
}
