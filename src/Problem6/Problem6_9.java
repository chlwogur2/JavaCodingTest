package Problem6;

import java.util.Arrays;
import java.util.Scanner;

public class Problem6_9 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[] songs = new int[n];

        for (int i = 0; i < n; i++) {
            songs[i] = scn.nextInt();
        }

        search(songs, Arrays.stream(songs).max().getAsInt(), Arrays.stream(songs).sum(), m);


    }

    public int search(int[] arr,  int min, int max, int target) {
        int mid = (max + min) / 2;
        int cnt = 0;    // dvd 장수
        int sum = 0;    // 그 순간까지의 합
        int i = 0;      // 인덱스

        while (i < arr.length) {
            while (sum + arr[i] <= mid) {
                sum += arr[i++];
            }
            cnt++;
        }
        System.out.println("mid = " + mid);
        if (cnt > target) return search(arr, mid+1, max, target);
        else if (cnt < target) return search(arr, min, mid - 1, target);
        else return Integer.min(mid, search(arr, min, mid + 1, target));
    }

    public static void main(String[] args) {
        Problem6_9 pr = new Problem6_9();
        pr.Solution();
    }
}
