package z_programmers.기초;

import java.util.*;

/**
 * 문제 설명
 * 알파벳으로 이루어진 문자열 myString이 주어집니다. 모든 알파벳을 소문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * 1 ≤ myString의 길이 ≤ 100,000
 * myString은 알파벳으로 이루어진 문자열입니다.
 *
 * 입출력 예
 * myString	        result
 * "aBcDeFg"	    "abcdefg"
 * "aaa"	        "aaa"
 */
public class 소문자로_바꾸기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String answer = solution(str);
        System.out.println(answer);
    }
    public static String solution(String str) {
        String answer = "";
        for(Character x : str.toCharArray()) {
            answer += Character.toLowerCase(x);
        }
        return answer;
    }
}
