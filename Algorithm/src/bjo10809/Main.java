package bjo10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] chList = new int[26];

        for(int i=0;i<chList.length;i++) {
            chList[i] = ('a' + i);
        }

        String str = bf.readLine();
        for (int c : chList) {
            int index = str.indexOf(c);
            System.out.print(index + " ");
        }
    }
}
