package bjo2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int inputCount = scan.nextInt();
        int count = 0;
        int[] number = new int[inputCount];
        String[] str = new String[inputCount];

        while (inputCount != count) {
            number[count] = scan.nextInt(); // number[0] 3
            str[count] = scan.next(); // srt[0] abcd
            count++;
        }
        for(int i=0;i<inputCount;i++) {
            for(int j=0;j<str[i].length();j++) {
                byte[] by = str[i].getBytes();
                for(int z=0;z<number[i];z++) {
                    System.out.print((char)by[j]);
                }
            }
            System.out.println();
        }
    }
}
