package 송파코딩스터디.week1;

import java.util.ArrayList;
import java.util.Scanner;


// 반복순열
public class 백준2331_S4 {

    static int A;
    static int P;

    static ArrayList<Integer> arr = new ArrayList<>(); // 얼마나 반복될지 모르니까 배열보다는 리스트

    static int put() {
        while(true){
            int cur = 0;
            int temp = arr.get(arr.size() - 1); // 맨 뒤에 거를 가져옴
            while (temp > 0) {
                cur += Math.pow(temp % 10, P);
                temp = temp/10;
            }

            if (!arr.contains(cur)) {   // 다음에 얻어지는 친구가 리스트에 없을 때만 반복문이 돈다
                arr.add(cur);
                continue;
            } else {
                return cur;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        A = scn.nextInt();
        P = scn.nextInt();

        arr.add(A);     // 넣고 시작

        int idx = arr.indexOf(put());   // 처음 반복된 애의 인덱스

        while (arr.size() > idx) arr.remove(idx);   // 그 뒤에 있는 애들 전부 삭제

        System.out.println(arr.size());
    }
}
