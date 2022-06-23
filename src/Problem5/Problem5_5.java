package Problem5;

import java.util.Scanner;
import java.util.Stack;

/**
 * 스택으로 어떻게 푸는지 모르겠음
 */

public class Problem5_5 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        int l = 0; // 레이저 개수

       int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ')') {

            }
        }





    }

    public static void main(String[] args) {
        Problem5_5 pr = new Problem5_5();
        pr.Solution();
    }
}
