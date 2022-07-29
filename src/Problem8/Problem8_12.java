package Problem8;

import java.util.*;
import java.io.*;


// 백준 14502 연구소

public class Problem8_12 {

    static int[][] map;

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static ArrayList<Point> safe = new ArrayList<>();
    static ArrayList<Point> virus = new ArrayList<>();

    static class Point{
        int x;
        int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static int answer = Integer.MIN_VALUE;

    static int[] selected = new int[3];

    public static void Select(int level, int cur){
        // 벽을 3개 전부 세웠을 때
        if (level == 3){

            // 카피 배열 생성
            int[][] copy = new int[map.length][map[0].length];

            for(int i = 0; i< map.length; i++){
                for(int j =0; j<map[0].length; j++){
                    copy[i][j] = map[i][j];
                }
            }
            // 완료

            int cnt = 0;

            // 바이러스들 위치를 큐에 삽입
            Queue<Point> q = new LinkedList<>();
            for (Point v : virus) q.add(v);

            // 3개의 정해진 위치에다가 벽을 세움
            for (int x : selected){
                Point p = safe.get(x);
                copy[p.x][p.y] = 1;
            }

            while(!q.isEmpty()){
                Point now = q.poll();

                for (int i =0; i<4; i++){
                    int nx = now.x + dx[i];
                    int ny = now.y + dy[i];

                    if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) continue;

                    if (copy[nx][ny] == 0) {
                        copy[nx][ny] = 2;    // 감염
                        q.add(new Point(nx,ny));
                    }
                }
            }

            // 안전한 지역의 넓이를 계산
            for (int i = 0; i<map.length; i++){
                for (int j = 0; j<map[0].length; j++){
                    if (copy[i][j] == 0) cnt++;
                }
            }

            answer = Math.max(answer, cnt);

            // 3개의 벽 세울 지점을 고르는 로직
        } else {
            for (int i = cur; i < safe.size(); i++){
                selected[level] = i;
                Select(level + 1, i+1);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(in.readLine(), " ");

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        map = new int[n][m];

        for(int i =0; i<n; i++){
            stk = new StringTokenizer(in.readLine(), " ");
            for(int j = 0; j<m; j++){
                map[i][j] = Integer.parseInt(stk.nextToken());
                if (map[i][j] == 0) safe.add(new Point(i,j));
                else if (map[i][j] == 2) virus.add(new Point(i,j));
            }
        }

        Select(0,0);

        System.out.println(answer);
    }
}
