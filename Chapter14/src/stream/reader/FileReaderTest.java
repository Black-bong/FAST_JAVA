package stream.reader;


import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {

        FileReader fis = new FileReader("Chapter14/src/stream/reader/reader.txt");

        int ch;
        while ((ch = fis.read()) != -1) {
            System.out.print((char)ch);
        }
        fis.close();
    }
}
