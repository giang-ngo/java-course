package pratice_regex.example3;

import pratice_regex.example2.InvalidEmpIdException;

import java.util.Scanner;

/**
 * Ví dụ 3: Kiểm tra định dạng email
 * <br>
 * Giả sử định dạng email của Google được cho như sau:
 * Bắt đầu bởi chữ cái
 * Tiếp đó là các kí tự có thể là chữ cái, chữ số, dấu chấm, dấu gạch dưới
 * Tiếp theo là @gmail
 * Kết thúc bởi đuôi .com
 * Không phân biệt chữ hoa chữ thường
 * Ví dụ email hợp lệ:
 * thantrieu@gmail.com
 * hoanganh123_jinx@gmail.com
 * Ví dụ email không hợp lệ:
 * than trieu@gmail.com
 * Hoang^o^oanh###@gmail.co
 * Nếu email không hợp lệ thì gán email bằng null,
 * văng ngoại lệ InvalidEmailException thông báo cho người dùng biết và xử lý.
 * Nếu email hợp lệ thì thông báo ra màn hình email hợp lệ.
 */


/**
 * Ví dụ 4: Kiểm tra định dạng email
 * <br>
 * Định dạng mật khẩu của tài khoản người dùng trong một hệ thống nào đó được cho như sau:
 * Dài tối thiểu 8 kí tự
 * Bao gồm cả kí tự chữ cái thường, chữ cái hoa
 * Chứa tối thiểu 1 kí tự số và 1 kí tự đặc biệt(~!@#$%^&*)
 * Mật khẩu không được trùng với địa chỉ email của người dùng
 * Ví dụ email của người dùng là thantrieu@gmail.com thì mật khẩu hợp lệ là:
 * thanTH27@blabla
 * momyGO111!
 * Mật khẩu không hợp lệ:
 * thantrieu@gmail.com
 * 123456789
 * Abcblablabla
 * Abcblabla123
 * Nếu mật khẩu không hợp lệ thì gán mật khẩu bằng null,
 * văng ngoại lệ InvalidPasswordException thông báo cho người dùng biết.
 * Nếu mật khẩu hợp lệ thông báo ra màn hình mật khẩu hợp lệ.
 */
public class Test {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var email = "thuyGIiang212@gmail.com";
//        System.out.println("Nhập email: ");
//        var email = input.nextLine().trim();
        User user = new User();
        try {
            user.setEmail(email);
            System.out.println("Email hợp lệ: " + email);
        } catch (InvalidEmpIdException e) {
            System.out.println(e.getMessage());
            System.out.println("Email vừa nhập không đúng!");
        }

        //nhập mật khẩu
        System.out.println("Nhập mật khẩu gồm có chữ số, " +
                "chữ cái thường, chữ cái hoa, kí tự đặc biệt," +
                " không trùng với email, tối thiểu 8 kí tự trở lên: ");

        var password = input.nextLine();
        try {
            user.setPassword(password);
            System.out.println("Mật khẩu hợp lệ!");
        } catch (InvalidPasswordException e) {
            e.printStackTrace();
            System.out.println("Hãy nhập đúng định dạng mật khẩu!");

        }

    }
}
