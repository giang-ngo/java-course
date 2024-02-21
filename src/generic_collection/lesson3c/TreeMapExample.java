package generic_collection.lesson3c;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Student s1 = new Student("S5", "Nam");
        Student s2 = new Student("S2", "Nhung");
        Student s3 = new Student("S1", "Hoa");
        Student s4 = new Student("S3", "Linh");
        Student s5 = new Student("S4", "Vy");

        TreeMap<String, Student> studentTreeMap = new TreeMap<>();

        studentTreeMap.put(s4.getId(), s4);
        studentTreeMap.put(s2.getId(), s2);
        studentTreeMap.put(s1.getId(), s1);
        studentTreeMap.put(s3.getId(), s3);
        studentTreeMap.put(s5.getId(), s5);

        System.out.println(studentTreeMap.get("S1"));

        System.out.println(studentTreeMap.keySet());
        System.out.println(studentTreeMap.values());
    }
}
