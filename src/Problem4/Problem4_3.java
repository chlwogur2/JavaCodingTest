package Problem4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Problem4_3 {

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

        for (int i = 0; i < n - k + 1; i++) {
            for (int j = i; j < k+i; j++) {
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            }
            ans.add(map.size());
            map.clear();
        }

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Problem4_3 pr = new Problem4_3();
        pr.Solution();
    }
}
