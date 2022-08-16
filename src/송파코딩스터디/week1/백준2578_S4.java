package 송파코딩스터디.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//빙고
// 시간복잡도 계산 (대충)
// 빙고확인 = n^2, 사회자 25 개 수마다 25번 숫자 확인 = n^4,
// n = 5 니까 널널
public class 백준2578_S4 {
    static int[][] bingo;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


        bingo = new int[5][5];
        StringTokenizer stk;

        for (int i = 0; i < 5; i++) {
            stk = new StringTokenizer(in.readLine(), " ");
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) {
            stk = new StringTokenizer(in.readLine(), " ");
            for (int j = 1; j < 6; j++) {
                int cur = Integer.parseInt(stk.nextToken());
                for (int a = 0; a < 5; a++) {
                    for (int b = 0; b < 5; b++) {
                        if (bingo[a][b] == cur) {     // 사회자가 부른 수를 -1로
                            bingo[a][b] = -1;
                            break;
                        }
                    }
                }
                if (3 <= isBingo()) {
                    System.out.println(5*i + j);
                    return;
                }
            }
        }
    }
    // 빙고가 완성되었는지 확인
    static int isBingo() {
        int B = 0;  // 빙고 개수

        // 가로 확인
        for (int i = 0; i < 5; i++) {
            int cnt = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] == -1) cnt++;
            }
            if (cnt == 5) B++;
        }

        // 세로 확인
        for (int i = 0; i < 5; i++) {
            int cnt = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[j][i] == -1) cnt++;
            }
            if (cnt == 5) B++;
        }

        // 대각선 확인
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][i] == -1) cnt++;
        }
        if (cnt == 5) B++;

        cnt = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][4-i] == -1) cnt++;
        }
        if (cnt == 5) B++;

        return B;

    }
}
