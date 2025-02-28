package java_알고리즘_문제풀이_입문_코딩테스트_대비.스택_큐;

/**
 * 1. 올바른 괄호
 * 설명
 * <p>
 * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
 * <p>
 * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 번째 줄에 YES, NO를 출력한다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    (()(()))(()
 * 예시 출력 1
 * <p>
 * NO
 */

import java.util.*;

public class A_올바른_괄호1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String answer = solution(str);
        System.out.println(answer);
    }
    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char findChar = str.charAt(i);
            if(findChar == '(') stack.push(findChar);
            else {
               if(stack.isEmpty()) return "NO";
               stack.pop();
            }
        }
        if(stack.isEmpty()) return "YES";
        return "NO";
    }
}
