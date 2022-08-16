package 송파코딩스터디.week1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 요세푸스 문제 (큐 이용)
public class 백준11866_S5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) queue.add(i);

        System.out.print('<');
        while (!queue.isEmpty()) {
            for (int i = 0; i < k-1; i++) {
                queue.add(queue.poll());
            }
            if (queue.size() == 1) System.out.print(queue.poll());
            else System.out.print(queue.poll() + ", ");
        }
        System.out.print('>');
    }
}
