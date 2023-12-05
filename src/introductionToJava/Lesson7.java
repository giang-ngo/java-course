package introductionToJava;

import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
//        System.out.println("Nhập họ và tên: ");
//        var fullName = input.nextLine();

        System.out.println("GPA của bạn? ");
        var gpa = input.nextDouble();
//        System.out.println("Hello " + fullName);
        System.out.println(((Object)gpa).getClass().getName());

//        var first;//error
    }
}
