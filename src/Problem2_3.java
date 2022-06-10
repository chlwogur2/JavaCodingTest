import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 *
 * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
 * 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 * 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 *
 * 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
 */

public class Problem2_3 {

    public void solution() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String sn = in.readLine();
        int n = Integer.parseInt(sn);

        int[] A = new int[n];
        int[] B = new int[n];

        String[] sA = in.readLine().split(" ");
        String[] sB = in.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(sA[i]);
            B[i] = Integer.parseInt(sB[i]);
        }

        String[] results = new String[n];   // 정답 배열

        int[] gbb = {1, 2, 3};  // 가위바위보 배열

        // A 가 이기는 경우, 비기는 경우를 조건문으로 짜면, 나머지는 전부 B가 이기는 경우가 됨
        for (int i = 0; i < n; i++) {
            if (A[i] == B[i]){
                results[i] = "D";
                continue;
            } else if (A[i] == 1 && B[i] == 3){
                results[i] = "A";
                continue;
            } else if (A[i] == 2 && B[i] == 1){
                results[i] = "A";
                continue;
            } else if (A[i] == 3 && B[i] == 2) {
                results[i] = "A";
                continue;
            } else results[i] = "B";

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(results[i]).append("\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        Problem2_3 pr = new Problem2_3();
        pr.solution();
    }
}
