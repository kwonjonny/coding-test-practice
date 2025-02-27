package java_알고리즘_문제풀이_입문_코딩테스트_대비.문자열;

/**
 * 3. 문장 속 단어
 * 설명
 * <p>
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * <p>
 * 문장속의 각 단어는 공백으로 구분됩니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
 * <p>
 * 단어를 답으로 합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    it is time to study
 * 예시 출력 1
 * <p>
 * study
 */

import java.util.*;

public class C_문장속_단어3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String answer = solution(str);
        System.out.println(answer);
    }
    public static String solution(String str) {
        int max = 0;
        String answer = "";
        String[] array = str.split(" ");
        for(String x : array) {
            if(x.length() > max) {
                max = x.length();
                answer = x;
            }
        }
        return answer;
    }
}
