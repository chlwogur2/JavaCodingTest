package Problem8;

import java.util.Scanner;

public class Problem8_7 {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int answer = 0;

    public void DFS(int[][] map, int x, int y) {
        if (x == map.length-1 && y == map[0].length-1) {
            answer++;

            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length){
                continue;
            } else {
                if (map[nx][ny] == 0) {
                    map[nx][ny] = 1;
                    DFS(map, nx, ny);
                    map[nx][ny] = 0;
                }
            }
        }

        return;

    }

    public static void main(String[] args) {
        Problem8_7 pr = new Problem8_7();
        Scanner scn = new Scanner(System.in);

        int[][] map = new int[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                map[i][j] = scn.nextInt();
            }
        }
        map[0][0] = 1;
        pr.DFS(map,0,0);
        System.out.println(answer);
    }
}
