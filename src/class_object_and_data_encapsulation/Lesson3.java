package class_object_and_data_encapsulation;

//import static java.lang.System.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class Lesson3 {
    public static void main(String[] args) {
//        TÍNH ĐÓNG GÓI DỮ LIỆU
        Student3 tony = new Student3();
        tony.setFullName("Tony Stark");
        tony.setStudentId("1");
        tony.setAvgGrade(3.6f);
//        tony.setAddress("");
        var fullName = tony.getFullName();


        out.println("Điểm TB: " + tony.getAvgGrade());
        out.println("Mã Sv: " + tony.getStudentId());
        out.println("Họ và tên: " + fullName);
    }
}
