package bjo2562;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<Integer>();

        for(int i=0; i<9; i++) {
            int inputNumber = scan.nextInt();
            numberList.add(inputNumber);
        }
        int max = Collections.max(numberList);
        System.out.println(max);
        int index = numberList.indexOf(max);
        System.out.println(index+1);
    }
}
