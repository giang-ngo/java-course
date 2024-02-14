package abstraction.lesson4;

public class Father {
    public void speak() {
        System.out.println("Father is speaking English");
    }
}

class FatherExample {
    public static void main(String[] args) {
        // tạo lớp vô danh kế thừa lớp Father
        Father son = new Father() {
            @Override
            public void speak() {
                super.speak();
                System.out.println("Son is speaking Vietnamese");
            }
        };

        son.speak();
    }
}
