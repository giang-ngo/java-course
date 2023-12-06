package conditionsAndLoops;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
//        Ví dự 1
//        var input = new Scanner(System.in);
//        System.out.println("Nhập vào 1 chuỗi kí tự");
//        var str = input.nextLine().toLowerCase();
//
//        var count = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
//                count++;
//            }
//        }
//        System.out.println("Chuỗi \"" + str + "\"");
//        System.out.println("Số chữ cái " + count);


        //Ví dụ 2
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        var n = input.nextInt();

        if (n > 0) {
            var sum = 0.0;
            for (int i = 1; i <= n; i++) {
                sum += 1.0 / i;
            }
            System.out.printf("S = %10.2f", sum);
        } else {
            System.out.println("Nhập n là số nguyên dương");
        }
    }
}
