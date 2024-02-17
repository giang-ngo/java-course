package exceptions_and_exception_handling.lesson5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        Scanner input = new Scanner(System.in);
        System.out.println("Tên sinh viên: ");
        var fullName = input.nextLine();
        student.setFullName(fullName);
        System.out.println("Nhập điểm TB(0.0->10.0) cho sinh viên: ");
        var grade = Float.parseFloat(input.nextLine());

        try {
            student.setAvgGrade(grade);
        } catch (InvalidGradeException e) {
            System.out.println("Xảy ra ngoại lệ: InvalidGradeException");
            System.out.println("Thông điệp: " + e.getMessage());
        }

        System.out.println("Các lệnh kế tiếp...");
        showStudentInfo(student);
    }

    /**
     * pt hiển thị tên và điểm TB của sinh viên
     *
     * @param student
     */
    private static void showStudentInfo(Student student) {
        System.out.println("Tên: " + student.getFullName());
        System.out.printf("Điểm TB: %5.2f\n", student.getAvgGrade());
    }
}
