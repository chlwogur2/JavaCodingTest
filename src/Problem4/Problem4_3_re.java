package Problem4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Problem4_3_re {

    public void Solution() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> ans = new ArrayList<>();

        // 맨처음 k개
        for (int i = 0; i < k; i++) {
            map.put(arr[i],0);
        }
        ans.add(map.size());

        for (int i = 1; i < n - k + 1; i++) {
            map.remove(arr[i-1]);
            map.put(arr[i+k-1], 0);
            ans.add(map.size());
        }

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Problem4_3_re pr = new Problem4_3_re();
        pr.Solution();
    }
}
