package generic_collection.lesson3b;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        Student s1 = new Student("S1", "Nam");
        Student s2 = new Student("S2", "Nhung");
        Student s3 = new Student("S3", "Hoa");
        Student s4 = new Student("S4", "Linh");


        LinkedList<Student> students = new LinkedList<>();
        int index = 3;
        students.add(s1);
        students.addLast(s1);
        students.add(2, s1);
        students.addLast(s2);
        students.addFirst(s3);

        if (index < students.size()) {
            students.add(index, s4);
        }

        // sử dụng iterator
        var iterator = students.iterator();
        var listIterator = students.listIterator(students.size());
        System.out.println("=======================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ===>");
        }


        System.out.println("=======================");

        // duyệt từ cuối lên đầu
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous() + " <===");
        }


//        System.out.println("=========================");
//        System.out.println(students.getFirst());
//        System.out.println("=========================");
//        System.out.println(students.getLast());
    }
}
