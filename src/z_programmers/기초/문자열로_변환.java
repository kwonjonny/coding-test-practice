package z_programmers.기초;

import java.util.*;

/**
 * 문제 설명
 * 정수 n이 주어질 때, n을 문자열로 변환하여 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 10000
 * 입출력 예
 * n	result
 * 123	"123"
 * 2573	"2573"
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 123을 문자열로 변환한 "123"을 return합니다.
 * 입출력 예 #2
 *
 * 2573을 문자열로 변환한 "2573"을 return합니다.
 */
public class 문자열로_변환 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String answer = solution(n);
        System.out.println(answer);
    }
    public static String solution(int n) {
        return String.valueOf(n);
    }
}
