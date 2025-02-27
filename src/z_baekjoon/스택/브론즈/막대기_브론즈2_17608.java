package z_baekjoon.스택.브론즈;

import java.util.*;

public class 막대기_브론즈2_17608 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            int T = scan.nextInt();
            stack.push(T);
        }

        int answer = 0;
        int max = 0;
        while(!stack.isEmpty()) {
            int y = stack.pop();
            if(y > max) {
                answer++;
                max = y;
            }
        }
        System.out.println(answer);
    }
}
