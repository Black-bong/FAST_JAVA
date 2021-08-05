package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {

        FileWriter fiw = new FileWriter("Chapter14/src/stream/writer/writer.txt");

        fiw.write('A');

        char[] buf = {'B', 'C', 'D', 'E', 'F'};
        fiw.write(buf);
        fiw.write("안녕하세요.");
        fiw.write(buf, 2, 2);
        fiw.close();
        System.out.println("end");
    }
}
