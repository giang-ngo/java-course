package inheritance.lesson3;

public class Father {
    private String bankAccPassword; // mật khẩu tk ngân hàng
    //...
    protected void setBankAccPassword(String newPws) {
        bankAccPassword = newPws;
    }
}