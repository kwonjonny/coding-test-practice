package stack_solve;

import java.util.*;

/**
 * 올바른 괄호
 * 설명
 * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
 * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
 *
 * 입력
 * 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
 *
 * 출력
 * 첫 번째 줄에 YES, NO를 출력한다.
 *
 * 예시 입력
    (()(()))(()
 *
 * 예시 출력
 * NO
 */
public class A1_Stack {

    /**
     * 재 복습: 2025-02-01
     */
    public static class A1Stack6 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            A1Stack6.solution(str);
        }
        public static void solution(String str) {
            Stack<Character> stack = new Stack<>();
            for(Character x : str.toCharArray()) {
                if(x.equals('(')) stack.push(x);
                else if(!stack.isEmpty() && x.equals(')')) stack.pop();
            }
            String answer = stack.isEmpty() ? "YES" : "NO";
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-01-13
     */
    public static class A1Stack5 {
        public static void main(String[] args) {
            A1Stack5 a1Stack5 = new A1Stack5();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            a1Stack5.solution(str);
        }
        public void solution(String str) {
            String answer = "YES";
            Stack<Character> stack = new Stack<>();
            for(Character x : str.toCharArray()) {
                if(x.equals('(')) {
                    stack.push(x);
                }
                else {
                    if(!stack.isEmpty()) answer = "NO";
                    else stack.pop();
                }
            }
            if(stack.isEmpty()) answer = "YES";
            else answer = "NO";
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class A1Stack4 {
        public static void main(String[] args) {
            A1Stack4 a1Stack4 = new A1Stack4();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            a1Stack4.solution(str);
        }
        public void solution(String str) {
            Stack<Character> stack = new Stack<>();
            String answer = "NO";
            for(Character x : str.toCharArray()) {
                if(x.equals('(')) stack.push(x);
                else {
                    if(!stack.isEmpty()) answer = "NO";
                    stack.pop();
                }
            }
            if(stack.isEmpty()) answer = "YES";
            System.out.println(answer);
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
        for(Character x : str.toCharArray()) {
            if(x.equals('(')) stack.push(x);
            else if(x.equals(')')) {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }

    /**
     * 재 복습: 2024-12-28
     */
    public static class A1Stack {
        public static void main(String[] args) {
            A1Stack a1Stack = new A1Stack();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String answer = a1Stack.solution(str);
            System.out.println(answer);
        }
        public String solution(String str) {
            Stack<Character> stack = new Stack<>();
            for(Character x : str.toCharArray()) {
                if(x.equals('(')) stack.push(x);
                else if(x.equals(')')) {
                    if(stack.isEmpty()) return "NO";
                    stack.pop();
                }
            }
            return stack.isEmpty() ? "YES" : "NO";
        }
    }

    /**
     * 재 복습: 2024-12-28
     */
    public static class A1Stack1 {
        public static void main(String[] args) {
            A1Stack1 a1Stack1 = new A1Stack1();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String answer = a1Stack1.solution(str);
            System.out.println(answer);
        }
        public String solution(String str) {
            Stack<Character> stack = new Stack<>();
            for(Character x : str.toCharArray()) {
                if(x.equals('(')) stack.push(x);
                if(x.equals(')')) {
                    if(stack.isEmpty()) return "NO";
                    stack.pop();
                }
            }
            return stack.isEmpty() ? "YES" : "NO";
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class A1Stack2 {
        public static void main(String[] args) {
            A1Stack2 a1Stack2 = new A1Stack2();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String answer = a1Stack2.solution(str);
            System.out.println(answer);
        }
        public String solution(String str) {
            Stack<Character> stack = new Stack<>();
            for(char x : str.toCharArray()) {
                if(x == '(') {
                    stack.push(x);
                } else if(x == ')') {
                    if(stack.isEmpty()) return "NO";
                    stack.pop();
                }
            }
            return stack.isEmpty() ? "YES" : "NO";
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class A1Stack3 {
        public static void main(String[] args) {
            A1Stack3 a1Stack3 = new A1Stack3();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String answer = a1Stack3.solution(str);
            System.out.println(answer);
        }
        public String solution(String str) {
            Stack<Character> stack = new Stack<>();
            for(Character x : str.toCharArray()) {
                if(x.equals('(')) stack.push(x);
                else {
                    if(stack.isEmpty()) return "NO";
                    stack.pop();
                }
            }
            return stack.isEmpty() ? "YES" : "NO";
        }
    }
}
