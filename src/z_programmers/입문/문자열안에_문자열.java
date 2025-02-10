package z_programmers.입문;

import java.util.*;

/**
 *문제 설명
 * 문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ str1의 길이 ≤ 100
 * 1 ≤ str2의 길이 ≤ 100
 * 문자열은 알파벳 대문자, 소문자, 숫자로 구성되어 있습니다.
 * 입출력 예
 * str1	str2	result
 * "ab6CDE443fgh22iJKlmn1o"	"6CD"	1
 * "ppprrrogrammers"	"pppp"	2
 * "AbcAbcA"	"AAA"	2
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * "ab6CDE443fgh22iJKlmn1o" str1에 str2가 존재하므로 1을 return합니다.
 * 입출력 예 #2
 *
 * "ppprrrogrammers" str1에 str2가 없으므로 2를 return합니다.
 * 입출력 예 #3
 *
 * "AbcAbcA" str1에 str2가 없으므로 2를 return합니다.
 */
public class 문자열안에_문자열 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        int answer = solution(str1, str2);
        System.out.println(answer);
    }
    public static int solution(String str1, String str2) {
        int answer = 2;
        if(str1.contains(str2)) return 1;
        return answer;
    }
}
