package Problem6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


/**
 * JAVA 에서 배열에 특정 원소가 포함되는지
 * [String]
 * Arrays.asList(배열).contains(특정 문자열) -> 숫자는 안됨
 *
 * [int형을 찾으려면]
 * IntStream.of(배열).anyMatch(x->x==특정 원소)
 *
 * 아 근데 이러면 indexOf 못씀 */

/**
 * [int 배열을 Integer List 로 변환]
 * https://www.techiedelight.com/ko/convert-int-array-list-integer/
 *
 * [주어진 배열의 요소 인덱스 찾기]
 * https://www.techiedelight.com/ko/find-index-element-array-java/
 */

public class Problem6_4 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt();  // 캐시의 크기
        int[] cache = new int[s];
        int n = scn.nextInt();  // 작업의 개수
        int[] works = new int[n];   // 작업 번호들

        for (int i = 0; i < n; i++) works[i] = scn.nextInt();

        List<Integer> cacheList = Arrays.stream(cache)
                                .boxed()
                                .collect(Collectors.toList());


        for (int i = 0; i < n; i++) {
            int cur = works[i];
            if(cacheList.contains(cur)){     // 만약 cache hit 이면
                for (int j = cacheList.indexOf(cur) - 1; j >= 0; j--) cache[j + 1] = cache[j];
                // hit 한 작업 앞에 애들을 한 칸씩 뒤로 밀어냄
                System.out.println("[Cache HIT!!!!]");
            } else {  // 만약 cache miss 면
                for (int j = cache.length-2; j >= 0; j--) cache[j + 1] = cache[j];   // 모든 애들을 한칸 뒤로 밀어냄
                System.out.println("[Cache MISS]");
            }
            cache[0] = cur;     // 현재 작업을 cache 의 맨 앞으로 옮김

            System.out.println(i + "번째, 현재 작업= " + cur);
            for(int x : cache) System.out.print(x + " ");
            System.out.println(" ");

        }

        for(int x : cache) System.out.print(x + " ");

    }

    public static void main(String[] args) {
        Problem6_4 pr = new Problem6_4();
        pr.Solution();
    }
}
