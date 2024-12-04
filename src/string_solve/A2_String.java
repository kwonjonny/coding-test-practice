package string_solve;

import java.util.Scanner;

/**
 * 설명: 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환항여 출력하는 프로그램을 작성하세요
 *
 * 조건:
 * 1. 첫 줄에 문자열이 입력된다.
 * 2. 문자열의 길이는 100자를 넘지 않습니다.
 * 3. 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 입력:
 * - 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 *
 * 예제:
 * 입력:
 *   StuDY
 * 출력:
 *   sTUdy
 */
public class A2_String {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String solution = solution(str);
        System.out.println(solution);
    }

    public static String solution(String str) {
        String scan = "";
        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) {
                scan += Character.toUpperCase(x);
            } else {
                scan += Character.toLowerCase(x);
            }
        }
        return scan;
    }


    /**
     * 재 복습: 2024-12-04
     * 다른 방법으로도 풀어보자 StringBuilder 사용
     */
    public static class A2String {
        public static void main(String [] args) {
            A2String a2String = new A2String();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String solution = a2String.solution(str);
            System.out.println(solution);
        }

        public String solution(final String str) {
            StringBuilder stringBuilder = new StringBuilder();

            for(char x : str.toCharArray()) {
                if(Character.isLowerCase(x)) {
                    stringBuilder.append(Character.toUpperCase(x));
                } else {
                    stringBuilder.append(Character.toLowerCase(x));
                }
            }
            return stringBuilder.toString();
        }
    }
}
