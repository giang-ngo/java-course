package file_operations.lesson2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        do {
            System.out.println("================MENU================");
            System.out.println("1. Thêm mới sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Ghi danh sách sinh viên vào file");
            System.out.println("0. Thoát");

            choice = scanner.nextInt();
            scanner.nextLine();//đọc bỏ dòng thừa

            switch (choice) {
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                case 1:
                    var student = createStudent(scanner);
                    students.add(student);
                    break;
                case 2:
                    showStudents(students);
                    break;
                case 3:
                    System.out.println("Nhập tên file để lưu dữ liệu: ");
                    var fillName = scanner.nextLine();
                    writeDataToFile(students, fillName);
                    break;
                default:
                    System.out.println("Sai tùy chọn. Hãy chọn lại!");
            }

        } while (choice != 0);
    }


    /**
     * phương thức dùng dể tạo mới thông tin sinh viên từ bàn phím
     *
     * @param scanner đối tượng đọc dữ liệu từ bàn phím
     * @return đối tượng sinh viên vừa tạo
     */
    private static Student createStudent(Scanner scanner) {
        System.out.println("Nhập mã SV: ");
        var id = scanner.nextLine();
        System.out.println("Nhập họ tên SV: ");
        var fullName = scanner.nextLine();
        System.out.println("Nhập địa chỉ của SV: ");
        var address = scanner.nextLine();
        System.out.println("Nhập chuyên nghành của SV: ");
        var major = scanner.nextLine();
        System.out.println("Nhập điểm của SV: ");
        float gpa = Float.parseFloat(scanner.nextLine());
        return new Student(id, fullName, address, major, gpa);
    }

    /**
     * phương thức hiển thị thông tin của các sinh viên
     *
     * @param students danh sách sinh viên cần hiển thị
     */
    private static void showStudents(List<Student> students) {
        System.out.println("==========> DANH SÁCH SINH VIÊN <==========");
        System.out.printf("%-10s%-30s%-20s%-20s%-10s\n", "Mã SV",
                "Họ tên", "Địa chỉ", "Chuyên nghành", "Điểm GPA");
        for (var student : students) {
            System.out.printf("%-10s%-30s%-20s%-20s%-10.2f\n",
                    student.getStudentId(), student.getFullName(),
                    student.getAddress(),
                    student.getMajor(), student.getGpa());
        }
    }

    /**
     * phương thức ghi danh sách sinh viên ra file
     *
     * @param students danh sách sinh viên cần ghi ra file
     * @param fileName tên file để lưu danh sách sinh viên
     */
    private static void writeDataToFile(List<Student> students, String fileName) {
        try (var fileWrite = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWrite);
        ) {
            for (var student : students) {
                bufferedWriter.write(student.toString());// ghi thông tin sinh viên ra file
                bufferedWriter.newLine();// ghi dòng mới ra file
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
