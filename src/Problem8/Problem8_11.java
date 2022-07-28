package Problem8;

import java.io.*;
import java.util.*;

public class Problem8_11 {

    static int n;
    static int m;

    static int len;

    // 각 집들의 피자 배달 거리를 합한 값
    // 얘가 최소가 되는 m 개의 피자집을 구해야함
    static int answer = Integer.MAX_VALUE;

    static ArrayList<Point> pizza = new ArrayList<>();  // 피자집 위치
    static ArrayList<Point> houses = new ArrayList<>();  // 집들 위치

    static int[] combination;

    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public void DFS(int level, int cur){
        if (level == m){     // 피자 집 중 m 개를 전부 구했으면, 이제 제일 가까운 애를 구해서 기록
            int sum = 0;
            for (Point p : houses){
                int distance = Integer.MAX_VALUE;
                for (int x : combination){
                    Point cur_pizza = pizza.get(x);
                    distance = Math.min(distance, Math.abs(p.x - cur_pizza.x) + Math.abs(p.y - cur_pizza.y));
                }
                sum += distance;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = cur; i < len; i++) {
                combination[level] = i;
                DFS(level + 1, i+1);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        Problem8_11 pr = new Problem8_11();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(in.readLine(), " ");

        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(in.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(stk.nextToken());
                if (arr[i][j] == 2) pizza.add(new Point(i,j));
                else if (arr[i][j] == 1) houses.add(new Point(i, j));
            }
        }

        combination = new int[pizza.size()];
        len = pizza.size();

        // 상하좌우로 탐색해 나가면 거리는 매번 같음
        // 일단 각 집별로 피자집의 최단 거리 순서를 매기자

        // 제외하는 피자집의 경우의 수를 전부 고려를 해야하나? ㅇㅇ 그러네

        pr.DFS(0,1);
        System.out.println(answer);
    }
}
