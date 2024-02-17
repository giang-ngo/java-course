package methods.lesson4;

import static java.lang.Math.sin;
import static java.lang.Math.toRadians;
import static methods.lesson4.Calculator.add;

public class Lesson4Example2 {
    public static void main(String[] args) {
        var angle = 90;
        var angleRadian = toRadians(angle);
        var sinX = sin(angleRadian);
        var sum = add(1.1212, 2.089, 3.4343);
        System.out.println(sum);
    }
}
