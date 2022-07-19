package Problem8;

import java.util.*;

/**
 * 모든 부분 집합을 구해서, 그 집합과 서로소 집합인 애들과 합 비교
 */
public class Problem8_1 {

    static int[] set;
    static int[] visited;
    static boolean flag = false;
    static String answer = "NO";

    public void DFS(int val){

        if(flag) return;

        if(val == set.length){
            int sum = 0;
            for (int i = 0; i < visited.length; i++) {
                if (visited[i] == 1){
                    sum += set[i];
                }
            }
            int other_sum = Arrays.stream(set).sum() - sum;

            if (sum == other_sum) {
                flag = true;
                answer = "YES";
                return;
            }
        } else{
            visited[val] = 1;
            DFS(val+1);
            visited[val] = -1;
            DFS(val+1);
        }
        return;
    }

    public static void main(String[] args){
        Problem8_1 pr = new Problem8_1();

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        set = new int[n];
        visited = new int[n];

        Arrays.fill(visited, -1);

        for (int i = 0; i < n; i++) {
            set[i] = scn.nextInt();
        }

        pr.DFS(0);
        System.out.println(answer);

    }
}
