package introduction_to_java;

import java.util.Scanner;

public class Lesson10_ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Họ: ");
        var lastName = scanner.nextLine().trim();
        System.out.println("Đệm: ");
        var midName = scanner.nextLine().trim();
        System.out.println("Tên: ");
        var firstName = scanner.nextLine().trim();

        var nameBuilder = new StringBuilder();

        nameBuilder.append(lastName.toLowerCase())
                .append(" ")
                .append(midName.toLowerCase()).append(" ")
                .append(firstName.toLowerCase());

//        var fullName = nameBuilder.toString();
//        System.out.println(STR."Họ và tên: \{fullName}");
//        System.out.println(STR."Họ và tên viết hoa: \{fullName.toUpperCase()}");

        nameBuilder.setCharAt(0, Character.toUpperCase(nameBuilder.charAt(0)));

        var previousIndex = 0;
        while (true) {
            var index = nameBuilder.indexOf(" ", previousIndex);
            if (index >= 0) {
                var character = nameBuilder.charAt(index + 1);
                nameBuilder.setCharAt(index + 1, Character.toUpperCase(character));
                previousIndex = index + 1;
            } else {
                break;
            }
        }
        System.out.println(STR."Họ và tên: \{nameBuilder}");

    }
}
