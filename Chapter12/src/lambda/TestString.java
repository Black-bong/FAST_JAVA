package lambda;

public class TestString {
    public static void main(String[] args) {
        StringConImpl impl = new StringConImpl();
        impl.makeString("Hello", "World");

        StringConcat concat = (s, v) -> System.out.println(s + "," + v);
        concat.makeString("Hello", "World");
    }
}
