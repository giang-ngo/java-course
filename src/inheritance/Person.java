package inheritance;

import java.util.Date;

public class Person {
    private String fullName;
    private Date dateOfBirth;
    //...

    protected Person() {
        fullName = "No Name";
        dateOfBirth = new Date();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

class Student extends Person {
    private String studentId;
    //...

    public Student() {
        super();
    }

    public static void main(String[] args) {
        Student nam = new Student();
//        nam.fullName = "Trần Văn Nam";
        nam.setFullName("Trần Văn Nam"); // very good!
    }
}
