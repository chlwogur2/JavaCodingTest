package 송파코딩스터디.week1;

// 이전 순열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// 시간복잡도 계산)
// 10000 개의 순열을 모두 구하는 건 말도 안됨 (n!)
// 어렵다
public class 백준10973_S3 {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        arr = new int[n];

        StringTokenizer stk = new StringTokenizer(in.readLine(), " ");
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(stk.nextToken());

        int idx = arr.length -1;

        while(idx > 0 && arr[idx-1] < arr[idx]){    // 현재 숫자가 앞의 숫자보다 더 높으면 인덱스 계속 옮김
            idx--;
        }
        if (idx == 0) {
            System.out.println(-1); // 만약 끝까지 내려왔으면 얘가 제일 앞의 순열이므로 -1 출력
            return;
        }

        int jdx = arr.length -1;    // 이전 순열이 되기위해서 바꿀 인덱스

        while (arr[jdx] >= arr[idx-1]) {
            jdx--;
        }

        int temp = arr[idx - 1];
        arr[idx - 1] = arr[jdx];
        arr[jdx] = temp;        // 서로 바꿈

        jdx = arr.length - 1;
        while (idx < jdx) {     // 바꾼 애
            temp = arr[idx];
            arr[idx] = arr[jdx];
            arr[jdx] = temp;
            idx++;
            jdx--;
        }

        for (int x : arr) System.out.print(x + " ");
    }

}
