package generic_collection.lesson3c;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Student> studentHashMap = new HashMap<>();
        HashMap<Integer, String> counterHashMap = new HashMap<>();

        Student s1 = new Student("S1", "Nam");
        Student s2 = new Student("S2", "Nhung");
        Student s3 = new Student("S3", "Hoa");
        Student s4 = new Student("S4", "Linh");
        Student s5 = new Student("S5", "Vy");

        studentHashMap.put(s1.getId(), s1);
        studentHashMap.put(s2.getId(), s2);
        studentHashMap.put(s3.getId(), s3);
        studentHashMap.put(s4.getId(), s4);
        studentHashMap.put("S5", s1);


        System.out.println(studentHashMap.keySet());
        System.out.println(studentHashMap.values());

//        System.out.println("Đối tượng ứng với key S1: " + studentHashMap.get("S1"));
//
//        System.out.println("Đối tượng ứng với key S10: " +
//                studentHashMap.getOrDefault("S10", s1));
//
//        System.out.println("Số lượng phần tử của map: " + studentHashMap.size());
    }
}
