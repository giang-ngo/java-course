package class_object_and_data_encapsulation.lesson9;

import class_object_and_data_encapsulation.Season;

public class lesson9 {
    public static void main(String[] args) {

        Student nam = new Student();
        Student.FullName fullName = nam.new FullName();
        Season spring = Season.SPRING;
        class_object_and_data_encapsulation.lesson9.Season fall = class_object_and_data_encapsulation.lesson9.Season.FALL;
    }
}

class Address {

}
