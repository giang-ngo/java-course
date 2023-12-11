package array;

import java.util.Scanner;


public class Lesson1 {
    public static void main(String[] args) {
//        String[] brands = new String[]{"Apple", "Samsung", "Huawei", "Oppo"};
//
//        String[] other = Arrays.copyOf(brands, 10);
//        other[0] = "Xiaomi";
//        System.out.println(brands[0]);
//        System.out.println(other[0]);
//        System.out.println(other[9]);

//        for (int i = 0; i < brands.length; i++) {
//            System.out.println(brands[i]);
//        }
//
////        Dùng foreach
//        for (var item : brands) {
//
//            System.out.println(item);
//            item = item + "abc";
//
//        }

//     Ví dụ 1:Nhập tên n người bạn lưu vào mảng, tìm người có tên dài nhất để hiển thị ra màn hình
        var input = new Scanner(System.in);

        System.out.println("Nhập số lượng người bạn của bạn: ");
        var n = input.nextInt();
        if (n < 0) {
            System.out.println("Nhập số lượng là số nguyên dương");
        } else {
//            String[] friends = getFriends(n, input);
            var friends = getFriends(n, input);

            showResult(friends);
        }

    }


    /**
     * phương thức hiển thị những người có tên dài nhất
     *
     * @param friends danh sách những người bạn
     */
    private static void showResult(String[] friends) {
        System.out.println("Danh sách những người có tên dài nhất: ");
        int maxLength = findMaxLength(friends);
        for (var friend : friends) {
            if (friend.length() == maxLength) {
                System.out.println(friend + " ");

            }
        }
    }

    /**
     * phương thức tìm độ dài lớn nhất của tên có trong danhs sách
     *
     * @param friends danh sách đã chứa những tên cần tìm độ dài max
     * @return độ dài lớn nhất tìm được
     */
    private static int findMaxLength(String[] friends) {
        int max = 0;
        for (int i = 0; i < friends.length; i++) {
            if (friends[i].length() > max) {
                max = friends[i].length();
            }
        }
        return max;
    }

    /**
     * phương thức này dùng để nhập vào tên n người
     *
     * @param n     là số phần tử mảng
     * @param input đối tượng của lớp Scanner
     * @return mảng danh sách những người bạn
     */
    private static String[] getFriends(int n, Scanner input) {
        var friends = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập tên người bạn thứ (" + i + "): ");
            friends[i] = input.next();

        }
        return friends;
    }
}
