package z_baekjoon.스택.실버;

import java.util.*;

public class 제로_실버4_10773 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int N = scan.nextInt();
        for(int i = 0; i < N; i++) {
            int K = scan.nextInt();
            if(K == 0 && !stack.isEmpty()) stack.pop();
            else stack.push(K);
        }
        int sum = 0;
        for(int x : stack) {
            sum += x;
        }
        System.out.println(sum);
    }
}
