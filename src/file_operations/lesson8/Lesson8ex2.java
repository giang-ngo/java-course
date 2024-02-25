package file_operations.lesson8;

import java.io.*;
import java.util.Date;

public class Lesson8ex2 {
    public static void main(String[] args) {
        var srcFile = "C:\\Users\\84339\\Downloads\\Video" +
                "\\BUỒN HAY VUI - VSOUL x MCK x Obito x Ronboogz x Boyzed _ Lyric Video.mp4";
        var desFile = "D:\\BUỒN HAY VUI - VSOUL x MCK x Obito x Ronboogz x Boyzed _ Lyric Video_4.mp4";
        File myFile = new File(srcFile);

        try (FileInputStream fis = new FileInputStream(srcFile);
             FileOutputStream fos = new FileOutputStream(desFile);
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            var start = new Date().getTime();
            final int SIZE = 8 * 1024;
            byte[] buff = new byte[SIZE];
            int len = 0;

            while ((len = bis.read(buff)) != -1) {
                bos.write(buff, 0, len);
            }

            var end = new Date().getTime();

//            bis.close();
//            bos.close();
//            fis.close();
//            fos.close();

            System.out.println("File size: " + (myFile.length() / 1024) + " KB");//File size: 8102 KB

            System.out.println("Time used: " + (end - start) + " ms");//Time used: 9 ms

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
