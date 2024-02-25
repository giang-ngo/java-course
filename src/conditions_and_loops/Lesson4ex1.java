package conditions_and_loops;

import java.util.Scanner;

public class Lesson4ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        var n = input.nextInt();
        var k = input.nextInt();

        if (k == 0) {
            System.out.println("Không thể chia");
        } else if (n % k == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
