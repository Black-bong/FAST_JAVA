package bjo8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int j = 0;
        String value = bf.readLine();
        int count = Integer.parseInt(value);

        while (j != count) {
            int totalScore = 0;
            int bonus = 0;

            String inputOX = bf.readLine();

            for(int i=0;i<inputOX.length();i++) {
                char ox = inputOX.charAt(i);
                int score = 1;

                switch (ox) {
                    case 'o':
                    case 'O':
                        score = score + bonus;
                        bonus++;
                        break;
                    case 'x':
                    case 'X':
                        score = 0;
                        bonus = 0;
                        break;
                }

                totalScore = totalScore + score;
            }
            j++;
            System.out.println(totalScore);
        }
    }
}
