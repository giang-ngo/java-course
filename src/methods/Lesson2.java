package methods;

public class Lesson2 {
    public static void main(String[] args) {
// NẠP CHỒNG TOÁN TỬ

// Viết pthuc nạp chồng tính tổng 2 số.
// Các kiểu cần hỗ trợ là int, long, float, double

//        System.out.println(add(1, 2));
//        System.out.println(add(1.323, 2.343));
//        System.out.println(add(1000000000000L, 2000000000000L));
//        System.out.println(add(1.323f, 2.343f));

// Viết phương thức để tìm giá trị lớn nhất trong 3 số.
//  Các kiểu cần hỗ trợ là int, long, float, double

        System.out.println(findMax(2, 2, 2));
        System.out.println(findMax(1.12f, 2.45f, 3.23f));
        System.out.println(findMax(1.12, 2.45, 3.23));
        System.out.println(findMax(13243242424L, 24, 32));

    }

    /**
     * Phương thức tìm giá trị lớn nhất
     *
     * @param a
     * @param c
     * @param b
     * @return giá trị max
     */
    public static int findMax(int a, int c, int b) {
        int maxValue = a;

        if (b > maxValue) {
            maxValue = b;
        }

        if (c > maxValue) {
            maxValue = c;
        }

        return maxValue;
    }

    public static long findMax(long a, long c, long b) {
        long maxValue = a;

        if (b > maxValue) {
            maxValue = b;
        }

        if (c > maxValue) {
            maxValue = c;
        }

        return maxValue;
    }

    public static float findMax(float a, float c, float b) {
        float maxValue = a;

        if (b > maxValue) {
            maxValue = b;
        }

        if (c > maxValue) {
            maxValue = c;
        }

        return maxValue;
    }

    public static double findMax(double a, double c, double b) {
        double maxValue = a;

        if (b > maxValue) {
            maxValue = b;
        }

        if (c > maxValue) {
            maxValue = c;
        }

        return maxValue;
    }

    /**
     * phương thức tính tổng 2 số nguyên
     *
     * @param a
     * @param b
     * @return tổng a+b
     */
//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    public static long add(long a, long b) {
//        return a + b;
//    }
//
//    public static float add(float a, float b) {
//        return a + b;
//    }
//
//    public static double add(double a, double b) {
//        return a + b;
//    }
}
