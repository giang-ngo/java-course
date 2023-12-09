package methods;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
//    ĐỆ QUY
        Scanner input = new Scanner(System.in);
//        Ví dụ 1: Tính tổng S = 1 + 2 +...n;
//        Với số nguyên nhập từ bản phím

//        int n = input.nextInt();
//        System.out.println(add(n));

//        Ví dụ 2: Tính n!. Với n>=0 nhập vào từ bàn phím

//        int n = input.nextInt();
//        System.out.println("" + n + "! = "+ factorial(n));

//        Ví dụ 3: tìm số Fibonacci thứ n
        int n = input.nextInt();
        System.out.println("F" + n + " = " + fibo(n));

    }


    /**
     * phương thức tính tổng S = 1 + 2 +...+n đệ quy
     *
     * @param n
     * @return
     */
//    public static int add(int n) {
//        if (n == 1) { // trường hợp cơ sở
//            return 1;
//        } else {
//            return n + add(n - 1);
//        }
//    }


//    public static long factorial(int n) {
//        if (n < 2) {
//            return 1;
//        } else {
//            return n * factorial(n - 1);
//        }
//    }

    /**
     * phương thức tính Fibonacci thứ n
     * @param n
     * @return
     */
    private static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

}
