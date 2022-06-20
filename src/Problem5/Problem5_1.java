package Problem5;

import java.util.Scanner;
import java.util.Stack;

/**
 * ( 여는 괄호 들어오면 무조건 stack 에 push
 * ) 닫는 괄호 들어오면, stack 의 최상단을 검사해서,
 *  1. ( 여는 괄호면 그 괄호 pop
 *  2. ) 닫는 괄호면 그대로 push
 */

public class Problem5_1 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);

        String s = scn.next();
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (x == '('){
                stack.push(x);
            } else if (x == ')'){
                if (stack.peek() == '(') stack.pop();
                else if (stack.peek() == ')') stack.push(x);
            }
        }

        if (stack.isEmpty()) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[] args) {
        Problem5_1 pr = new Problem5_1();
        pr.Solution();
    }
}
