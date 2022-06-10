import java.util.Scanner;

/**
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 *
 * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 * 첫 줄에 소수의 개수를 출력합니다.
 */

public class Problem2_5 {

    public void solution() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int answer = 0;

        int[] d = new int[n+1];
        d[0] = -1;
        d[1] = -1;      // 방문한 인덱스는 -1 로, 소수는 0으로 놔둘 예정
                        // 인덱스 자체가 n 보다 작은 수들이 됨

        for (int i = 2; i < n+1; i++) {
            if (d[i] != -1){    // 만약 데이터가 -1 이 아니라면, 소수임
                answer++;
                for (int j = i; j < n+1; j = j+i) {   // 그 다음 그 소수의 배수 인덱스에 대하여 전부 -1로 갱신
                    if (j%i == 0){
                        d[j] = -1;
                    }
                }
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Problem2_5 pr = new Problem2_5();
        pr.solution();
    }
}
