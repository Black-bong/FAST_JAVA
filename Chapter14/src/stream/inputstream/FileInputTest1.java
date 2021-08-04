package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest1 {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("Chapter14/src/stream/inputstream/input.txt")){
            int i;
            byte[] by = new byte[10];
            while ((i = fis.read(by)) != -1) {
                for (int k=0;k<i;k++) {
                    System.out.print((char)by[k]);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
