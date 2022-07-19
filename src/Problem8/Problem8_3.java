package Problem8;

import java.util.*;

import java.util.*;

public class Problem8_3 {

    static int n,m;
    static int[] scores;
    static int[] times;
    static int answer;

    public static void DFS(int time_sum, int score_sum, int level){
        if ( time_sum > m ) return;

        if ( level == n ){
            answer = Math.max( answer, score_sum );
            return;
        }

        DFS( time_sum + times[ level ], score_sum + scores[ level ], level + 1 );
        DFS( time_sum, score_sum, level + 1 );
        return;
    }

    public static void main(String[] args){
        Problem8_3 main = new Problem8_3();
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        m = scn.nextInt();

        scores = new int[n];
        times = new int[n];

        for (int i = 0; i < n; i++){
            scores[i] = scn.nextInt();
            times[i] = scn.nextInt();
        }

        main.DFS(0,0,0);

        System.out.println(answer);

        return ;
    }
}
