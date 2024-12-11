package string_solve;

import java.util.Scanner;

/**
 * 문자열 압축
 *
 * 설명: 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 *
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 *
 * 단 반복횟수가 1인 경우 생략합니다.
 *
 * 조건:
 * 1. 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력:
 * - 첫 줄에 압축된 문자열을 출력한다.
 *
 * 예제:
 * 입력:
 *  KKHSSSSSSSE
 *
 * 출력:
 *   K2HS7E
 */
public class B2_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String solution = solution(str);
        System.out.println(solution);
    }

    public static String solution(String str) {
        Integer count = 1;
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            if(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                stringBuilder.append(str.charAt(i));
                if(count > 1) {
                   stringBuilder.append(count);
                }
                count = 1;
            }
        }
        return stringBuilder.toString();
    }

    /**
     * 재 복습: 2024-12-11
     */
    public static class B2String1 {
        public static void main(String[] args) {
            B2String1 b2String1 = new B2String1();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String solution = b2String1.solution(str);
            System.out.println(solution);
        }

        public String solution(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            Integer count = 1;

            for(int i = 0; i < str.length(); i++) {
                if(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                } else {
                    stringBuilder.append(str.charAt(i));
                    if(count > 1) {
                        stringBuilder.append(count);
                    }
                    count = 1;
                }
            }
            return stringBuilder.toString();
        }
    }
}
