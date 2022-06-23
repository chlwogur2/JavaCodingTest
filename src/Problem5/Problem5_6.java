package Problem5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem5_6 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            for (int i = 0; i < k-1; i++) {
                int cur  = queue.poll();
                queue.add(cur);
            }
            queue.poll();
        }
        System.out.println(queue.poll());
    }

    public static void main(String[] args) {
        Problem5_6 pr = new Problem5_6();
        pr.Solution();
    }
}
