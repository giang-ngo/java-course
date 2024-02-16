package lambda_expression;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Date birthDate;

    public Person() {
        birthDate = new Date();
    }

    public Person(String firstName, String lastName, String phoneNumber, String birthDate) {
        this.birthDate = createDate(birthDate);
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    private Date createDate(String birthDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        if (birthDate != null && !birthDate.isEmpty()) {
            try {
                return dateFormat.parse(birthDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return new Date();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDate=" + dateFormat.format(birthDate) +
                '}';
    }

    public static int compareFirstname(Person person, Person other) {
        return person.getFirstName().compareTo(other.getFirstName());
    }
}
