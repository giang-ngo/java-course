package methods;

import java.util.Scanner;


public class Lesson1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập một số nguyên n: ");
        var n = input.nextInt();
//        var result = isPrime(n) ? "Phải" : "Không Phải";
//        System.out.println("N có phải số nguyên tố không? " + result);
//        var result = isRevert(n) ? "Là số đảo" : "Không là số đảo";
//        System.out.println("N có phải số nguyên đảo không? " + result);

        showResult(n, isRevert(n));
    }

    private static void showResult(int n, boolean result) {
        if (result) {
            System.out.println("n là số đảo");
        } else {
            System.out.println("không là số đảo");
        }
    }

    private static void showResult(boolean resul) {
    }

    /**
     * phương thức kiểm tra n có phải số đảo hay ko
     *
     * @param n là tham số cần kiểm tra
     * @return true nếu n là số đảo và ngược lại
     */
    private static boolean isRevert(int n) {

        var rev = 0;
        var m = n;
        while (m > 0) {
            rev = rev * 10 + m % 10;
            m /= 10;
        }

        return rev == n;
    }

    /**
     * thực hiện kiểm tra n có phải số nguyên tố ko
     *
     * @param n là số cần kiểm tra
     * @return kết quả đánh giá
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;

        }

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
