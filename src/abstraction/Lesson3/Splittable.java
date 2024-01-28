package abstraction.Lesson3;

import java.util.Arrays;

public interface Splittable {
    private static String[] splitByWhitespace(String src) {
        return src.split("\\s+");
    }

    // phương thức tách lấy tên của một người từ String cho trước
    static String getFirstName(String fullName) {
        if (fullName == null) {
            return null;
        }
        var words = splitByWhitespace(fullName);
        return words[0];
    }

    // một phương thức abstract
    String[] split(String src, String regex);
}

class Example2 implements Splittable {
    @Override
    public String[] split(String src, String regex) {
        if (src == null) {
            return null;
        }
        return src.split(regex);
    }

    public static void main(String[] args) {
        Example2 example = new Example2();
        var result = example.split("I love You", " ");
        System.out.println(Arrays.deepToString(result));

        // gọi phương thức static:
        var fullName = "Trung Trần Văn";
        System.out.println("Tên trong \""
                + fullName + "\": " + Splittable.getFirstName(fullName));
    }
}