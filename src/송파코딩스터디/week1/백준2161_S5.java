package 송파코딩스터디.week1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


// 카드 (큐 이용)
public class 백준2161_S5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) queue.add(i);

        while (queue.size() > 1) {
            System.out.print(queue.poll() + " ");
            queue.add(queue.poll());
        }
        System.out.print(queue.poll());
    }
}
