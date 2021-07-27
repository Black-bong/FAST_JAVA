package bjo1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inputNumberOfSubject = bf.readLine();
        int numberOfSubject = Integer.parseInt(inputNumberOfSubject) + 30;
        System.out.println(numberOfSubject);

        ArrayList<String> scoreList = new ArrayList<String>();
        scoreList.add(bf.readLine());
        int i = 0;
        //i = scoreList.get(0).split(" ");
        System.out.println(i);
    }
}
