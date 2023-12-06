package conditionsAndLoops;

public class Lesson3 {
    public static void main(String[] args) {
        int n = 120;
//        var result = "";
//        if (n % 2 == 0) {
//            result = "n là số chẵn";
//        } else {
//            result = "n là số lẽ";
//        }

//        System.out.println((n % 2 == 0) ? "n là số chẵn" : "n là số lẻ");

        var result = n % 2 == 0 ? true : n % 3 == 0 ? true : n % 5 == 0;
//        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
//            result = true;
//        } else {
//            result = false;
//        }


        System.out.println("n chia hết cho 2 hoặc 3 hoặc 5? " + result);
    }

}
