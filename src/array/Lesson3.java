package array;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        int[] numbers = {9, 8, 5, 2, 3, 1, 0, 4, 7, 8, 9, 100, 7};
        Arrays.sort(numbers);
        System.out.println("Mảng gốc ban đầu: ");
        showArray(numbers);
        System.out.println("Nhập giá trị cần tìm: ");
        var x = new Scanner(System.in).nextInt();
//        int index = linearSearch(numbers, x);
        int index = Arrays.binarySearch(numbers, 0, 5, x);
        var result = index < 0 ? "Không tồn tại x"
                : "Tìm thấy x tại vị trí " + index;
        System.out.println(result);
    }


    /**
     * phương thức tìm kiếm tuyến tính
     *
     * @param numbers
     * @param x       giá trị tìm kiếm
     * @return index trả về
     */
    private static int linearSearch(int[] numbers, int x) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                return i;
            }
        }
        return -1;
    }

    /**
     * phương thức hiển thị các phần tử của mảng nguyên
     *
     * @param numbers mảng chứa dữ liệu cần hiển thị
     */
    private static void showArray(int[] numbers) {
        System.out.println("Các phần tử của mảng là: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // in xuống dòng
    }

}
