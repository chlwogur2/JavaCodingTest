package Problem4;

import java.util.HashMap;
import java.util.Scanner;

public class Problem4_4 {

    public void Solution() {
        int ans = 0;    // 정답 개수 출력

        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        String t = scn.next();

        char[] s_arr = s.toCharArray(); // 스트링을 문자 배열로 변환

        HashMap<Character, Integer> s_map = new HashMap<>();    // s 스트링을 돌면서 해쉬맵에 저장할 예정
        HashMap<Character, Integer> t_map = new HashMap<>();    // t 스트링을 해쉬맵에 저장

        for (char x : t.toCharArray()) {
            t_map.put(x, t_map.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < t_map.size(); i++) {
            s_map.put(s_arr[i], s_map.getOrDefault(s_arr[i], 0) + 1);    // 처음 한번, 스트링 s 에서 t_map 의 사이즈만큼 map 생성
        }
        int cur = 0;    // 같은 키 - value 값을 가질 때마다 1씩 더하고, 만약 같은 아나그램이면 cur == t_map.size()
        for (char key : s_map.keySet()) {
            if(s_map.get(key) == t_map.get(key)) cur++;     // 처음 t_map 사이즈만큼 아나그램인지 체크
        }
        if (cur == t_map.size()) ans++;

        for (int i = 1; i < s_arr.length - t_map.size() + 1; i++) {
            cur = 0;
            s_map.put(s_arr[i - 1], s_map.get(s_arr[i - 1]) - 1);   // 이전 문자의 개수 하나 뺌
            s_map.put(s_arr[i + t_map.size() - 1], s_map.getOrDefault(s_arr[i + t_map.size() - 1], 0) + 1);

            for (char key : t_map.keySet()) {
                if(s_map.get(key) == t_map.get(key)) cur++;     // 같은 아나그램인지 체크
            }
            if (cur == t_map.size()) ans++;
        }

        System.out.println(ans);


    }

    public static void main(String[] args) {
        Problem4_4 pr = new Problem4_4();
        pr.Solution();
    }
}
