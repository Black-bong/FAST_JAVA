package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortingTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("정렬 방식을 선택하세요.");
        System.out.println("B : BubbleSort");
        System.out.println("H HeapSort");
        System.out.println("Q : QuickSort");
        Sort sort = null;
        int select = bf.read();

        switch (select) {
            case 'B' :
            case 'b' :
                sort = new BubbleSort();
                break;
            case 'H' :
            case 'h' :
                sort = new HeapSort();
                break;
            case 'Q' :
            case 'q' :
                sort = new QuickSort();
                break;
        }
        int[] arr = new int[10];
        sort.ascending(arr);
        sort.descending(arr);
        sort.description();
    }
}
