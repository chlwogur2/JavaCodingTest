package Problem8;

import java.util.Scanner;

public class Problem8_5 {

    static int n;
    static int r;

    static int[][] dp;

    public static int DFS(int cur_n, int cur_r) {
        if (cur_n == cur_r || cur_r == 0) {
            dp[cur_n][cur_r] = 1;
            return 1;
        }

        if (dp[cur_n][cur_r] <= 0) {
            dp[cur_n][cur_r] = DFS(cur_n - 1, cur_r - 1) + DFS(cur_n - 1, cur_r);
        }
        return dp[cur_n][cur_r];

    }


    public static void main(String[] args) {
        Problem8_5 pr = new Problem8_5();
        Scanner scn = new Scanner(System.in);

        n = scn.nextInt();
        r = scn.nextInt();

        dp = new int[n+1][r+1];
        pr.DFS(n, r);
        System.out.println(dp[n][r]);
    }
}
