package Problem6;

import java.util.Arrays;
import java.util.Scanner;

public class Problem6_9_ans {

    public void Solution() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[] songs = new int[n];
        for (int i = 0; i < n; i++) songs[i] = scn.nextInt();

        int ans = search(songs, m);
        System.out.println(ans);
    }

    public int count(int[] arr, int capacity) {    // 얘의 리턴값은 필요한 dvd 개수
        int sum = 0;
        int cnt = 1;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > capacity) {
                cnt++;
                sum = arr[i];
            } else sum += arr[i];
        }

        return cnt;
    }

    public int search(int[] arr, int target) {
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        int ans = 1;
        int how_many = 0;

        while (lt <= rt) {
            how_many++;
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= target) {    // 현재 dvd 용량으로 만들 수 있는 dvd 개수가 더 적으면
                ans = mid;                      // dvd 용량을 더 줄일 수 있음, 얘도 답은 가능, 따라서 정답에 저장
                rt = mid -1;
            } else {
                lt = mid + 1;
            }

            System.out.println(ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        Problem6_9_ans pr = new Problem6_9_ans();
        pr.Solution();
    }
}
