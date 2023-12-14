package classObjectDataEncapsulation;

import java.util.ArrayList;

public class Lesson8 {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        String nam = "Nam";
        String loan = "Loan";
        String linh = "Linh";
        friends.add(nam);
        friends.add(loan);
        friends.add(0, linh);
        friends.add("Long");
        friends.add(2, "Hoang");
        friends.add("Hoang");


//        friends.set(0, "Khanh");
//        friends.remove("Long");
//        friends.remove(1);

//        friends.clear();
        System.out.println("Kích thước của friends = " + friends.size());
        System.out.println("Index of \"Hoang\" = " + friends.indexOf("Hoang"));
        System.out.println("Last Index of \"Hoang\" = " + friends.lastIndexOf("Hoang"));
        System.out.println(friends.isEmpty());
        String[] friendsArr = new String[friends.size()];
        friends.toArray(friendsArr);

//        for (int i = 0; i < friends.size(); i++) {
//            System.out.print(friends.get(i) + " ");
//        }

        for (int i = 0; i < friendsArr.length; i++) {
            System.out.print(friendsArr[i] + " ");
        }

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(100);

    }
}
