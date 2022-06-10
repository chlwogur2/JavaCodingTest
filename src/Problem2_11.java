import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2_11 {

    public void Solution() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        int students[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] sStudent = in.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                students[i][j] = Integer.parseInt(sStudent[j]);
            }
        }

        int same_count[] = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (students[i][k] == students[j][k]) same_count[i]++;
                }
            }
        }

        int max =0;
        int max_index = 0;
        for (int i = 0; i < n; i++) {
            if (max < same_count[i]){
                max = same_count[i];
                max_index = i+1;
            }
        }

        System.out.println(max_index);
    }

    public static void main(String[] args) throws IOException {
        Problem2_11 pr = new Problem2_11();
        pr.Solution();
    }
}
