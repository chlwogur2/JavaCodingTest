package Problem6;

import java.util.Collections;
import java.util.Scanner;



/**
 * 선택정렬
 */

public class Problem6_1 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        /**
         * 굳이  min_idx 와 min_value 를 분리해서 하지 않아도,
         * min_idx 하나로 다 할 수 있을 듯
         */

        for (int i = 0; i < n-1; i++) {
            int min = arr[i];
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[min_idx] = temp;

            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

    public static void main(String[] args) {
        Problem6_1 pr = new Problem6_1();
        pr.Solution();
    }
}
