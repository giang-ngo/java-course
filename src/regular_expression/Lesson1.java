package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson1 {
    public static void main(String[] args) {
        String str = "Dear Karly\nIf after 1-2 months nothing changes, I want to go somewhere with you          ";
        String str2 = "me sẽ nổ địa chỉ và cho you 1 cơ hội tìm hiểu như đã hứa," +
                " ;> me đi làm là me tập lái xe lun chứ me chưa có bằng lái";

        String regex = "\\s";
        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(str);
        Matcher matcher = pattern.matcher(str2);


//        System.out.println("str có khớp với regex? " + matcher.matches());
//        while (matcher.find()) {
//            System.out.println("Bắt đầu: " + matcher.start() + " - " + "Kết thúc: " + matcher.end());
//        }

//        var words = str.split(regex);// pattern.split(str);

//        var newStr = matcher.replaceFirst("_");
        var newStr = matcher.replaceAll("__");
        System.out.println(newStr);
//        showWords(words);


    }

    private static void showWords(String[] result) {
        for (var word : result) {
            System.out.println(word);
        }
    }
}
