package file_operations.lesson8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson8ex1 {
    public static void main(String[] args) {
        File file = new File("src/file_operations/lesson8/input.txt");
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                var line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
