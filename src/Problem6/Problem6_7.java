package Problem6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



class Point implements Comparable<Point>{
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

public class Problem6_7 {

    public void Solution() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            points.add(new Point(scn.nextInt(), scn.nextInt()));
        }
        Collections.sort(points);
        for(Point p : points) System.out.println(p.x + " " + p.y);
    }

    public static void main(String[] args) {
        Problem6_7 pr = new Problem6_7();
        pr.Solution();
    }
}
