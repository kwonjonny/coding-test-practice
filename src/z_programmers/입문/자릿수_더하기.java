package z_programmers.입문;

import java.util.*;

/**
 * 문제 설명
 * 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
 *
 * 제한사항
 * 0 ≤ n ≤ 1,000,000
 * 입출력 예
 * n	result
 * 1234	10
 * 930211	16
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 1 + 2 + 3 + 4 = 10을 return합니다.
 * 입출력 예 #2
 *
 * 9 + 3 + 0 + 2 + 1 + 1 = 16을 return합니다.
 */
public class 자릿수_더하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int order = scan.nextInt();
        int answer = solution(order);
        System.out.println(answer);
    }
    public static int solution(int order) {
        int answer = 0;
        String stringOrder = String.valueOf(order);
        for(int i = 0; i < stringOrder.length(); i++) {
            char T = stringOrder.charAt(i);
            answer = answer + Character.getNumericValue(T);
        }
        return answer;
    }
}
