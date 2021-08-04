package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {

//        FileInputStream fis = null;
//        try {
//            fis = new FileInputStream("Chapter13/src/exception/a.txt");
//            System.out.println("success");
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//            return;
//        }
//        finally {
//            try {
//                fis.close();
//                System.out.println("finally");
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
        // try-with-resource 문 (close()가 자동으로 호출됨)
        try (FileInputStream fis = new FileInputStream("Chapter13/src/exception/a.txt")) {

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}
