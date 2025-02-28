package java_알고리즘_문제풀이_입문_코딩테스트_대비.스택_큐;

import java.util.*;

public class B_괄호문자제거2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String answer = solution(str);
        System.out.println(answer);
    }
    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ret = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char findChar = str.charAt(i);
            if(findChar != ')') stack.push(findChar);
            else {
                while(stack.pop() != '(');
            }
        }
        for(char x : stack) {
            ret.append(x);
        }
        return ret.toString();
    }
}
