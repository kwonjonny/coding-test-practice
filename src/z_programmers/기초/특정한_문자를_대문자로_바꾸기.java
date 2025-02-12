package z_programmers.기초;

import java.util.*;

/**
 * 문제 설명
 * 영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때,
 *
 * my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 1,000
 *
 * 입출력 예
 * my_string	    alp	    result
 * "programmers"	"p"	    "Programmers"
 * "lowercase"	    "x"	    "lowercase"
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 예제 1번의 my_string은 "programmers"이고 alp가 "p"이므로 my_string에 모든 p를 대문자인 P로 바꾼 문자열 "Programmers"를 return 합니다.
 * 
 * 입출력 예 #2
 * 예제 2번의 alp는 "x"이고 my_string에 x는 없습니다. 따라서 "lowercase"를 return 합니다.
 */
public class 특정한_문자를_대문자로_바꾸기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String c = scan.next();
        String answer = solution(str, c);
        System.out.println(answer);
    }
    public static String solution(String str, String c) {
        StringBuilder stringBuilder = new StringBuilder();
        for(Character x : str.toCharArray()) {
            if(String.valueOf(x).equals(c)) stringBuilder.append(Character.toUpperCase(x));
            else stringBuilder.append(x);
        }
        return stringBuilder.toString();
    }
}
