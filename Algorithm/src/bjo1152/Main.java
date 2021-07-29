package bjo1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputStr = scan.nextLine();
        int count = 0;
        String[] srtList = inputStr.split(" ");

        for(String i : srtList) {
            if(!i.equals("")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
