package class_object_and_data_encapsulation.lesson10;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lesson10ex3 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/class_object_and_data_encapsulation" +
                "/lesson10/input.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<Student> students = new ArrayList<>();
        readStudentFromFile(scanner, students);
        scanner.close();
        showStudentInfo(students);
    }

    private static void showStudentInfo(ArrayList<Student> students) {
        System.out.println("============ THÔNG TIN SINH VIÊN ============");
        System.out.printf("%-30s%-25s%-25s%-10s%-10s\n", "Họ tên", "Địa chỉ",
                "Email", "Điểm gpa", "Tuổi");
        for (Student student : students) {
            System.out.printf("%-30s%-25s%-25s%-10.2f%-10d\n", student.getFullName(),
                    student.getAddress(),
                    student.getEmail(), student.getGpa(), student.getAge());
        }
    }

    /**
     * Phương thức đọc ra thông tin các sinh viên trong file
     *
     * @param scanner  danh sách sinh viên đọc được
     * @param students đối tượng file
     */
    private static void readStudentFromFile(Scanner scanner,
                                            ArrayList<Student> students) {
        while (scanner.hasNextLine()) {
            var age = scanner.nextInt();
            scanner.nextLine();
            var address = scanner.nextLine();
            var fullName = scanner.nextLine();
            var email = scanner.nextLine();
            var gpa = scanner.nextFloat();
            var student = new Student(fullName, address, email, gpa, age);
            students.add(student);
        }

    }
}


class Student {
    private String fullName;
    private String address;
    private String email;
    private float gpa;
    private int age;

    public Student() {
    }

    public Student(String fullName, String address,
                    String email, float gpa, int age) {
        this.setFullName(fullName);
        this.setAddress(address);
        this.setEmail(email);
        this.setGpa(gpa);
        this.setAge(age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}