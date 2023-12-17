package class_object_and_data_encapsulation.lesson11;

import java.io.File;
import java.io.IOException;

public class lesson11 {
    public static void main(String[] args) throws IOException {
//        Thao tác với file thư mục
//        File file = new File("D:/ONE/TWO/THREE/x/output.txt");
//        File newFile = new File("D:/ONE/TWO/THREE/x/OUTPUT.txt");
//        file.renameTo(newFile);
//        System.out.println(newFile.delete());

//        var isSuccess = file.mkdirs();
//        System.out.println("Tạo thư mục thành công? " + isSuccess);
//
//        boolean isSuccess = false;
//        try {
//            isSuccess = file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Tạo file thành công? " + isSuccess);


        File newFile = new File("D:/ONE/TWO/THREE/x/OUTPUT.txt");
        newFile.createNewFile();
    }
}
