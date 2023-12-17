package introduction_to_java;

public class Lesson8 {
    public static void main(String[] args) {
        System.out.println(Math.E);
        System.out.println(Math.PI);

        var r = 3.5454;
        var area = r * r * Math.PI;
        System.out.println(area);
        System.out.println(Math.abs(-100.21));
        System.out.println("asin(0.8660254037844386) = " + Math.toDegrees(Math.asin(0.8660254037844386)));

        int x = -100;
        System.out.println(Math.sqrt(x));
        System.out.println(Math.cbrt(x));

    }
}
