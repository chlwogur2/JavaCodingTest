package Problem4;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 일단 둘다 해쉬맵에 넣고,
 * 하나의 keySet 을 돌면서 각각의 key 가 다른 hashMap 에 존재하고, 그 value 가 같다면 아나그램
 */

public class Problem4_2 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);

        String first = scn.next();
        String second = scn.next();

        HashMap<Character, Integer> fir = new HashMap<>();
        HashMap<Character, Integer> sec = new HashMap<>();

        for (char x : first.toCharArray()) {
            fir.put(x, fir.getOrDefault(x, 0) + 1);
        }

        for (char x : second.toCharArray()) {
            sec.put(x, sec.getOrDefault(x, 0) + 1);
        }

        int cnt = 0;

        for (char x : fir.keySet()) {
            if (fir.get(x) == sec.get(x) && sec.containsKey(x)) {
                cnt++;
            }
        }

        if (cnt == fir.size()) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[] args) {
        Problem4_2 pr = new Problem4_2();
        pr.Solution();
    }


}
