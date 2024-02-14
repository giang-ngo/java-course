package inheritance.lesson4;


import java.util.Date;

public class Person {
    private String fullName;
    private Date dateOfBirth;

    public final void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void work() {
        System.out.println("Người đang làm việc...");
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
