package string_solve;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 유효한 팰린드롬
 *
 * 설명: 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 *
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 *
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
 *
 * 알파벳 이외의 문자들의 무시합니다.
 *
 * 조건:
 * 1. 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 *
 * 출력:
 * - 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
 *
 * 예제:
 * 입력:
 *  found7, time: study; Yduts; emit, 7Dnuof
 *
 * 출력:
 *   YES
 */
public class A8_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String solution = solution(str);
        System.out.println(solution);
    }

    public static String solution(String str) {
        List<Character> list = new ArrayList<>();

        for(char x : str.toCharArray()) {
            if(Character.isLetter(x)) {
                list.add(Character.toLowerCase(x));
            }
        }

        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return "NO";
            }
            left++;
            right--;
        }
        return "YES";
    }

    /**
     * 2024-12-06 복습
     */
    public static class A8String {
        public static void main(String[] args) {
            A8String a8String = new A8String();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            String solution = a8String.solution(str);
            System.out.println(solution);
        }

        public String solution(String str) {
            List<Character> list = new LinkedList<>();
            for(char x : str.toCharArray()) {
                if(Character.isLetter(x)) {
                    list.add(Character.toUpperCase(x));
                }
            }

            Integer left = 0;
            Integer right = list.size() - 1;

            while (left > right) {
                if(!list.get(left).equals(list.get(right))) {
                    return "NO";
                }
                left++;
                right--;
            }
            return "YES";
        }
    }

    /**
     * 2024-12-06 복습
     */
    public static class A8String1 {
        public static void main(String[] args) {
            A8String1 a8String1 = new A8String1();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            String solution = a8String1.solution(str);
            System.out.println(solution);
        }

        public String solution(String str) {
            LinkedList<Character> linkedList = new LinkedList<>();
            for(char x : str.toCharArray()) {
                if(Character.isLetter(x)) {
                    linkedList.add(x);
                }
            }

            Integer left = 0;
            Integer right = linkedList.size() - 1;

            while (left > right) {
                if(!linkedList.get(left).equals(linkedList.get(right))) {
                    return "NO";
                }
                left ++ ;
                right -- ;
            }
            return "YES";
        }
    }
}
