package pratice_regex.example2;

import java.util.Scanner;

/**
 * Ví dụ 2: Kiểm tra định dạng mã nhân viên.
 * Định dạng mã nhân viên của một công ty không phân biệt chữ hoa chữ thường và được cho như sau:
 * Mã nhân viên bắt đầu với NV hoặc EMP
 * Tiếp đó là 6 số
 * Kết thúc bởi mã phòng ban có 2 đến 5 chữ cái
 * Ví dụ mã nhân viên hợp lệ:
 * NV100000IT
 * NV100001GV
 * NV100002GDNS
 * NV100003CVKD
 * Nếu mã nhân viên không hợp lệ thì văng ngoại lệ
 * InvalidEmpIdException thông báo mã nhân viên không hợp lệ.
 * Đây là một compile time exception. Nếu mã nhập vào hợp lệ,
 * viết hoa toàn bộ mã nhân viên và gán vào cho đối tượng nhân viên.
 */
public class Test {
    public static void main(String[] args) {
        var emp = new Employee();
        var input = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên, ví dụ: NV100000IT");
        var id = input.nextLine().trim();
        try {
            emp.setId(id);
        } catch (InvalidEmpIdException e) {
            System.out.println(e.getMessage());
            System.out.println("Ví dụ mã hợp lệ: NV100000IT");
        }

        System.out.println("Mã nhân viên vừa nhập là: " + emp.getId());
    }
}
