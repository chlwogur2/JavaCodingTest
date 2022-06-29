package Problem5;

import java.util.Scanner;
import java.util.Stack;

public class BJ_23253 {

    public void Main() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        Stack<Integer>[] stacks = new Stack[m];

        for (int i = 0; i < m; i++) {
            stacks[i] = new Stack<>();
        }

        for (int i =0; i<m; i++){
            int temp = scn.nextInt();
            for (int j = 0; j < temp; j++) stacks[i].add(scn.nextInt());
        }

        boolean pop = false;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (!stacks[i].isEmpty() && stacks[i].peek() == j+1){
                    stacks[i].pop();
                    pop = true;
                    break;
                }
            }
            if (!pop) {
                System.out.println("No");
                return;
            }
            pop = false;
        }

        System.out.println("Yes");
        return;
    }

    public static void main(String[] args) {
        BJ_23253 pr = new BJ_23253();
        pr.Main();
    }

}
