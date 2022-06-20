package Problem5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Problem5_2 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        Stack<Character> stack = new Stack<>();

        ArrayList<Character> ans = new ArrayList<>();

        for (char x : s.toCharArray()) {
            if (x == '(') stack.push(x);
            else if (x == ')'){
                while (stack.peek() != '(') stack.pop();
                stack.pop();    // 마지막으로 남아있는 여는 괄호 제거
            } else {
                if (stack.isEmpty()) ans.add(x);
            }
        }

        for (char x : ans) {
            System.out.print(x);
        }

    }

    public static void main(String[] args) {
        Problem5_2 pr = new Problem5_2();
        pr.Solution();
    }
}
