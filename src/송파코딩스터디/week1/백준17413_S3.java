package 송파코딩스터디.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 문자열 뒤집기 (스택 이용)
public class 백준17413_S3 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = in.readLine();

        char[] arr = s.toCharArray();

        Stack<Character> st = new Stack<>();

        for(int i  = 0; i < arr.length; i++){
            if (arr[i] == ' ') {
                while(!st.isEmpty()) sb.append(st.pop());
                sb.append(arr[i]);
            } else if (arr[i] == '<'){    // < 발견하면 그대로 삽입
                while(!st.isEmpty()) sb.append(st.pop());  // 스택에 들어있는 애들 비움
                while (arr[i] != '>') {
                    sb.append(arr[i++]);
                }
                sb.append(arr[i]);  // 마지막 > 삽입
            } else st.push(arr[i]);
        }
        while (!st.isEmpty()) sb.append(st.pop());

        System.out.println(sb);
    }

}
