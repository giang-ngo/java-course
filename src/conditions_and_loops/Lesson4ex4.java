package conditions_and_loops;

import java.util.Scanner;

//viết chương trình giải phương trình bậc nhất ax + b = 0.
public class Lesson4ex4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập hệ số a,b: ");
        var a = input.nextInt();
        var b = input.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("Vô số nghiệm");
        } else if (a == 0) {
            System.out.println("Vô nghiệm");
        } else {
            System.out.println(STR."Nghiệm phương trình x = \{-b * 1.0f / a}");
        }
    }
}
