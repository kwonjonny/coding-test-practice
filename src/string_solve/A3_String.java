package string_solve;

import java.util.Scanner;

/**
 * 설명: 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 *
 * 조건:
 * 1. 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다.
 * 2. 문장은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력:
 * - 첫 줄에 가장 긴 단어를 출력한다.
 *  가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
 *
 * 예제:
 * 입력:
 *   it is time to study
 * 출력:
 *   study
 */
public class A3_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String solution = solution(str);
        System.out.println(solution);
    }

    public static String solution(String str) {
        String answer = "";
        Integer answerCount = Integer.MIN_VALUE;

        String[] strArray = str.split(" ");

        for(String s : strArray) {
            Integer len = s.length();
            if(len > answerCount) {
                answerCount = len;
                answer = s;
            }
        }
        return answer;
    }
}
