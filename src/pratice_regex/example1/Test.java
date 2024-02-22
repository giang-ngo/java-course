package pratice_regex.example1;

import java.util.Scanner;

/**
 * Ví dụ 1: Kiểm tra định dạng mã sinh viên.
 * <br>
 * Mã sinh viên là một String gồm cả chữ cái và số không phân biệt chữ hoa chữ thường. Định dạng chuẩn của mã sinh viên như sau:
 * Bắt đầu bởi các chữ cái a, b, hoặc c
 * Sau đó là 2 số
 * Tiếp đó là 4 chữ cái
 * Kết thúc bởi 3 chữ số
 * Ví dụ mã sinh viên hợp lệ:
 * B25DCCN123
 * B20DCVT111
 * A21DCKD515
 * Nếu mã sinh viên nhập vào là chuẩn thì ta viết hoa tất cả các chữ cái của mã này
 * rồi lưu vào đối tượng sinh viên.
 * Nếu mã sinh viên không đúng thì văng ngoại lệ
 * compile time exception: InvalidStudentIdException thông báo mã sinh viên không hợp lệ.
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Nhập mã sinh viên theo định dạng đã cho:");
        var input = new Scanner(System.in);
        var id = input.nextLine();
        try {
            student.setId(id);
        } catch (InvalidStudentIdException e) {
            System.out.println(e.getMessage());
            System.out.println("Ví dụ mã hợp lệ: B25DCCN123");
        }

        System.out.println("Mã sinh viên là: " + student.getId());
    }
}
