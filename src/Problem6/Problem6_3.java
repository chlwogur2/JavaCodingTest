package Problem6;

import java.util.Scanner;

/**
 * 삽입정렬
 */

public class Problem6_3 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int cur = arr[i];

            int j = i - 1;

            while (j >= 0 && arr[j] > cur){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = cur;
        }

        for(int x : arr) System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Problem6_3 pr = new Problem6_3();
        pr.Solution();
    }
}
