package stream.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {
    public static void main(String[] args) {

        byte[] by = new byte[26];
        byte data = 65;
        for (int i=0;i<by.length;i++) {
            by[i] = data;
            data++;
        }
        try (FileOutputStream fos = new FileOutputStream("Chapter14/src/stream/outputstream/alpha.txt", true);
             FileInputStream fis = new FileInputStream("Chapter14/src/stream/outputstream/alpha.txt")){

            fos.write(by);
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char)ch);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
