package Problem5;

import java.util.Scanner;
import java.util.Stack;

public class Problem5_4 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);
        String eq = scn.next();

        Stack<Integer> stack = new Stack<>();

        for (char x : eq.toCharArray()) {
            if (x > 47) { // 아스키코드상으로 48 이상이면 숫자임, 사칙 연산 기호아님
                stack.push(x - '0');    // 숫자면 그대로 int 형으로 바꾸어서 push
            } else {
                int b = stack.pop();
                int a = stack.pop();
                if (x == '*') stack.push(a * b);
                else if (x == '-') stack.push(a - b);
                else if (x == '/') stack.push(a / b);
                else if (x == '+') stack.push(a + b);
            }
        }
        System.out.println(stack.pop());    // 루프를 다 돌고, 마지막에 남은 값을 리턴
    }


    public static void main(String[] args) {
        Problem5_4 pr = new Problem5_4();
        pr.Solution();
    }
}
