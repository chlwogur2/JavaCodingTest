package Problem6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem6_5 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        Set<Integer> arrSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            arrSet.add(scn.nextInt());
            if (arrSet.size() != i+1) {
                System.out.println("D");
                return;
            }
        }

        System.out.println("U");
    }

    public static void main(String[] args) {
        Problem6_5 pr = new Problem6_5();
        pr.Solution();
    }
}
