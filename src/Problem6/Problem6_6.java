package Problem6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem6_6 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) heights[i] = scn.nextInt();

        int[] copies = new int[n];

        copies = heights.clone();
        Arrays.sort(copies);

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(copies[i] != heights[i]) temp.add(i+1);
        }

        for(int x : temp) System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Problem6_6 pr = new Problem6_6();
        pr.Solution();
    }
}
