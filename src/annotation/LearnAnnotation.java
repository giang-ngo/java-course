package annotation;


@SuppressWarnings("all")
public class LearnAnnotation {
//    @Deprecated
//    @Override
//    @SuppressWarnings
//    Các meta-annotation

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Thread thread = new Thread("My thread");
        thread.stop();

        var myObj = new LearnAnnotation();
        myObj.printMessage("Hello");
    }

    /**
     * @param msg the message to print on screen
     * @deprecated This method is no longer supported next year
     */

    @Deprecated(since = "2.0", forRemoval = true)
    public void printMessage(String msg) {
        System.out.println("Message: " + msg);
    }
}

interface Calculable {
    int add(int a, int b);
}

@SuppressWarnings("unused")
class Calculator implements Calculable {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
