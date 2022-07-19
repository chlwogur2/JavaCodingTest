package Problem7;

import java.util.Scanner;

public class ExampleSet {

    static int n;
    static int[] ch;

    public void DFS(int L) {
        if (L == n+1){
            for (int i = 1; i < ch.length; i++) {
                if (ch[i] == 1){
                    System.out.print(i + " ");
                }
            }
            System.out.println(" ");
            return;
        }
        else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L+1);
        }
    }

    public static void main(String[] args){
        ExampleSet s = new ExampleSet();
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        ch = new int[n+1];

        s.DFS(1);

    }

}
