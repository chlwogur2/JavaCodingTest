package Problem5;

import java.util.Scanner;
import java.util.Stack;

public class Example {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 3;
        Stack<Integer>[] stacks = new Stack[n];

        for (int i = 0; i < n; i++) {
            stacks[i].add(scn.nextInt());
        }
    }
}
