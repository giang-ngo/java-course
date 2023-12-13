package classObjectDataEncapsulation;

public class Lesson3 {
    public static void main(String[] args) {
//        TÍNH ĐÓNG GÓI DỮ LIỆU
        Student3 tony = new Student3();
        tony.setFullName("Tony*");
        tony.setStudentId("1");
        tony.setAvgGrade(3.6f);
//        tony.setAddress("");
        String fullName = tony.getFullName();


        System.out.println("Điểm TB: " + tony.getAvgGrade());
        System.out.println("Mã Sv: " + tony.getStudentId());
        System.out.println("Họ và tên: " + fullName);
    }
}
