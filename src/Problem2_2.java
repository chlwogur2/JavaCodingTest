import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
 * 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 *
 * 첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
 *
 * 선생님이 볼 수 있는 최대학생수를 출력한다.
 */
public class Problem2_2 {

    public void solution() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String sn = in.readLine();
        int n = Integer.parseInt(sn);

        String[] sHeight = in.readLine().split(" ");
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(sHeight[i]);
        }

        int max = heights[0];
        int result = 1;     // 볼 수 있는 학생 수, 맨 처음 학생은 무조건 볼 수 있으니 1 로 시작

        for (int i = 1; i<n; i++){
            if (heights[i] > max){      // 현재 학생이 지금까지의 최댓값 보다 키가 큰 경우에만 관측 가능
                max = heights[i];
                result += 1;
            }
        }

        System.out.println(result);

    }

    public static void main(String[] args) throws IOException{

        Problem2_2 pr = new Problem2_2();
        pr.solution();
    }
}
