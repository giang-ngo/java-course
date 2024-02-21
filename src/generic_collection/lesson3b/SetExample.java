package generic_collection.lesson3b;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Student s1 = new Student("S1", "Nam");
        Student s2 = new Student("S2", "Nhung");
        Student s3 = new Student("S3", "Hoa");
        Student s4 = new Student("S4", "Linh");

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        hashSet.add(s4);
        hashSet.add(s4);

        for (var e : hashSet) {
            System.out.println(e);
        }

        System.out.println("=============================");

        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);

        for (var e : treeSet) {
            System.out.println(e);
        }
    }
}
