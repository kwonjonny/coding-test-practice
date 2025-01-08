package stack_solve;

import java.util.Scanner;
import java.util.Stack;

/**
 * 괄호문자제거
 * 설명
 *
 * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 남은 문자만 출력한다.
 *
 * 예시 입력
    (A(BC)D)EF(G(H)(IJ)K)LM(N)
 *
 * 예시 출력
 * EFLM
 */
public class A2_Stack {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String answer = solution(str);
        System.out.println(answer);
    }
    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (Character x : str.toCharArray()) {
            if(x.equals(')')) {
                while(stack.pop()!='(');
            } else {
                stack.push(x);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(Character x : stack) {
            stringBuilder.append(x);
        }
        return stringBuilder.toString();
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class A2Stack1 {
        public static void main(String[] args) {
            A2Stack1 a2Stack1 = new A2Stack1();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String answer = a2Stack1.solution(str);
            System.out.println(answer);
        }
        public String solution(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            Stack<Character> stack = new Stack<>();
            for(char x : str.toCharArray()) {
                if(x == ')') {
                    while(stack.pop() != '(');
                } else {
                    stack.push(x);
                }
            }
            for(Character x : stack) {
                stringBuilder.append(x);
            }
            return stringBuilder.toString();
        }
    }
    
    /**
     * 재 복습: 2025-01-08
     */
    public static class A2Stack2 {
        public static void main(String[] args) {
            A2Stack2 a2Stack2 = new A2Stack2();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String answer = a2Stack2.solution(str);
            System.out.println(answer);
        }
        public String solution(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            Stack<Character> stack = new Stack<>();
            for(Character x : str.toCharArray()) {
                if(x.equals(')')) {
                    while(stack.pop() != '(');
                } else {
                    stack.push(x);
                }
            }
            for(Character x : stack) {
                stringBuilder.append(x);
            }
            return stringBuilder.toString();
        }
    }
}
