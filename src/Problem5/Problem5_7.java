package Problem5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem5_7 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);
        String obj = scn.next();
        String s = scn.next();

        Queue<Character> q = new LinkedList<>();

        for(char x : obj.toCharArray()) q.add(x);

        for (char c : s.toCharArray()) {
            if (!q.isEmpty() && c == q.peek()) q.poll();
        }
        if (q.isEmpty()) System.out.println("YES");
        else if (!q.isEmpty()) System.out.println("NO");
    }

    public static void main(String[] args) {
        Problem5_7 pr = new Problem5_7();
        pr.Solution();
    }
}
