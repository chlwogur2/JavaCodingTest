package Problem5;


import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;


class Person {
    int id;
    int risk;

    public Person(int id, int risk) {
        this.id = id;
        this.risk = risk;
    }
}


public class Problem5_8 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        Queue<Person> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.add(new Person(i, scn.nextInt()));
        }

        int cnt = 1;
        while (!q.isEmpty()) {
            Person cur = q.poll();
            for (Person x : q) {
                if (x.risk > cur.risk){
                    q.add(cur);
                    cur = null;
                    break;
                }
            }
            if (cur!=null && cur.id == k) {
                System.out.println(cnt);
                break;
            }
            else if (cur!=null && cur.id != k){
                cnt++;
            }

        }
    }

    public static void main(String[] args) {
        Problem5_8 pr = new Problem5_8();
        pr.Solution();
    }
}
