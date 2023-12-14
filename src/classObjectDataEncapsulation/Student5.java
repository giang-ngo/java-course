package classObjectDataEncapsulation;

public class Student5 {

    // các thuộc tính:
    private String studentId;   // mã sinh viên
    private String fullName;    // họ tên đầy đủ
    private String email;       // địa chỉ email
    private String address;     // địa chỉ cư trú


    // các phương thức:
    public void doHomework() {
        //...
    }


}

class Subject {
    // thông tin liên quan môn học:
    private String subjectId;   // mã môn
    private String subjectName; // tên môn
    private int numOfLesson;    // số tiết học
    private int credit;         // số tín chỉ

    public void addNewSubject(String id, String name) {
        //...
    }
}


class Course {
    // thông tin liên quan khóa học học:
    private String courseId;     // mã lớp
    private float gradeLevel1;  // điểm hệ số 1
    private float gradeLevel2;  // điểm hệ số 2
    private float avgGrade;     // điểm TB
    private String courseName;   // tên lớp
    private String instructor;  // tên giảng viên
    private Student5 student5;
    private Subject subject;


    public String calculateAvgGrade() {
        return null;

    }

    public String studentLevel(float grade) {
        return null;
    }
}