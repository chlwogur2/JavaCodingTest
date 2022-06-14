package Problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2_10 {

    public void Solution() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        int mountain[][] = new int[n+2][n+2];

        for(int i = 1; i<n+1; i++){
            String[] sData = in.readLine().split(" ");
            for (int j = 1; j < n + 1; j++) {
                mountain[i][j] = Integer.parseInt(sData[j-1]);
            }
        }

        int answer = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (mountain[i][j] > mountain[i-1][j]
                        && mountain[i][j] > mountain[i][j+1]
                        && mountain[i][j] > mountain[i+1][j]
                        && mountain[i][j] > mountain[i][j-1]){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException{
        Problem2_10 pr = new Problem2_10();
        pr.Solution();
    }
}
