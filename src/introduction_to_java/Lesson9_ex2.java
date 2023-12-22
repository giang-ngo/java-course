package introduction_to_java;

public class Lesson9_ex2 {
    public static void main(String[] args) {
        var fullName = "Họ và tên";
        var address = "Địa chỉ";
        var gpa = "Điểm gpa";

        var result = String.format("%-35s%-30s%-15s", fullName, address, gpa);
        System.out.println(result);

        System.out.printf("%-35s%-30s%-15.2f%n", "Le Cong Tuan", "HCM", 3.66);
        System.out.printf("%-35s%-30s%-15.2f%n", "Nguyen Van A", "Da Nang", 3.76);
        System.out.printf("%-35s%-30s%-15.2f%n", "Nguyen Anh Tuan", "Ninh Thuan", 3.86);
    }
}
