package z_programmers.입문;

import java.util.*;

/**
 * 문제 설명
 * 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 1,000
 * my_string은 영어 대문자와 소문자로만 구성되어 있습니다.
 * 
 * 입출력 예
 * my_string	    result
 * "cccCCC"	        "CCCccc"
 * "abCdEfghIJ"	    "ABcDeFGHij"
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 소문자는 대문자로 대문자는 소문자로 바꾼 "CCCccc"를 return합니다.
 *
 * 입출력 예 #2
 * 소문자는 대문자로 대문자는 소문자로 바꾼 "ABcDeFGHij"를 return합니다.
 */
public class 대문자와_소문자 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String answer = solution(str);
        System.out.println(answer);
    }
    public static String solution(String str) {
        String answer = "";
        for(Character x : str.toCharArray()) {
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        return answer;
    }
}
