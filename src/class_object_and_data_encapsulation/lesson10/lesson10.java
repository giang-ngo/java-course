package class_object_and_data_encapsulation.lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lesson10 {
    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("D:\\style.txt");
        File file = new File("C:\\Users\\84339\\IdeaProjects\\LearnJava\\src\\arr.xyz");
//        System.out.println(file.exists());
//        System.out.println(file.length());
//        System.out.println(file.getName());
//        System.out.println(file.getAbsoluteFile());
        Scanner readFile = new Scanner(file);
//        while (readFile.hasNextLine()) {
//            String line = readFile.nextLine();
//            System.out.println(line);
//        }

        if (readFile.hasNextInt()) {
            int n = readFile.nextInt();
            int[] numbers = new int[n];
            int i = 0;
            while (readFile.hasNextInt()) {
                numbers[i++] = readFile.nextInt();
            }
            showElements(numbers);

        }
        readFile.close();
    }

    private static void showElements(int[] numbers) {
        System.out.println("Các phần tử trong mảng");
            for (int number : numbers) {
                System.out.print(number + " ");
        }
    }
}
