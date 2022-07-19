package Problem8;

import java.util.Scanner;

public class Problem8_4 {

    static int n;
    static int m;
    static int answer = Integer.MAX_VALUE;
    static int[] coins;

    public static void DFS( int sum, int level){

        if ( sum > m ) return;

        if ( sum == m ) {
            answer = Math.min( level, answer );
            return;
        } else {
            for ( int i =0; i<n; i++) {
                DFS( sum + coins[i] , level + 1);
            }
        }

        return;
    }


    public static void main(String[] args){
        Problem8_4 main = new Problem8_4();
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();


        coins = new int[n];

        for (int i = 0; i < n; i++ ){
            coins[i] = scn.nextInt();
        }

        m = scn.nextInt();
        main.DFS(0,0);

        System.out.println(answer);
        return ;
    }
}
