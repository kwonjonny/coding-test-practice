package java_알고리즘_문제풀이_입문_코딩테스트_대비.스택_큐;

/**
 * 2. 괄호문자제거
 * 설명
 * <p>
 * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 남은 문자만 출력한다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    (A(BC)D)EF(G(H)(IJ)K)LM(N)
 * 예시 출력 1
 * <p>
 * EFLM
 */

import java.util.*;

public class B_괄호문자제거2 {

    /**
     * 재 복습: 2025-06-10
     */
    public static class B_괄호문자제거2_4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            solution(str);
        }
        public static void solution(String str) {
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < str.length(); i++) {
                char findChar = str.charAt(i);
                if(findChar != ')') stack.push(findChar);
                else if(findChar == ')') {
                    while(stack.pop() != '(');
                }
            }
            for(char x : stack) {
                System.out.print(x);
            }
        }
    }


    /**
     * 재 복습: 2025-05-12
     */
    public static class B_괄호문자제거2_3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            solution(str);
        }
        public static void solution(String str) {
            Stack<Character> stack = new Stack<>();
            for(char x : str.toCharArray()) {
                if(x != ')') stack.push(x);
                else {
                    if(!stack.isEmpty()) {
                        while(stack.pop() != '(');
                    }
                }
            }
            for(char x : stack) {
                System.out.print(x);
            }
        }
    }


    /**
     * 재 복습: 2025-03-28
     */
    public static class B_괄호문자제거2_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            solution(str);
        }
        public static void solution(String str) {
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < str.length(); i++) {
                char findChar = str.charAt(i);
                if(findChar != ')') stack.push(findChar);
                else {
                    while(stack.pop() != '(');
                }
            }
            for(char x : stack) {
                System.out.print(x);
            }
        }
    }


    /**
     * 재 복습: 2025-03-05
     */
    public static class B_괄호문자제거2_1 {
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
                if(findChar != ')') stack.push(findChar);
                else {
                    while(stack.pop() != '(');
                }
            }
            StringBuilder ret = new StringBuilder();
            for(char x : stack){
                ret.append(x);
            }
            return ret.toString();
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String answer = solution(str);
        System.out.println(answer);
    }

    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char findChar = str.charAt(i);
            if (findChar != ')') stack.push(findChar);
            else {
                while (stack.pop() != '(') ;
            }
        }
        for (char x : stack) {
            ret.append(x);
        }
        return ret.toString();
    }
}
