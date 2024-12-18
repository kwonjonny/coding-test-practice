package string_solve;

import java.util.Scanner;

/**
 * 회문 문자열
 *
 * 설명: 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 *
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 *
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 *
 * 조건:
 * 1. 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 *
 * 출력:
 * - 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 *
 * 예제:
 * 입력:
 *  gooG
 *
 * 출력:
 *   YES
 */
public class A7_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String solution = solution(str);
        System.out.println(solution);
    }

    public static String solution(String str) {
        StringBuilder lowerCaseStringBuilder = new StringBuilder();

        for(char x : str.toCharArray()) {
            char c = Character.toLowerCase(x);
            lowerCaseStringBuilder.append(c);
        }

        String lowerCase = str.toLowerCase();
        String lowerCaseBuilder = lowerCaseStringBuilder.toString();
        return lowerCase.equals(lowerCaseBuilder) ?  "YES" : "NO";
    }

    /**
     * 2024-12-05 복습
     */
    public static class A7String {
        public static void main(String[] args) {
            A7String a7String = new A7String();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String solution = a7String.solution(str);
            System.out.println(solution);
        }


        public String solution(String str) {
            String reverse = new StringBuilder(str.toLowerCase()).reverse().toString();
            String lowerCase = str.toLowerCase();
            return reverse.equals(lowerCase) ? "YES" : "NO";
        }
    }

    /**
     * 2024-12-06 복습
     */
    public static class A7String1 {
        public static void main(String[] args) {
            A7String1 a7String =  new A7String1();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String solution = a7String.solution(str);
            System.out.println(solution);
        }

        public String solution(String str) {
            String reverse = new StringBuilder(str.toUpperCase()).reverse().toString();
            String upperCase = str.toUpperCase();
            return  reverse.equals(upperCase) ? "YES" : "NO";
        }
    }

    /**
     * 재 복습: 2024-12-11
     */
    public static class A7String2 {
        public static void main(String[] args) {
            A7String2 a7String2 = new A7String2();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String solution = a7String2.solution(str);
            System.out.println(solution);
        }

        public String solution(String str) {
            String solution = "NO";
            str = str.toUpperCase();
            String reverse = new StringBuilder(str).reverse().toString();
            if(str.equals(reverse)) {
                solution = "YES";
            }
            return solution;
        }
    }

    /**
     * 재 복습: 2024-12-15
     */
    public static class A7String3 {
        public static void main(String[] args) {
            A7String3 a7String3 = new A7String3();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            System.out.println(a7String3.solution(str));
        }

        public String solution(String str) {
            str = str.toLowerCase();
            String reverseString = new StringBuilder(str).reverse().toString();
            if(str.equals(reverseString)) {
                return "YES";
            }
            return "NO";
        }
    }

    /**
     * 재 복습: 2024-12-18
     */
    public static class A7String4 {
        public static void main(String[] args) {
            A7String4 a7String4 = new A7String4();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            System.out.println(a7String4.solution(str));
        }
        public String solution(String str) {
            str = str.toUpperCase();
            String reverseStr = new StringBuilder(str).reverse().toString();
            if(reverseStr.equals(str)) {
                return "YES";
            }
            return "NO";
        }
    }
}

