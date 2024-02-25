package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson1 {
    public static void main(String[] args) {
        String str = "Dear Karly\nIf after 1-2 months nothing changes, I want to go somewhere with you          ";
        String str2 = "gu của me là me là có ngoại hình và nhìn ngon ;>," +
                " do đây là public nên me ko tiện nói nhìu, " +
                "you có thể nhắn riêng cũng đc, " +
                "hong phải lúc nào me cũng soạn " +
                "code bài bản ròi spam với you đc, me sẽ học cái khác" +
                " và me cũng update kiến thức liên tục, " +
                "các jobs ở cty you ko có lấy 1 vị trí me yêu thích " +
                "nên sau này chúng ta sẽ ko hợp tác thêm 1 lần nào nữa";

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
