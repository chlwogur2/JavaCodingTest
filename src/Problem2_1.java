import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * [큰 수 출력하기]
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 *
 * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 *
 * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 */
public class Problem2_1 {

    public void solution() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();     // 처음 수 입력
        String[] str_num = in.readLine().split(" ");    // 띄어쓰기 구분으로 입력받음

        int n = Integer.parseInt(str);

        int[] arr = new int[n];     // 자연수 배열

        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(str_num[i]);
        }

        ArrayList<Integer> answer = new ArrayList<>();  // 답을 출력하는 배열
        answer.add(arr[0]);     // 첫번째 원소는 무조건 포함

        // 배열을 돌면서, 현재 인덱스와 앞의 인덱스를 비교
        for (int i=1; i<n; i++){
            if (arr[i] > arr[i-1]){
                answer.add(arr[i]);
            }
        }
        /**
         * Iterator 로 배열을 돌면서 출력
         */
//        Iterator iter = answer.iterator();
//        while(iter.hasNext()){
//            System.out.print(iter.next()+" ");
//        }
        /**
         * StringBuilder로 출력
         */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answer.size(); i++) {
            sb.append(answer.get(i)).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        Problem2_1 pr = new Problem2_1();
        pr.solution();
    }
}
