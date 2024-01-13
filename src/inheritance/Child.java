package inheritance;

public class Child extends Father {
    // các trường dữ liệu...
    //...
    // phương thức cập nhật mật khẩu:
    public void updateBankInfo(String newPassword) {
        if(newPassword.contains("^[a-zA-Z0-9/+-]$")) { // các điều kiện...
            setBankAccPassword(newPassword); // thiết lập mật khẩu ok
        }
    }
}
