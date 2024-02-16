package callback;

public class CallbackExample2 {
    public static void main(String[] args) {
        Button myButton = new Button();
        Handler handler = new Handler();
        myButton.onClick(handler);

        new Button().onClick(() -> System.out.println("Nút đăng kí khác đang được nhấn"));
        new Button().onClick(() -> System.out.println("Nút đăng nhập khác đang được nhấn"));
        new Button().onClick(() -> System.out.println("Nút đăng xuất khác đang được nhấn"));
    }
}

interface EvenHandler {
    void clickEventHandler();
}

class Button {
    public void onClick(EvenHandler handler) {
        handler.clickEventHandler();
    }
}

class Handler implements EvenHandler {
    @Override
    public void clickEventHandler() {
        System.out.println("Nút bấm đang được click");
    }
}
