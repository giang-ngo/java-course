package lambda_expression;

public class LambdaExample1 {
    public static void main(String[] args) {
        ButtonClass button = new ButtonClass();
        button.pressEvent(() -> System.out.println("Nút đăng nhập được click"));
        button.pressEvent(() -> System.out.println("Nút đăng kí được click"));
        button.pressEvent(() -> System.out.println("Nút đăng xuất được click"));
    }
}

class ButtonClass {
    public void pressEvent(PressHandler handler) {
        handler.pressEventHandler();
    }
}

interface PressHandler {
    void pressEventHandler();
}
