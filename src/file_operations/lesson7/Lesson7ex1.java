package file_operations.lesson7;

import java.io.*;
import java.util.Date;


public class Lesson7ex1 {
    public static void main(String[] args) {
        var srcFile = "C:\\Users\\84339\\Downloads\\Video" +
                "\\BUỒN HAY VUI - VSOUL x MCK x Obito x Ronboogz x Boyzed _ Lyric Video.mp4";
        // copy và rename nó
        var desFile = "D:\\BUỒN HAY VUI - VSOUL x MCK x Obito x Ronboogz x Boyzed _ Lyric Video_2.mp4";
        File myFile = new File(srcFile);

        try {
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(desFile);
            var start = new Date().getTime();
            int data = 0;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            var end = new Date().getTime();
            fis.close();
            fos.close();

            System.out.println("File size: " + (myFile.length() / 1024) + " KB");//File size: 8102 KB

            System.out.println("Time used: " + (end - start) + " ms");//Time used: 21217 ms

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
