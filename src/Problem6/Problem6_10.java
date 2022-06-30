package Problem6;

import java.util.Arrays;
import java.util.Scanner;

public class Problem6_10 {
    public void Solution() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();

        int[] horses = new int[n];
        for (int i = 0; i < n; i++) horses[i] = scn.nextInt();

        Arrays.sort(horses);

        System.out.println(search(horses,c));
    }

    public int search(int[] arr, int target) {
        int right = Arrays.stream(arr).max().getAsInt();
        int left = 1;
        int ans = 0;

        while(left <= right){
            int mid = (left + right) / 2;
            if (putHorse(arr, mid) < target) right = mid - 1;   // 넣을 수 있는 말의 개수가 적으면, 거리를 좁힘
            else {
                ans = mid;
                left = mid + 1;     // 말을 넣을 수 있으면, 거리를 늘려봄
            }
        }
        return ans;
    }

    public int putHorse(int[] arr, int distance){       // 주어진 거리대로 말을 마굿간에 집어 넣는 함수

        int cnt = 1;    // 마굿간에 들어갈 수 있는 말의 개수  // arr[0] 에 넣고 시작할 거임
        int cur = 0;    // 마지막으로 말이 들어간 마굿간과의 거리

        for (int i = 1; i < arr.length; i++) {
            if (cur + (arr[i] - arr[i-1])  < distance){    // 현재 떨어진 거리가 distance 보다 적으면 못 집어넣음
                cur += (arr[i] - arr[i-1]);
            }
            else {  // 현재 떨어진 거리가 distance 보다 크면 말을 마굿간에 집어넣음
                cnt++;
                cur = 0;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Problem6_10 pr = new Problem6_10();
        pr.Solution();
    }
}
