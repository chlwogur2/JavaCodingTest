package Problem6;

import java.util.Scanner;

/**
 * 버블정렬
 */

public class Problem6_2 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = i; j < n-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int x : arr) System.out.print(x + " ");

    }

    public static void main(String[] args) {
        Problem6_2 pr = new Problem6_2();
        pr.Solution();
    }
}
