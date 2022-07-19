package Problem8;

import java.util.ArrayList;
import java.util.Scanner;


// 해결 XX
public class Problem8_6 {

    static int n, f;
    static ArrayList<Integer>[] arr;

    public static void DFS(int level, int cur) {
        if (level == 0){


        }
    }

    public static void main(String[] args) {
        Problem8_6 pr = new Problem8_6();
        Scanner scn = new Scanner(System.in);

        n = scn.nextInt();
        f = scn.nextInt();

        arr = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
        }

        arr[n - 1].add(f);

    }
}
