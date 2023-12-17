package class_object_and_data_encapsulation.lesson11;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ExampleLesson11 {
    public static void main(String[] args) {
        File file = new File("RESULT.DAT");

//        try {
//            FileWriter fileWriter = new FileWriter(file, true);
//            PrintWriter printWriter = new PrintWriter(fileWriter);
//
//
//            Student nam = new Student("SV001", "Nguyễn Văn Nam",
//                    20, 3.28f, "Đà Nẵng", "nam@xmail.com");
//            printWriter.println(nam.getStudentId());
//            printWriter.println(nam.getFullName().getFullName());
//            printWriter.println(nam.getAge());
//            printWriter.println(nam.getAvgGrade());
//            printWriter.println(nam.getAddress());
//            printWriter.println(nam.getEmail());
//            printWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        var students = readStudentFromFile("RESULT.DAT");
        for (Student student : students) {
            showStudent(student);
            System.out.println("===================================");
        }


//        System.out.println("Hello");
//        PrintWriter myOutput = new PrintWriter(System.out,false);
//        myOutput.println("Hello");
//        myOutput.flush();
//        myOutput.close();
    }

    private static void showStudent(Student student) {
        System.out.println("Mã SV: " + student.getStudentId());
        System.out.println("Họ tên: " + student.getFullName().getFullName());
        System.out.println("Địa chỉ: " + student.getAddress());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Tuổi: " + student.getAge());
        System.out.println("Điểm TB: " + student.getAvgGrade());
    }

    private static ArrayList<Student> readStudentFromFile(String fileName) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                String id = scanner.nextLine();
                String name = scanner.nextLine();
                int age = Integer.parseInt(scanner.nextLine());
                float gpa = Float.parseFloat(scanner.nextLine());
                String address = scanner.nextLine();
                String email = scanner.nextLine();
                Student student = new Student(id, name, age, gpa, address, email);

                students.add(student);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return students;
    }
}
