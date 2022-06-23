package Problem5;

import java.util.Scanner;
import java.util.Stack;

public class Problem5_3 {

    public void Solution() {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] map = new int[n+1][n+1];

        int ans = 0;

        // move 배열이 1부터 시작이므로, 0행,0열은 비워두고 1부터 받음
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n + 1; j++) {
                map[i][j] = scn.nextInt();
            }
        }

        int m = scn.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = scn.nextInt();
        }

        Stack<Integer> basket = new Stack<>();  // 바구니

        for (int i = 0; i < m; i++) {
            int cur = getDoll(map, moves[i]);   // 현재 집힌 인형 번호
            if (cur != -1) {
                ans += insertBasket(basket, cur);
            }
        }
        System.out.println(ans);
    }

    // 인형을 집어오는 메소드
    private static int getDoll(int[][] map, int k) {    // k = move 배열에 있는 열 넘버가 들어갈 예정

        int doll = 0;   // 인형 번호

        for (int i = 1; i < map.length; i++) {
            if (map[i][k] == 0) continue;   // 0 이면 빈공간이니까 스킵
            else{
                doll = map[i][k];
                map[i][k] = 0;
                return doll;    // 인형 번호를 리턴
            }
        }
        return -1;   // 그 열이 비어있으면, -1을 리턴
    }

    // 인형을 바구니에 넣는 메소드
    private static int insertBasket(Stack<Integer> stack, int k) {
        if (!stack.isEmpty() && stack.peek() == k) {
            stack.pop();  // 만약 인형이 두개가 겹쳐지면, 터뜨림
            return 2;    // 인형이 터지면, 2 리턴   --> 터지는 인형의 수 카운트 하기 위해
        }
        else {
            stack.push(k); // 아니면 바구니에 넣자
            return 0;      // 인형이 안 터지면, 0 리턴
        }
    }

    public static void main(String[] args) {
        Problem5_3 pr = new Problem5_3();
        pr.Solution();
    }
}
