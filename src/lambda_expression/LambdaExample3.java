package lambda_expression;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaExample3 {
    public static void main(String[] args) {
        String[] friends = new String[]{"Mai", "Nam", "Nhân", "Tuấn", "Hải", "An"};
        Arrays.sort(friends, Comparator.reverseOrder());
        for (var f : friends) {
            System.out.print(f + " ");
        }
    }
}
