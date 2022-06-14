package Problem2;

import java.util.Scanner;

/**
 * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 * <p>
 * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 */
public class Problem2_4 {

    public void solution() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // 배열 초기화
        int[] d = new int[n];
        d[0] = 1;
        d[1] = 1;
        // 피보나치 점화식
        for (int i = 2; i < n; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(d[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        Problem2_4 pr = new Problem2_4();
        pr.solution();
    }
}
