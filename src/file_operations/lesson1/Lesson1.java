package file_operations.lesson1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lesson1 {
    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        var dataBuilder = new StringBuilder();
        try {
            var file = new File("src/file_operations/lesson1/input.txt");
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                var buff = new char[100];
//                var data = bufferedReader.readLine();
                while (bufferedReader.read(buff, 0, 100) != -1) {
                    dataBuilder.append(String.valueOf(buff));
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        createStudent(students, dataBuilder.toString());
        showStudentInfo(students);
    }

    private static void createStudent(ArrayList<Student> students, String data) {
        var lines = data.split("\r\n");
        for (var line : lines) {
            var student = createStudentFromData(line);
            if (student != null) {
                students.add(student);
            }
        }
    }

    private static void showStudentInfo(ArrayList<Student> students) {
        for (var student : students) {
            System.out.println(student);
        }
    }

    private static Student createStudentFromData(String data) {
        var info = data.split(",");
        if (info.length == 5) {
            var gpa = Float.parseFloat(info[4]);
            return new Student(info[0], info[1], info[2], info[3], gpa);
        }
        return null;
    }
}
