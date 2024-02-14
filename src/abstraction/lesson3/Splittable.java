package abstraction.lesson3;

import java.util.Arrays;

public interface Splittable {
    // phương thức private static
    private static String[] splitByWhitespace(String src) {
        return src.split("\\s+");
    }

    // phương thức tách lấy tên của một người từ String cho trước
    static String getFirstName(String fullName) {
        if (fullName == null) {
            return null;
        }
        // gọi phương thức private static để tách các từ trong tên
        var words = splitByWhitespace(fullName);
        return words[0]; // giả định tên đứng đầu tiên trong họ tên
    }

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
        var result = example.split("Are you sure?", " ");
        System.out.println(Arrays.deepToString(result));

        // gọi phương thức static:
        var fullName = "Trung Trần Văn";
        System.out.println("Tên trong \""
                + fullName + "\": " + Splittable.getFirstName(fullName));
    }
}