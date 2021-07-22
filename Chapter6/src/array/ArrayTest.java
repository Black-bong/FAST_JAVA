package array;

public class ArrayTest {
    public static void main(String[] args) {

        int[] alphabets = new int[26];
        for(int i = 0; i < alphabets.length; i++) {
            alphabets[i] = 'A' + i;
            System.out.println((char)alphabets[i] + "," + alphabets[i]);
        }
    }
}
