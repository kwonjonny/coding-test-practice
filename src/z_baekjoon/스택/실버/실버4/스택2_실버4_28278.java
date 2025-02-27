package z_baekjoon.스택.실버.실버4;

import java.util.*;

public class 스택2_실버4_28278 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        Stack<Integer> stack = new Stack<>();
        StringBuilder ret = new StringBuilder();
        for(int i = 0; i < L; i++) {
            int N = scan.nextInt();
            if(N == 1) {
                int T = scan.nextInt();
                stack.push(T);
            }
            else if (N == 2) {
                if(stack.isEmpty()) ret.append(-1).append("\n");
                else ret.append(stack.pop()).append("\n");
            }
            else if (N == 3) {
                ret.append(stack.size()).append("\n");
            }
            else if (N == 4) {
                if(stack.isEmpty()) ret.append(1).append("\n");
                else ret.append(0).append("\n");
            }
            else if (N == 5) {
                if(!stack.isEmpty()) ret.append(stack.peek()).append("\n");
                else ret.append(-1).append("\n");
            }
        }
        System.out.println(ret.toString());
        scan.close();
    }
}
