package inheritance.lesson7;

import java.util.Objects;

public class Person {
    private String id;
    private String phoneNumber;

    @Override
    public boolean equals(Object other) {//bước 1
        if (this == other) return true;//bước 2
        if (other == null// bước 3
                || getClass() != other.getClass()) return false;// bước 4
        Person person = (Person) other;//bước 5
        return Objects.equals(id, person.id) && Objects.equals(phoneNumber,
                person.phoneNumber);// bước 6
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phoneNumber);
    }
}
