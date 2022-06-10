import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Problem2_9 {

    public void Solution() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        int[][] graph = new int[n][n];
        int answer = 0;     // 최댓값

        // 그래프 전달받기
        for (int i = 0; i < n; i++) {
            String[] sData = in.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(sData[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += graph[i][j];
                sum2 += graph[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);    // 현재 최댓값과, 새로 더해진 친구의 최댓값을 비교해서, 큰 쪽을 최댓값으로
        }

        // 대각선
        int sum_x = 0;
        int sum_y = 0;
        for (int i = 0; i < n; i++) {
            sum_x += graph[i][i];
            sum_y += graph[i][n - i - 1];
        }
        answer = Math.max(answer, sum_x);
        answer = Math.max(answer, sum_y);

        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException{
        Problem2_9 pr = new Problem2_9();
        pr.Solution();
    }
}
