package Problem3;

import java.util.Scanner;

/**
 * front, rear 의 투 포인터로,
 * 각자 이동하면서, 합이 n이 될 때 체크
 */


public class Problem3_5 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int front = 1;
        int rear = 2;

        int ans = 0;    // 정답
        int cur = 3;    // 현재 합

        while(rear < n){
            if (cur < n) {
                cur += ++rear;
            } else if (cur > n) {
                cur -= front++;
            } else if (cur == n){
                ans++;
                cur -= front++;
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Problem3_5 pr = new Problem3_5();
        pr.Solution();
    }
}
