package Problem8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem8_9 {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int answer = 0;

    // 익은 토마토들의 좌표를 저장하자
   static ArrayList<Tomato> rippen = new ArrayList<>();

    static class Tomato{
        int x;
        int y;

        Tomato(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static boolean check(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 0) return false;
            }
        }
        return true;
    }


    public static void BFS(int[][] map) {
        Queue<Tomato> queue = new LinkedList<>();

        for (Tomato t : rippen) {
            queue.add(t);
        }

        while (!queue.isEmpty()){
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                Tomato t = queue.poll();

                for (int i = 0; i < 4; i++) {
                    int nx = t.x + dx[i];
                    int ny = t.y + dy[i];

                    if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) continue;

                    if (map[nx][ny] == 0) {
                        queue.add(new Tomato(nx, ny));
                        map[nx][ny] = 1;
                    }
                }

            }
            answer++;

        }

        if (check(map)) System.out.println(answer-1);
        else System.out.println(-1);
    }

    public static void main(String[] args){
        Problem8_9 pr = new Problem8_9();
        Scanner scn = new Scanner(System.in);

        int m = scn.nextInt();
        int n = scn.nextInt();

        int[][] tomato = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tomato[i][j] = scn.nextInt();
                // 익은 토마토면 rippen 에 삽입
                if (tomato[i][j] == 1) rippen.add(new Tomato(i, j));
            }
        }

        pr.BFS(tomato);
    }
}
