package Problem6;

import java.util.Arrays;
import java.util.Scanner;

public class Problem6_11 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int n = scn.nextInt();
        int[] lans = new int[k];

        for(int i =0; i<k; i++){
            lans[i] = scn.nextInt();
        }
        Arrays.sort(lans);

        long lt = 1;
        long rt = lans[k-1];
        long mid;
        long ans = 0;

        while(lt <= rt){
                mid = (lt+rt)/2;
            if (cut(mid, lans) >= n) {
                ans = mid;
                lt = mid+1;
            } else rt = mid-1;
        }
        System.out.println(ans);
    }
    public static int cut(long cur, int[] arr){
        int cnt = 0;
        for(int x : arr){
            long q = x/cur;
            cnt += q;
        }
        return cnt;
    }
}
