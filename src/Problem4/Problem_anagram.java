package Problem4;

import java.util.HashMap;
import java.util.Scanner;

public class Problem_anagram {

    public void Solution() {
        int ans = 0;    // 정답 개수 출력

        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        String t = scn.next();

        HashMap<Character, Integer> s_map = new HashMap<>();    // s 스트링을 돌면서 해쉬맵에 저장할 예정
        HashMap<Character, Integer> t_map = new HashMap<>();    // t 스트링을 해쉬맵에 저장

        int lt = 0;
        int L = t_map.size() - 1;  // rt 반복문 시작을 0부터 하기 위해서

        for (char c : t.toCharArray()) {
            t_map.put(c, t_map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < L; i++) {
            s_map.put(s.charAt(i), s_map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int rt = L; rt < s.length(); rt++) {

        }




        System.out.println(ans);
    }

    public static void main(String[] args) {
        Problem_anagram pr = new Problem_anagram();
        pr.Solution();
    }
}
