package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {

        ArrayList<String> sList = new ArrayList<String>();
        sList.add("Lee");
        sList.add("Kim");
        sList.add("Park");
        sList.add("Sin");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.print(s + " "));
        System.out.println();
        sList.stream().sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();
        sList.stream().map(String::length).forEach(System.out::println);
    }
}
