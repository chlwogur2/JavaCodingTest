package Problem8;
import java.util.*;

public class Problem8_2 {
    static int c;
    static int n;
    static int[] arr;
    static int answer = -1;

    public void DFS(int sum, int L){

        if (sum > c) {
            return;
        }

        if (L == n) {
            answer = Math.max(sum, answer);
            return;
        }

        DFS(sum+arr[L], L+1);
        DFS(sum, L + 1);

    }


    public static void main(String[] args) {
        Problem8_2 pr = new Problem8_2();
        Scanner scn = new Scanner(System.in);
        c = scn.nextInt();
        n = scn.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        pr.DFS(0,0);
        System.out.println("answer = " + answer);
    }

}
