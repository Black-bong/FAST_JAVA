package bjo2562;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        ArrayList<Integer> numberList = new ArrayList<Integer>();
//
//        for(int i=0; i<9; i++) {
//            int inputNumber = scan.nextInt();
//            numberList.add(inputNumber);
//        }
//        int max = Collections.max(numberList);
//        System.out.println(max);
//        int index = numberList.indexOf(max);
//        System.out.println(index+1);
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberList = new int[9];
        int max = numberList[0];
        int index = 0;
        for(int i=0;i<numberList.length;i++) {
            int inputNumber = scanner.nextInt();
            numberList[i] = inputNumber;
            if(max < numberList[i]) {
                max = numberList[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
    }
}
