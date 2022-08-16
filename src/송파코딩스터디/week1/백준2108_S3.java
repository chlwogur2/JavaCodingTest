package 송파코딩스터디.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 통계
// 시간 복잡도를 위해 카운팅 배열을 씀
public class 백준2108_S3 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        int[] arr = new int[8001];  // -4000 ~ 4000 까지 값을 저장하기 위해서, 각각의 인덱스가 값이됨, value 는 빈도수
                                    // 0 ~ 4000 까지는 -4000 ~ 0 저장, 4001 ~ 8000 까지는 1 ~ 4000 저장

        int tmp = 0;
        double sum = 0;
        int max = -4001;
        int min = 4001;
        for (int i = 0; i < n; i++) {
            tmp = Integer.parseInt(in.readLine());
            arr[tmp + 4000]++;
            sum += tmp;
            max = Math.max(max, tmp);
            min = Math.min(min, tmp);
        }

        // 산술 평균
        double avg = sum / n;
        System.out.println(Math.round(avg));

        // 중앙값
        int cur = 0;
        for (int i = 0; i < arr.length; i++) {
            cur += arr[i];
            if (cur > n/2) {
                System.out.println(i-4000);   // 절반을 넘어서는 순간 커트
                break;
            }
        }

        // 최빈값 (중복시 최빈값 중 두번째로 작은 값)
        int max_appear = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (max_appear < arr[i]) {  // 새로운 최빈값 나타나면 리스트 비우고 새로 추가
                list.clear();
                max_appear = arr[i];
                list.add(i-4000);
            } else if (max_appear == arr[i]) list.add(i-4000);   // 같은 빈도수면 리스트에 그대로 추가
        }
        if (list.size() == 1) System.out.println(list.get(0));
        else {
            Collections.sort(list);
            System.out.println(list.get(1));
        }
        // 범위
        System.out.println(max - min);
    }
}
