package Problem4;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem4_5 {

    public int Solution() {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    treeSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt =0;
        for (int x : treeSet) {
            cnt++;
            if(cnt == k) return x;
        }
        return -1;

    }

    public static void main(String[] args) {
        Problem4_5 pr = new Problem4_5();
        System.out.println(pr.Solution());

    }
}
