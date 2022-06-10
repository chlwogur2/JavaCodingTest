import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2_7 {

    public void Solution() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String sn = in.readLine();
        int n = Integer.parseInt(sn);

        String[] sData = in.readLine().split(" ");
        int[] data = new int[n];

        int answer = 0;     // 정답

        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(sData[i]);
        }

        int plus = 0;   // 현재 가산점

        for (int i = 0; i < n; i++) {
            if (data[i] == 0) {
                plus = 0;   // 가산점을 0으로 초기화
            } else {
                answer += (1 + plus);     // 주어지는 1점에 가산점까지 더함
                plus++;   // 가산점 추가
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {
        Problem2_7 pr = new Problem2_7();
        pr.Solution();
    }
}
