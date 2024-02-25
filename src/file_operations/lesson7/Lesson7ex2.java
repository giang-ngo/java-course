package file_operations.lesson7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Lesson7ex2 {
    public static void main(String[] args) {
        var srcFile = "C:\\Users\\84339\\Downloads\\Video" +
                "\\BUỒN HAY VUI - VSOUL x MCK x Obito x Ronboogz x Boyzed _ Lyric Video.mp4";
        var desFile = "D:\\BUỒN HAY VUI - VSOUL x MCK x Obito x Ronboogz x Boyzed _ Lyric Video_3.mp4";
        File myFile = new File(srcFile);

        try {
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(desFile);
            var start = new Date().getTime();
            final int SIZE = 8 * 1024;
            byte[] buff = new byte[SIZE];
            int len = 0;
            while ((len = fis.read(buff)) != -1) {
                fos.write(buff,0,len);
            }

            var end = new Date().getTime();
            fis.close();
            fos.close();

            System.out.println("File size: " + (myFile.length() / 1024) + " KB");//File size: 8102 KB

            System.out.println("Time used: " + (end - start) + " ms");//Time used: 9 ms

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
