package Problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3_1 {

    public void Solution() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[] first = new int[n];

        String[] temp1 = in.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            first[i] = Integer.parseInt(temp1[i]);
        }

        int m = Integer.parseInt(in.readLine());
        int[] second = new int[m];

        String[] temp2 = in.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            second[i] = Integer.parseInt(temp2[i]);
        }

        int ans[] = new int[n+m];

        int cur_1=0; int cur_2=0;
        int cur = 0;

        while (cur_1 < n && cur_2 < m) {
            if (first[cur_1] <= second[cur_2]) {
                ans[cur++] = first[cur_1++];
            } else{
                ans[cur++] = second[cur_2++];
            }
        }
        while(cur_1<n) ans[cur++] = first[cur_1++];
        while(cur_2<m) ans[cur++] = second[cur_2++];


        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n + m; i++) {
            s.append(ans[i]).append(" ");
        }
        System.out.println(s.toString().trim());
    }

    public static void main(String[] args) throws IOException {
        Problem3_1 pr = new Problem3_1();
        pr.Solution();
    }

}
