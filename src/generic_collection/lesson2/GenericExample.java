package generic_collection.lesson2;

import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args) {
        // dùng kiểu generic_collection ArrayList<T> để lưu các giá trị kiểu String
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Nhung");
        friends.add("Linh");
        friends.add("Khánh");
        friends.add("Loan");

        // dùng kiểu generic_collection ArrayList<T> để lưu giá trị số thực:
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(1.25);
        doubles.add(3.12456);
        doubles.add(6.1454);
        doubles.add(99.899);

        // dùng kiểu generic_collection ArrayList<T> lưu các đối tượng của lớp Student
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("B25DCCN100", "Ngô Thùy Linh"));
        students.add(new Student("B25DCCN101", "Nguyễn Phương Hoa"));
        students.add(new Student("B25DCCN102", "Trần Xuân Nhật"));
        students.add(new Student("B25DCCN103", "Lê Hoài Nam"));

        // hiển thị danh sách các kiểu trên
        showInfo(friends);
        showInfo(doubles);
        showInfo(students);
    }

    /**
     * phương thức dùng để hiển thị danh sách các phần tử kiểu T nào đó
     *
     * @param list danh sách cần hiển thị ra màn hình
     * @param <T>  kiểu của các phần tử trong danh sách
     */
    private static <T> void showInfo(ArrayList<T> list) {
        System.out.println("==========================================");
        for (var e : list) {
            System.out.println(e);
        }
    }
}
