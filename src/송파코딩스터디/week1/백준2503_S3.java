package 송파코딩스터디.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 숫자야구 (3자리숫자)
// 질문 스트라이크(0~3) 볼(0~3) 순으로
public class 백준2503_S3 {


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        StringTokenizer stk;

        int[] num = new int[n];     // 부른 숫자 배열
        int[] st = new int[n];      // 스트라이크 배열
        int[] ball = new int[n];    // 볼 배열

        int answer = 0;

        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(in.readLine(), " ");

            num[i] = Integer.parseInt(stk.nextToken());
            st[i] = Integer.parseInt(stk.nextToken());
            ball[i] = Integer.parseInt(stk.nextToken());
        }

        int[] ans = new int[3];
        int[] t_ans = new int[3];


        // 가능한 세자리 수 123 ~ 987까지 주어진 조건을 만족하는지 검사함 (완탐)
        for (int i = 123; i < 988; i++) {   // i가 정답

            int tmp = i;

            ans[2] = tmp % 10;    // 일의 자리 수
            tmp = tmp / 10;
            ans[1] = tmp % 10;     // 십의 자리 수
            tmp = tmp / 10;
            ans[0] = tmp % 10;     // 백의 자리 수

            if (ans[0] == 0 || ans[1] == 0 || ans[2] == 0 || ans[0] == ans[1] || ans[0] == ans[2] || ans[1] == ans[2]) continue;
            // 0이 포함되면 무시, 자릿수 중에 같은 값이 있으면 무시

            boolean flag = true;

            int t_tmp;
            for (int j = 0; j < n; j++) {   // 매 숫자마다 질문에 대한 답이 가능한지 검사
                t_tmp = num[j];

                t_ans[2] = t_tmp % 10;     // 일의 자리 수
                t_tmp = t_tmp / 10;
                t_ans[1] = t_tmp  % 10;    // 십의 자리 수
                t_tmp = t_tmp / 10;
                t_ans[0] = t_tmp % 10;     // 백의 자리 수

                int s = 0;  // 스트
                int b = 0;  // 볼

                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (ans[k] == t_ans[l]){
                            if (k == l) {   // 인덱스가 같으면 스트
                                s++;
                            } else {        // 다르면 볼
                                b++;
                            }
                        }
                    }
                }

                if (st[j] != s || ball[j] != b) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer++;     // 전부 다 말이되면 정답
            }
        }
        System.out.println(answer);
    }
}