package callback;

interface GreetAble {
    void greet();

}

public class LearnCallback {
    public static void main(String[] args) {
        CatGreeting catGreeting = new CatGreeting();
        DuckGreeting duckGreeting = new DuckGreeting();
        PigGreeting pigGreeting = new PigGreeting();

        var test = new LearnCallback();


        System.out.println("Lời chào của loài mèo:");
        test.sayGreeting(catGreeting);


        System.out.println("Lời chào của loài vịt:");
        test.sayGreeting(duckGreeting);


        System.out.println("Lời chào của loài heo:");
        test.sayGreeting(pigGreeting);
    }

    public void sayGreeting(GreetAble greetAble) {
        greetAble.greet();
    }
}

class CatGreeting implements GreetAble {
    @Override
    public void greet() {
        System.out.println("Meo meo");
    }
}

class PigGreeting implements GreetAble {
    @Override
    public void greet() {
        System.out.println("Ụt ụt ịt ịt");
    }
}


class DuckGreeting implements GreetAble {
    @Override
    public void greet() {
        System.out.println("Quạc quạc quạc");
    }
}
