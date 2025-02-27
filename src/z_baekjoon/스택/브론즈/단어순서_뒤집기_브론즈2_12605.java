package z_baekjoon.스택.브론즈;

import java.util.*;

public class 단어순서_뒤집기_브론즈2_12605 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= N; i++) {
            String str = scan.nextLine();
            String answer = solution(str);
            System.out.println("Case #" + i + ":" + " " + answer);
        }
    }
    public static String solution(String str) {
        String[] splitArray = str.split(" ");
        Stack<String> stack = new Stack<>();
        for(String x : splitArray) {
            stack.push(x);
        }

        StringBuilder ret = new StringBuilder();
        while(!stack.isEmpty()) {
            ret.append(stack.pop()).append(" ");
        }
        return ret.toString();
    }
}
