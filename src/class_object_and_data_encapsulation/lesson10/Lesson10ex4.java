package class_object_and_data_encapsulation.lesson10;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lesson10ex4 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/class_object_and_data_encapsulation" +
                "/lesson10/input2.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<Student2> students = new ArrayList<>();
        readStudentFromFile(scanner, students);
        scanner.close();
        showStudentInfo(students);
    }

    private static void showStudentInfo(ArrayList<Student2> students) {
        var line = "==========================";
        System.out.println(STR."\{line} THÔNG TIN SINH VIÊN \{line}");
        System.out.printf("%-10s%-12s%-30s%-20s%-25s%-10s\n", "STT", "Mã SV",
                "Họ tên", "Địa chỉ", "Chuyên nghành", "Điểm gpa");
        var counter = 1;
        for (Student2 student : students) {
            System.out.printf("%-10d%-12s%-30s%-20s%-25s%-10s\n", counter++,
            student.getStudentId(), student.getFullName(), student.getAddress(),
                    student.getMajor(), student.getGpa());
        }
    }

    /**
     * Phương thức đọc ra thông tin các sinh viên trong file
     *
     * @param scanner  danh sách sinh viên đọc được
     * @param students đối tượng file
     */
    private static void readStudentFromFile(Scanner scanner,
                                            ArrayList<Student2> students) {
        while (scanner.hasNextLine()) {
            var data = scanner.nextLine().split(",");
            var gpa = Float.parseFloat(data[4]);
            var student = new Student2(data[0], data[1], data[2], data[3], gpa);
            students.add(student);
        }

    }
}


class Student2 {
    private String studentId;
    private String fullName;
    private String address;
    private String major;
    private float gpa;

    public Student2() {
    }

    public Student2(String studentId, String fullName,
                    String address, String major, float gpa) {
        this.setStudentId(studentId);
        this.setFullName(fullName);
        this.setAddress(address);
        this.setMajor(major);
        this.setGpa(gpa);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
