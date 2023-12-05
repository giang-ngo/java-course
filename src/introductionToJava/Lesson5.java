package introductionToJava;

import java.text.DecimalFormat;

public class Lesson5 {
    public static void main(String[] args) {
//        float x = (float) 3.141592653589793238462643383279;
//        int y = (int)x;
//        System.out.println(y);
        int a = 1000;
        int b = 3;
        double result = 1.0f * a / b;

//        Integer aObj = a;
//        int t =  aObj;
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.println(format.format(result));
        System.out.println((int)Math.floor(result));//Làm tròn xuống
        System.out.println(Math.ceil(result));//làm tròn lên
        System.out.println(Math.round(result));//làm tự động
//        System.out.printf("%10.2f", result);
//        System.out.println(aObj);
    }
}
