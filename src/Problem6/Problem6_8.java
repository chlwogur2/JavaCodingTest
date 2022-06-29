package Problem6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Problem6_8 {

    public void Solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String[] sData = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        ArrayList<Integer> data = new ArrayList<>();
        for(String sd : sData) data.add(Integer.parseInt(sd));

        data.sort(Comparator.naturalOrder());

        int ans = binarySearch(data, 0, data.size()-1, m);
        System.out.println(ans);
    }

    public int binarySearch(ArrayList<Integer> list, int start, int end, int target) {
        int mid = (start + end) / 2;

        while (start <= end){
            if (list.get(mid) < target) return binarySearch(list, mid+1, end, target);
            else if (list.get(mid)  > target) return binarySearch(list, start, mid-1, target);
            else return mid+1;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        Problem6_8 pr = new Problem6_8();
        pr.Solution();
    }
}
