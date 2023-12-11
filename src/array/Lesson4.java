package array;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
//        int[][] matrix = new int[][]{
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//        };
//        long[][] balances;
//        Ví dụ 1: Vẽ hình chữ nhật bằng các dấu *

//        var input = new Scanner(System.in);
//        System.out.println("Nhập vào số hàng số cột của hình chữ nhật: ");
//        var height = input.nextInt();
//        var width = input.nextInt();
//        if (height > 0 && width > 0) {
//            String[][] rect = new String[height][width];
//            fillStars(rect);
//            onScreen(rect);
//        } else {
//            System.out.println("Số hàng và cột phải nguyên dương");
//        }
//    }
//
//    /**
//     * phương thức vẽ lên màn hình
//     *
//     * @param rect
//     */
//    private static void onScreen(String[][] rect) {
//        for (int i = 0; i < rect.length; i++) {
//            for (int j = 0; j < rect[i].length; j++) {
//                System.out.print(rect[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//    /**
//     * phương thức điền dấu * vào hình chữ nhật
//     *
//     * @param rect mảng hình chữ nhật
//     */
//    private static void fillStars(String[][] rect) {
//        for (int i = 0; i < rect.length; i++) {
//            for (int j = 0; j < rect[i].length; j++) {
//                rect[i][j] = " * ";
//            }
//        }

//        Ví dụ 2: Vẽ tam giác số
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều cao của tam giác: ");
        int h = input.nextInt();
        var triangle = new int[h][];
        for (int i = 0; i < h; i++) {
            triangle[i] = new int[i + 1];

        }
        fillTriangle(triangle);
        onScreen(triangle);

    }

    private static void onScreen(int[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.printf("%5d", triangle[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * phương thức vẽ hình tam giác số vuông gốc trái dưới bằng các chữ số
     *
     * @param triangle mảng zigzag chứa kết quả
     */
    private static void fillTriangle(int[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = i + j;
            }

        }
    }
}
