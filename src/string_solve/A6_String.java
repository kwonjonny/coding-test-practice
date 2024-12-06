package string_solve;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * 중복 문자 제거
 *
 * 설명: 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 *
 * 조건:
 * 1. 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력:
 * - 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 *
 * 예제:
 * 입력:
 *  ksekkset
 *
 * 출력:
 *   kset
 */
public class A6_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String solution = solution(str);
        System.out.println(solution);
    }

    public static String solution(String str) {
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();

        for(char x : str.toCharArray()) {
            char t = Character.toLowerCase(x);
            linkedHashSet.add(t);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(char x : linkedHashSet) {
            stringBuilder.append(x);
        }
        return stringBuilder.toString();
    }

    /**
     * 2024-12-05 복습
     */
    public static class A6String {

        public static void main(String[] args) {
            A6String a2String = new A6String();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String solution = a2String.solution(str);
            System.out.println(solution);
        }


        public String solution(String str) {
            final LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();

            for(char x : str.toCharArray()) {
                linkedHashSet.add(x);
            }

            StringBuilder stringBuilder = new StringBuilder();
            for(char x: linkedHashSet) {
                stringBuilder.append(x);
            }
            return stringBuilder.toString();
        }
    }

    /**
     * 2024-12-06 복습
     */
    public static class A6String1 {
        public static void main(String[] args) {
            A6String1 a6String1 = new A6String1();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String solution = a6String1.solution(str);
            System.out.println(solution);
        }

        public String solution(String str) {
            LinkedHashSet<Character> hashSet = new LinkedHashSet<>();

            for(char x : str.toCharArray()) {
                hashSet.add(x);
            }
            return String.valueOf(hashSet);
        }
    }
}
