package z_programmers.입문;

import java.util.*;

/**
 * 문제 설명
 * 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 0 < my_string 길이 < 100
 * 입출력 예
 * my_string	result
 * "Bcad"	    "abcd"
 * "heLLo"	    "ehllo"
 * "Python"	    "hnopty"
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * "Bcad"를 모두 소문자로 바꾸면 "bcad"이고 이를 알파벳 순으로 정렬하면 "abcd"입니다.
 *
 * 입출력 예 #2
 * "heLLo"를 모두 소문자로 바꾸면 "hello"이고 이를 알파벳 순으로 정렬하면 "ehllo"입니다.
 *
 * 입출력 예 #3
 * "Python"를 모두 소문자로 바꾸면 "python"이고 이를 알파벳 순으로 정렬하면 "hnopty"입니다.
 */
public class 문자열_정렬하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String answer = solution(str);
        System.out.println(answer);
    }
    public static String solution(String str) {
        String answer = "";
        str = str.toLowerCase();
        char[] strArray = str.toCharArray();
        Arrays.sort(strArray);
        for(char x : strArray) {
            answer += x;
        }
        return answer;
    }
}
