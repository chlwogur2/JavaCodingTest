package Problem4;

import java.util.HashMap;
import java.util.Scanner;

public class Problem4_1 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        String str = scn.next();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        char ans = ' ';

        for (char key : hashMap.keySet()) {
            if (max < hashMap.get(key)) {
                max = hashMap.get(key);
                ans = key;
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Problem4_1 pr = new Problem4_1();
        pr.Solution();
    }
}
