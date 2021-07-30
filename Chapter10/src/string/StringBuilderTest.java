package string;

public class StringBuilderTest {
    public static void main(String[] args) {
        // buffer 와 builder 차이 buffer 는 멀티 쓰레드 지원, builder 는 미지원
        // buffer 는 동기화 지원 builder 는 미지원
        // 단일 쓰레드 한정 builder 의 성능이 더 뛰어나다.
        String java = new String("java");
        String android = new String("android");

        StringBuilder builder = new StringBuilder(java);
        System.out.println(System.identityHashCode(builder));
        builder.append(android);
        System.out.println(System.identityHashCode(builder));
        java = builder.toString();
        System.out.println(java);
    }
}
