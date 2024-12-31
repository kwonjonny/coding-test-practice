package string_solve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 숫자만 추출
 *
 * 설명: 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 *
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 *
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 *
 * 조건:
 * 1. 첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * 출력:
 * - 첫 줄에 자연수를 출력합니다.
 *
 * 예제:
 * 입력:
 *  g0en2T0s8eSoft
 *
 * 출력:
 *   208
 */
public class A9_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        Integer solution = solution(str);
        System.out.println(solution);
    }

    public static Integer solution(String str) {
       StringBuilder stringBuilder = new StringBuilder();

       for(char x : str.toCharArray()) {
           if(Character.isDigit(x)) {
                stringBuilder.append(x);
           }
       }
       return Integer.parseInt(stringBuilder.toString());
    }

    /**
     * 2024-12-06 복습
     */
    public static class A9String1 {
        public static void main(String[] args) {
            A9String1 a9String1 = new A9String1();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            Integer solution = a9String1.solution(str);
            System.out.println(solution);
        }

        public Integer solution(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            for(char x : str.toCharArray()) {
                if(Character.isDigit(x)) {
                    stringBuilder.append(x);
                }
            }
            return Integer.parseInt(stringBuilder.toString());
        }
    }

    /**
     * 재 복습: 2024-12-11
     */
    public static class A9String {
        public static void main(String[] args) {
            A9String a9String = new A9String();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            Integer solution = a9String.solution(str);
            System.out.println(solution);
        }

        public Integer solution(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < str.length(); i++) {
                if(Character.isDigit(str.charAt(i))) {
                    stringBuilder.append(str.charAt(i));
                }
            }
            return Integer.parseInt(stringBuilder.toString());
        }
    }

    /**
     * 재 복습: 2024-12-15
     */
    public static class A9String2 {
        public static void main(String[] args) {
            A9String2 a9String2 = new A9String2();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            System.out.println(a9String2.solution(str));
        }
        public Integer solution(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            for(char x : str.toCharArray()) {
                if(Character.isDigit(x)) {
                    stringBuilder.append(x);
                }
            }
            return Integer.valueOf(stringBuilder.toString());
        }
    }

    /**
     * 재 복습: 2024-12-18
     */
    public static class A9String3 {
        public static void main(String[] args) {
            A9String3 a9String3 = new A9String3();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            System.out.println(a9String3.solution(str));
        }
        public Integer solution(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < str.length(); i++) {
                if(Character.isDigit(str.charAt(i))) {
                    stringBuilder.append(str.charAt(i));
                }
            }
            return Integer.parseInt(stringBuilder.toString());
        }
    }

    /**
     * 재 복습: 2024-12-25
     */
    public static class A9String4 {
        public static void main(String[] args) {
            A9String4 a9String4 = new A9String4();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            System.out.println(a9String4.solution(str));
        }
        public Integer solution(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            List<Character> list = new ArrayList<>();
            for(char x : str.toCharArray()) {
                if(Character.isDigit(x)) {
                    list.add(x);
                }
            }
            for(char x : list) {
                stringBuilder.append(x);
            }
            return Integer.parseInt(stringBuilder.toString());
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class A9String5 {
        public static void main(String[] args) {
            A9String5 a9String5 = new A9String5();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            a9String5.solution(str);
        }
        public void solution(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            for(Character x : str.toCharArray()) {
                if(Character.isDigit(x)) {
                    stringBuilder.append(x);
                }
            }
            System.out.println(Integer.parseInt(stringBuilder.toString()));
        }
    }
}
