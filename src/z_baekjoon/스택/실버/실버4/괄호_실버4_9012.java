package z_baekjoon.스택.실버.실버4;

import java.util.*;

public class 괄호_실버4_9012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < N; i++) {
            String str = scan.next();
            String answer = solution(str);
            System.out.println(answer);
        }
    }

    public static String solution(String str) {
        StringBuilder ret = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char findChar = str.charAt(i);
            if(findChar == '(') stack.push(findChar);
            else  {
                if(stack.isEmpty()) return "NO";
                if(stack.pop() != '(') return "NO";
            }
        }
        if(stack.isEmpty()) ret.append("YES");
        else ret.append("NO");
        return ret.toString();
    }
}
