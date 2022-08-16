package 송파코딩스터디.week1;

import java.util.Arrays;
import java.util.Scanner;

// 에라토스테네스의 체
public class 백준2960_S4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        boolean[] num = new boolean[n+1];   // 방문했으면 true 로 바꿈

        int cnt = 0;    // 지운횟수

        while(cnt < k){
            for (int i = 2; i < n + 1; i++) {
                if (!num[i]) {  // 아직 지워지지 않았으면
                    for (int j = i; j < n + 1; j++) {
                        if (j%i == 0 && !num[j]) {
                            num[j] = true;
                            cnt++;
                            if (cnt == k) {
                                System.out.println(j);
                                break;
                            }
                        }
                    }
                    break;
                }
            }
        }
    }
}
