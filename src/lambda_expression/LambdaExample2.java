package lambda_expression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaExample2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Nhung", "Phạm", "0912345687", "12/12/2000"));
        people.add(new Person("Hồng", "Nguyễn", "0912345684", "10/12/2002"));
        people.add(new Person("Mai", "Trần", "0912345685", "12/10/2003"));
        people.add(new Person("Thanh", "Hoàng", "0912345686", "10/10/2001"));
        people.add(new Person("Khánh", "Ngô", "0912345688", "05/06/2000"));
        people.add(new Person("Minh", "Lê", "0912345689", "08/04/2001"));


        people.sort(Person::compareFirstname);

        showPeopleInfo(people);
    }

    private static void showPeopleInfo(List<Person> people) {
//        for (var p : people) {
//            System.out.println(p);
//        }

        people.forEach(p -> {
//            if (p.getFirstName().startsWith("H")) {
                System.out.println(p);
//            }
        });
    }
}
