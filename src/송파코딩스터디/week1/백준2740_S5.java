package 송파코딩스터디.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 행렬 곱셈
public class 백준2740_S5 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(in.readLine(), " ");

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int[][] A = new int[n][m];

        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(in.readLine(), " ");
            for (int j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        stk = new StringTokenizer(in.readLine(), " ");
        m = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());

        int[][] B = new int[m][k];

        for (int i = 0; i < m; i++) {
            stk = new StringTokenizer(in.readLine(), " ");
            for (int j = 0; j < k; j++) {
                B[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {   // [n][k] 행렬이 생김
                int now = 0;
                for (int a = 0; a < m; a++){
                    now += (A[i][a] * B[a][j]);
                }
                System.out.print(now + " ");
            }
            System.out.println();
        }
    }
}
