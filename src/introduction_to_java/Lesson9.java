package introduction_to_java;

public class Lesson9 {
    public static void main(String[] args) {
//        Ví dụ 1:
//        long number = 999999999L;
//        var result = String.format("%,+20d", number);
//        System.out.println(result);
//        System.out.printf("%,+-20d", number);

//        var result = String.format("%o", number);
//        System.out.println(result);
//        System.out.printf("%H", number);


//        Ví dụ 2:

        var number = 3.1415926;
//        System.out.printf("%-10.3f%n", number);
//        var result = String.format("%10.5f", number);

        System.out.printf("%e%n", number);
        var result = String.format("%E", number);

        System.out.println(result);
    }
}
