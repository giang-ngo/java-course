package array;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        int[] numbers = {9, 8, 5, 2, 3, 1, 0, 4, 7, 8, 9, 100, 7};
        System.out.println("Mảng gốc ban đầu: ");
        showArray(numbers);
//        bubbleSort(numbers);
        Arrays.sort(numbers, 2, 13);
        System.out.println("Mảng sau khi sắp xếp: ");
        showArray(numbers);

    }

    /**
     * phương thức sắp xếp nổi bột theo thứ tự tăng dần
     *
     * @param numbers chứa mảng cần sắp xếp
     */
    private static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] > numbers[j - 1]) {
                    int x = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = x;
                }
            }
        }
    }

    private static void showArray(int[] numbers) {
        System.out.println("Các phần tử của mảng là: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // in xuống dòng
    }

}
