package polymorphism.lesson1;

import java.util.Date;

public class Person {
    private String fullName;
    private Date dateOfBirth;

    //...
    // phương thức gốc trong lớp cha
    public void work() {
        System.out.println("Người đang làm việc...");
    }

    public final void setFullName(String fullName) {
        this.fullName = fullName;
    }
}


class Student extends Person {
    private String studentId;
    //...


    @Override
    public void work() {
//        super.work();
        System.out.println("Sinh viên đang học bài...");
    }


}