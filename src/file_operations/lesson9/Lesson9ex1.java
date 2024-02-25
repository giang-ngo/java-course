package file_operations.lesson9;

import java.io.*;
import java.util.ArrayList;

public class Lesson9ex1 {
    public static void main(String[] args) {
        var fileName = "src/file_operations/lesson9/lesson9.txt";
        var student = new Student("S1", "Nguyen Ngoc Linh");
        var student2 = new Student("S2", "Tran Khanh Vy");
        var student3 = new Student("S3", "Le Quang Hien");
        var student4 = new Student("S4", "Tran Minh Yen");

        var students = new ArrayList<Student>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        //ghi đối tượng vào file

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // đọc đối tượng từ file

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {

            var students2 = (ArrayList<Student>) ois.readObject();

            showStudents(students2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void showStudents(ArrayList<Student> students2) {
        System.out.println("Danh sách sinh viên đọc từ file");
        for (var student : students2) {
            System.out.println(student);
        }
    }
}
