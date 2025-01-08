package string_solve;

import java.util.Scanner;
import java.util.Stack;

/**
 * 특정 문자 뒤집기
 *
 * 설명: 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 * 조건:
 * 1. 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 * 출력:
 * - 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 *
 * 예제:
 * 입력:
 *  a#b!GE*T@S
 *
 * 출력:
 *   S#T!EG*b@a
 */
public class A5_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String solution = solution(str);
        System.out.println(solution);
    }

    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                stack.push(c);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                stringBuilder.append(stack.pop());
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    /**
     * 2024-12-05 복습
     */
    public static class A5String {

        public static void main(String[] args) {
            A5String a5String = new A5String();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String solution = a5String.solution(str);
            System.out.println(solution);
        }

        public String solution(String str) {
            Stack<Character> stack = new Stack<>();

            for(char x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) {
                    stack.push(x);
                }
            }

            StringBuilder stringBuilder = new StringBuilder();
            for(char x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) {
                    stringBuilder.append(stack.pop());
                } else {
                    stringBuilder.append(x);
                }
            }
            return stringBuilder.toString();
        }
    }

    /**
     * 2024-12-06 복습
     */
    public static class A5String1 {
        public static void main(String[] args) {
            A5String1 a5String1 = new A5String1();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String solution = a5String1.solution(str);
            System.out.println(solution);
        }

        public String solution(String str) {
            Stack<Character> stack = new Stack<>();

            for(char x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) {
                    stack.push(x);
                }
            }

            StringBuilder stringBuilder = new StringBuilder();
            for(char x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) {
                    stringBuilder.append(stack.pop());
                } else {
                    stringBuilder.append(x);
                }
            }
            return stringBuilder.toString();
        }
    }

    /**
     * 재 복습: 2024-12-11
     */
    public static class A5String2 {
        public static void main(String[] args) {
            A5String2 a5String2 = new A5String2();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String solution = a5String2.solution(str);
            System.out.println(solution);
        }

        public String solution(String str) {
            Stack<Character> stack = new Stack<>();
            StringBuilder stringBuilder = new StringBuilder();
            for(char x : str.toCharArray()) {
                if(Character.isLetter(x)) {
                    stack.add(x);
                }
            }

            for(char x : str.toCharArray()) {
                if(Character.isLetter(x)) {
                    stringBuilder.append(stack.pop());
                } else {
                    stringBuilder.append(x);
                }
            }
            return stringBuilder.toString();
        }
    }

    /**
     * 재 복습: 2024-12-15
     */
    public static class A5String3 {
        public static void main(String[] args) {
            A5String3 a5String3 = new A5String3();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            System.out.println(a5String3.solution(str));
        }

        public String solution(String str) {
            Stack<Character> stack = new Stack<>();
            for(char x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) {
                    stack.push(x);
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            for(char x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) {
                    stringBuilder.append(stack.pop());
                } else {
                    stringBuilder.append(x);
                }
            }
            return stringBuilder.toString();
        }
    }

    /**
     * 재 복습: 2024-12-18
     */
    public static class A5String4 {
        public static void main(String[] args) {
            A5String4 a5String4 = new A5String4();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            System.out.println(a5String4.solution(str));
        }
        public String solution(String str) {
            Stack<Character> stack = new Stack<>();
            for(char x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) {
                    stack.push(x);
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            for(char x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) {
                    stringBuilder.append(stack.pop());
                } else {
                    stringBuilder.append(x);
                }
            }
            return stringBuilder.toString();
        }
    }

    /**
     * 재 복습: 2024-12-25
     */
    public static class A5String5 {
        public static void main(String[] args) {
            A5String5 a5String5 = new A5String5();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            System.out.println(a5String5.solution(str));
        }
        public String solution(String str) {
            Stack<Character> stack = new Stack<>();

            for(char x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) {
                    stack.push(x);
                }
            }

            StringBuilder stringBuilder = new StringBuilder();
            for(char x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) {
                    stringBuilder.append(stack.pop());
                } else {
                    stringBuilder.append(x);
                }
            }
            return stringBuilder.toString();
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class A5String6 {
        public static void main(String[] args) {
            A5String6 a5String6 = new A5String6();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            a5String6.solution(str);
        }
        public void solution(String str) {
            Stack<Character> stack = new Stack<>();
            for(Character x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) {
                    stack.push(x);
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            for(Character x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) {
                    stringBuilder.append(stack.pop());
                } else {
                    stringBuilder.append(x);
                }
            }
            System.out.println(stringBuilder);
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class A5String7 {
        public static void main(String[] args) {
            A5String7 a5String7 = new A5String7();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            a5String7.solution(str);
        }
        public void solution(String str) {
            Stack<Character> stack = new Stack<>();
            for(Character x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) stack.push(x);
            }
            StringBuilder stringBuilder = new StringBuilder();
            for(Character x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) stringBuilder.append(stack.pop());
                else stringBuilder.append(x);
            }
            System.out.println(stringBuilder);
        }
    }
}
