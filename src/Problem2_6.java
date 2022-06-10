import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * 첫 자리부터의 연속된 0은 무시한다.
 *
 * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
 * 각 자연수의 크기는 100,000를 넘지 않는다.
 *
 * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 */

public class Problem2_6 {

    public Boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i ==0 ) return false;
        }
        return true;
    }


    public void solution() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String sn = in.readLine();
        int n = Integer.parseInt(sn);

        String[] sData = in.readLine().split(" ");

        int[] sDataLength = new int[n];

        for (int i = 0; i < n; i++) {
            sDataLength[i] = sData[i].length();
        }

        int[] data = new int[n];
        int[] reversedData = new int[n];    // 뒤집은 자연수 배열

        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i =0; i<n; i++) {
            data[i] = Integer.parseInt(sData[i]);
            int cnt = 1;    // 아래 있는 반복문의 실행 횟수
            while (data[i]>0) {     // 숫자가 0이 될 때까지 나누기 실행
                int temp = data[i] % 10;
                reversedData[i] += temp * Math.pow(10,sDataLength[i] - cnt);
                cnt++;
                data[i] = data[i]/10;
            }
            if (isPrime(reversedData[i])) {
                answer.add(reversedData[i]);
            }
        }

        for (int ans : answer){
            System.out.print(ans + " ");
        }


    }

    public static void main(String[] args) throws IOException {
        Problem2_6 pr = new Problem2_6();
        pr.solution();
    }


}
