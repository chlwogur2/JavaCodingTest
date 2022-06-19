package Problem3;

import java.util.Scanner;

/**
 * 투포인터로, 현재 부분수열의 합이 m 보다 작으면, 뒤쪽포인터를 하나 증가    (전체 합은 커짐)
 * m보다 크면, 앞쪽 포인터를 하나 증가    (전체 합은 작아짐)
 */

public class Problem3_4 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int cur = 0; // 현재 상태 합을 나타내는 변수
        int ans = 0; // 정답 개수
        int front = 0;  // 앞쪽 포인터
        int rear = 0;   // 뒤쪽 포인터

        while (front < n) {
            if (cur < m){               // 1. 만약 현재 연속수열 합이 m보다 작으면,
                if (rear < n - 1) {
                    cur += arr[++rear];     // 뒤쪽 포인터를 증가시키고, 더함
                } else break;     // 만약, 뒤쪽 포인터가 맨 끝인데도, 현재 합이 m 보다 작으면 종료

            } else if (cur > m) {       // 2. 만약 현재 연속수열 합이 m보다 크면,
                cur -= arr[front++];    // 앞쪽 포인터 데이터를 빼고, 포인터를 증가

            } else {    // 3. 만약 정답이라면,
                ans++;  // 정답 개수 하나 추가
                if (rear < n-1) {
                    cur += arr[++rear]; // 뒤쪽 포인터 증가 후, 그 값 더함
                }
                cur -= arr[front++];    // 앞쪽 포인터 값 빼고, 포인터 증가
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Problem3_4 pr = new Problem3_4();
        pr.Solution();
    }
}
