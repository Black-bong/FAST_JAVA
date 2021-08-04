package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {
    public static void main(String[] args) {
        try (FileOutputStream fis = new FileOutputStream("Chapter14/src/stream/outputstream/output.txt", true)) {
            fis.write(65);
            fis.write(66);
            fis.write(67);
            fis.write(68);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
