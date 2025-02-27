package z_baekjoon.스택.실버;

import java.util.*;

public class 균형잡힌_세상_실버4_4949 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            String str = scan.nextLine();
            if(str.equals(".")) break;
            String answer = solution(str);
            System.out.println(answer);
        }
    }
    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char findChar = str.charAt(i);
            if(findChar == '(' || findChar == '[') stack.push(findChar);
            else if (findChar == ')') {
                if(stack.isEmpty()) return "no";
                else if (stack.peek() != '(') return "no";
                else stack.pop();
            }
            else if (findChar == ']') {
                if(stack.isEmpty()) return "no";
                else if (stack.peek() != '[') return "no";
                else stack.pop();
            }
        }
        StringBuilder ret = new StringBuilder();
        if(stack.isEmpty()) ret.append("yes");
        else ret.append("no");
        return ret.toString();
    }
}
