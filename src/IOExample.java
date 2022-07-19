import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class IOExample {

    public void IOExample() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // 개행문자로 구분해서 \n이 나오면
        String line = in.readLine();
        String ch = in.readLine();

        String[] srr = in.readLine().split(" ");

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        int N = 10;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 그래프 입력
        // 정점의 개수, 간선의 개수
        // from, to, weight
//        adjMat[from][to] = weight;

        /**
         * 인접행렬
         */
        int[][] adjMat = new int[N][N];

//        ArrayList<ArrayList<int[]>> adjList = new ArrayList<ArrayList<int[]>>();
//        ArrayList<ArrayList<Integer>> adjList_Integer = new ArrayList<ArrayList<Integer>>();
//
//        for (int v = 0; v < N; v++)
//            adjList.add(new ArrayList<>());

        /**
         * 인접리스트
         * (초기화 필요)
         */
        ArrayList<int[]>[] adjList = new ArrayList[N];

        // 초기화
        for (int i=0; i<N; i++){
            adjList[i] = new ArrayList<>();
        }



        // 인접리스트 강의에서 알려준 방식
        ArrayList<ArrayList<Integer>> adList2 = new ArrayList<>();

        for (int i = 0; i < adList2.size(); i++) {
            adList2.add(new ArrayList<>());
        }



        // M개의 간선
        /**
         * [1 3 2] -> [from, to, weight]
         */

        for (int i=0; i<N; i++){
            String[] inn = in.readLine().split(" ");

            int from = Integer.parseInt(inn[0]);
            int to = Integer.parseInt(inn[1]);
            int weight = Integer.parseInt(inn[2]);

            adjList[from].add(new int[] {to, weight});
        }


        adjList[0].add(new int[] {});

        for (int[] edge : adjList[0]) {
        }


    }

    public int solution(String string) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        String s = "hello world";
        String s1 = "world";

        String[] tt = s.split(" ");

        int n = 5;
        ArrayList<char[]>[] temp = new ArrayList[n];
        for(int i = 0; i<n; i++ ) {
            temp[i] = new ArrayList<>();
        }

        for(int i = 0; i<2; i++){
            for (int j = 0; j < tt[i].length(); j++) {
                temp[i].add(tt[i].toCharArray());
            }
        }

        System.out.println(temp);

    }

}
