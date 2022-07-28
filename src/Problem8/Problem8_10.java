package Problem8;

import java.util.Scanner;

public class Problem8_10 {

    static int n;
    static int answer = 0;

    static boolean DFS(int[][] map,int x, int y) {
        // 벽넘어가면 함수 끝냄
        if (x < 0 || y < 0 || x >= n || y >= n) return false;

        if (map[x][y] == 0) return false;
        else {
            map[x][y] = 0;
            DFS(map, x+1,y+1);
            DFS(map, x,y+1);
            DFS(map, x-1,y-1);
            DFS(map, x+1,y);
            DFS(map, x+1,y-1);
            DFS(map, x-1,y);
            DFS(map, x-1,y+1);
            DFS(map, x,y-1);
            return true;
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (DFS(map,i,j)) {
//                    System.out.println("i= " + i + ", j= " + j);
//                    for (int a = 0; a < n; a++) {
//                        for (int b = 0; b < n; b++) {
//                            System.out.print(map[a][b] + " ");
//                        }
//                        System.out.println();
//                    }
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
