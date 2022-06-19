package Problem3;

import java.util.Scanner;

/**
 * 슬라이딩 윈도우
 */

public class Problem3_3 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        int[] m = new int[n];

        for(int i =0; i<n; i++){
            m[i] = scn.nextInt();
        }

        int max = 0;
        int cur_sum = 0;

        // 맨 처음 k 까지의 합
        for (int i = 0; i < k; i++) {
            cur_sum += m[i];
            max = cur_sum;
        }


        for (int i = 1; i < n - k; i++) {
            cur_sum -= m[i - 1];
            cur_sum += m[i + k-1];

            System.out.println("i,  = " + i + ", cur_sum = " +  cur_sum);

            if (max < cur_sum) {
                max = cur_sum;
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        Problem3_3 pr = new Problem3_3();
        pr.Solution();
    }
}
