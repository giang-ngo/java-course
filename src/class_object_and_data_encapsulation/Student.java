package class_object_and_data_encapsulation;

public class Student {
    // Properties
    public String studentId;
    public String fullName;
    public float avdGrades;
    public String address;
    public String email;

//    Constructors

    public Student() {
        fullName = "";
        avdGrades = 0;
        studentId = "";

    }

    public Student(String id) {
        studentId = id;
    }

    public Student(String id, String name) {
        studentId = id;
        fullName = name;
    }

//    Methods

    public void doHomework(String subject) {
        System.out.println(fullName + " đang làm bài tập " + subject);
    }

    public void doExam(String subject) {
        System.out.println(fullName + " đang làm bài thi " + subject);
    }
}
