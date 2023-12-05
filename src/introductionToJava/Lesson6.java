package introductionToJava;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
//        String msg = "        Hello         ";
//        int len = msg.length();
//        System.out.println(msg.replaceAll("\\s+", "*"));

//        String lan = "Lan";
//        String other = "Loan";
//
//        System.out.println(lan.compareTo(other));

        String lastName;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập họ: ");

        lastName = input.next();
        System.out.println("Nhập tên đệm: ");
        input.nextLine();
        String middle = input.nextLine();
        System.out.println("Nhập tên: ");
        String firstName = input.next();
        System.out.printf("Hello %s %s %s", lastName, middle, firstName);
    }
}
