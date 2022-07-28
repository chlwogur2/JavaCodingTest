package Problem8;

import java.util.*;

public class Problem8_8 {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};



    static class Point {
        int x;
        int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;

        }
    }

    public int BFS(int[][] map) {

        Queue<Point> queue = new LinkedList<>();
        Point start = new Point(0, 0);

        queue.add(start);

        while (!queue.isEmpty()) {
            Point cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) continue;

                if (map[nx][ny] == 0) { // 해당 노드를 처음 방문할 때만 answer ++
                    map[nx][ny] = map[cur.x][cur.y] + 1;
                    queue.add(new Point(nx, ny));
                }
            }

        }
        return map[map.length - 1][map[0].length - 1];
    }

    public static void main(String[] args) {
        Problem8_8 pr = new Problem8_8();
        Scanner scn = new Scanner(System.in);

        int[][] map = new int[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                map[i][j] = scn.nextInt();
            }
        }

        System.out.println(pr.BFS(map));

    }
}
