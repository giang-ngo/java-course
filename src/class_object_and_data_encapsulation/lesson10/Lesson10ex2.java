package class_object_and_data_encapsulation.lesson10;

import java.io.File;

public class Lesson10ex2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\84339\\Downloads\\Video\\tlinh " +
                "- ghệ iu dấu của em ơi (DATWEE Remix) - “ghệ remixes của em ơi” EP.mp4");
        System.out.println(STR."Đây là một file? \{file.isFile()}");
        System.out.println(STR."Đây là một thư mục? \{file.isDirectory()}");
        System.out.println(STR."Có thể đọc dữ liệu từ file hay không? \{file.canRead()}");
        System.out.println(STR."Có thể ghi dữ liệu từ file hay không? \{file.canWrite()}");
        System.out.println(STR."Tên file: \{file.getName()}");
        System.out.println(STR."Đường dẫn file: \{file.getPath()}");
        System.out.println(STR."Đường dẫn tuyệt đối file: \{file.getAbsoluteFile()}");
        System.out.println(STR."Kích thước file: \{file.length()} byte");
    }
}
