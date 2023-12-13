package classObjectDataEncapsulation;

public class Lesson1 {
    public static void main(String[] args) {
        Student linh = new Student("SV1", "Trần Thu Linh");
        Student nam = new Student();
        Student nhan = new Student("SV2");

        nhan.fullName = "Nguyễn Đức Nhân";
        System.out.println("Tên tôi là " + nhan.fullName);
        System.out.println("Độ dài tên " + nhan.fullName.length());
        nhan.doExam("Lập trình Java");
        linh.doExam("Toán cao cấp");

    }
}
