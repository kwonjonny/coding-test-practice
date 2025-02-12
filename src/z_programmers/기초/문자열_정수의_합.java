package z_programmers.기초;

import java.util.*;

/**
 * 문제 설명
 * 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 3 ≤ num_str ≤ 100
 *
 * 입출력 예
 * num_str	    result
 * "123456789"	45
 * "1000000"	1
 * 입출력 예 설명
 * 입출력 예 #1
 * 문자열 안의 모든 숫자를 더하면 45가 됩니다.
 *
 * 입출력 예 #2
 * 문자열 안의 모든 숫자를 더하면 1이 됩니다.
 */
public class 문자열_정수의_합 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int answer = solution(str);
        System.out.println(answer);
    }
    public static int solution(String str) {
        int answer = 0;
        for(Character x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                int X = (x - '0');
                answer += X;
            }
        }
        return answer;
    }
}
