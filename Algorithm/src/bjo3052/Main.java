package bjo3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        HashSet hashSet = new HashSet();

        int[] ints = new int[10];
        for (int i=0;i<ints.length;i++) {
            ints[i] = Integer.parseInt(bis.readLine());
            hashSet.add(ints[i] % 42);
        }
        System.out.println(hashSet.size());

        bis.close();
    }
}
