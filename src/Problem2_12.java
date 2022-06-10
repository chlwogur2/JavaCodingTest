import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem2_12 {

    public void Solution() throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int test[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                test[i][j] = scn.nextInt();
            }
        }

        /**
         * 각 테스트 별로 만들 수 있는 페어를 모두 생성해서,
         * 페어가 모든 테스트에 존재하는지 검증 ??
         */

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

            }
        }
    }
}
