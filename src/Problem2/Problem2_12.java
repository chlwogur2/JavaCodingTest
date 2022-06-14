package Problem2;

import java.io.IOException;
import java.util.Scanner;

public class Problem2_12 {


    public void Solution() throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int test[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                test[i][j] = scn.nextInt();
            }
        }

        int ans = 0;
        int cnt;
        int pi,pj;

        for (int i = 0; i < n; i++) {   // 가능한 모든 멘토
            for (int j = 0; j < n; j++) {   // 가능한 모든 멘티
                cnt = 0;    // 얘가 모든 시험 갯수만큼 증가되면, 모든 멘토,멘티 테스트 검증이 끝남
                for (int k = 0; k < m; k++) {  // 모든 시험에 대해서
                    pi = 0; pj = 0; // 둘의 등수 초기화
                    for (int s = 0; s < n; s++) {   // 등수에 대해서
                        if (test[k][s] == i){
                            pi = s;
                        } if (test[k][s] == j){
                            pj = s;
                        }
                    }
                    if (pi > pj) cnt++;
                }
                if (cnt == m){
                    ans++;    // 모든 테스트 통과하면, 가능한 멘토 멘티 개수 증가
                }

            }
        }
        System.out.println(ans);

    }

    public static void main(String[] args) throws IOException {
        Problem2_12 pr = new Problem2_12();
        pr.Solution();
    }
}

