package Problem8;

import java.util.Scanner;

public class Combination {

    static int[] combination;

    static int n;
    static int m;


    // level 이 m 까지 돌고
    // m - cur 이 지금 뻗어나가는 가지의 수
    // cur "부터 for 문이 돌기 시작"
    // combi 배열의 level 번째 원소가 i 임
    public void DFS(int level, int cur){
        if (level == m){
            for(int x : combination) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = cur; i < n; i++) {
                combination[level] = i;
                DFS(level + 1, i + 1);
            }
        }
    }

    public static void main(String[] args){
        Combination c = new Combination();
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        m = scn.nextInt();

        combination = new int[m];
        c.DFS(0,0);
    }
}
