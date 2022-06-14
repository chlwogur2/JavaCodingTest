package Problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 * 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 *
 * 첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
 * 입력된 순서대로 등수를 출력한다.
 */

public class Problem2_8 {

    public void Solution() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] sScores = in.readLine().split(" ");
        Integer[] scores = new Integer[n];      // 내림차순 정렬하려면 Integer 타입을 써야함


        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(sScores[i]);
        }
        Integer scores_sorted[] = scores.clone();   // 정렬된 상태의 배열 생성 (깊은복사)
        Arrays.sort(scores_sorted, Collections.reverseOrder());

        int answer[] = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j =0; j<n; j++){
                if (scores[i] == scores_sorted[j] ){    // 내림차순으로 정렬한 배열의 처음 만나는 인덱스 == 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
                    answer[i] = j+1;
                    break;
                }
            }
            System.out.print(answer[i] + " ");
        }

    }

    public static void main(String[] args) throws IOException{
        Problem2_8 pr = new Problem2_8();
        pr.Solution();
    }
}
