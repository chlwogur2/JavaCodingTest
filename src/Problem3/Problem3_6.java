package Problem3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * [구현이 어려움]
 * 수열을 처음부터 돌면서, 0을 만나면 1로 바꿈. 얘를 k번 반복함
 * 그리고 k번 반복했을 때의 연속길이를 구함.
 * 그리고 맨 처음 1로 바꿨던 0을 다시 0으로 변경 (0->1->0)
 * 그리고 가장 최근 1로 바꿨던 자리부터 다시 출발해서 0을 만나면 1로 바꿔보면서 연속길이를 계산
 * 매번 최대 연속 길이를 max 에 저장하고, 마지막까지 수열을 돌면서 최대 max 값을 리턴
 * --> 근데 이 방법은 바꿀 때마다 0의 위치를 기록하고 있어야 하나
 *
 * [모든 0의 위치를 기록하는 ArrayList 사용]
 *
 */

public class Problem3_6 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();  // 수열의 길이
        int k = scn.nextInt();  // 바꿀 수 있는 횟수

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int max = 0;    // 연속된 1의 길이 중 최대 길이
        int length = 0; // 현재 연속된 1의 길이


        /**
         * 실제로 바꿀 (0->1) 필요는 없을 것 같다.
         * 나는 이중 반복문 안쓰고 풀었음.
         */

        ArrayList<Integer> zeros = new ArrayList<>();   // 0 의 위치를 기록하는 arraylist
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0) zeros.add(i);   // 0 의 인덱스를 기록
        }

        max = zeros.get(k - 1);     // 맨 처음 arr 부터 k 번 바꿨을 때 연속 수열 길이를 max 에 저장

        int cur = 1;    // 현재 1로 바꾼 맨 앞 인덱스
        while (cur < zeros.size() - k) {
            length = (zeros.get(cur + k)-1) - (zeros.get(cur - 1) + 1) + 1;     // (cur) ~ (cur + k + 1 번째 0 인덱스 -1)
            if (max < length) max = length;
            cur++;
        }

        length = arr.length  - (zeros.get(zeros.size() - k) + 1) +1;    // 마지막에서 k+1번째 0 다음으로 부터 끝까지의 길이

        if (max < length) max = length;

        System.out.println(max);
    }

    public static void main(String[] args) {
        Problem3_6 pr = new Problem3_6();
        pr.Solution();
    }
}
