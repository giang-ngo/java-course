package generic_collection.lesson1;

import java.util.ArrayList;

public class Lesson1 {
    public static void main(String[] args) {
        // tạo danh sách bạn bè kiểu String
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Linh");
        friends.add("Hương");
        friends.add("Phương");
        friends.add("Loan");

        // danh sách các con số kiểu nguyên Integer
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("S1"));
        students.add(new Student("S2"));
        students.add(new Student("S3"));

        Lesson1 lesson1 = new Lesson1();

        System.out.println("Danh sách những người bạn: ");
        showList(friends);
        System.out.println("Người có tên sau cùng trong danh sách: " +
                lesson1.findMax(friends));


        System.out.println("Danh sách các giá trị Integer: ");
        showList(numbers);
        System.out.println("Phần tử có giá trị lớn nhất: " +
                lesson1.findMax(numbers));

//        var maxStudent = lesson1.findMax(students);




//
//        Lesson1 obj = new Lesson1();
//        System.out.println("Phần tử chính giữa danh sách những người bạn: "
//                + obj.getMid(friends));
//
//        System.out.println("Phần tử chính giữa danh sách các con số: "
//                + obj.getMid(numbers));


    }

    public <T extends Comparable> T findMax(ArrayList<T> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        var max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }

    /**
     * phương thức dùng để hiển thị danh sách các phần tử của 1
     * kiều bất kì nào đó
     *
     * @param list danh sách cần hiển thị
     * @param <T>  kiểu của các phần tử trong danh sách
     */
    private static <T> void showList(ArrayList<T> list) {
        for (var e : list) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public <T> T getMid(ArrayList<T> list) {
        int mid = list.size() / 2;
        return list.get(mid);
    }
}
