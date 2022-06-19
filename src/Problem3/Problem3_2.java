package Problem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 아이디어: 투포인터로 문제를 풀려면 일단 정렬을 해야함
 */


public class Problem3_2 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int A[] = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int B[] = new int[m];

        for (int i = 0; i < m; i++) {
            B[i] = scn.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);     // 투포인터 사용하기 위해 오름차순 정렬

        int cur_A = 0;
        int cur_B = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (cur_A < n && cur_B < m) {
            if (A[cur_A] == B[cur_B]) {
                ans.add(A[cur_A]);
                cur_A++;
                cur_B++;
            } else if (A[cur_A] > B[cur_B]) {
                cur_B++;
            } else cur_A++;
        }
        for (int x : ans) {
            System.out.print(x+ " ");
        }
    }

    public static void main(String[] args) {
        Problem3_2 pr = new Problem3_2();
        pr.Solution();
    }
}
