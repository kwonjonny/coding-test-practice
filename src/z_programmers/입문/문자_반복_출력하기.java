package z_programmers.입문;

import java.util.Scanner;

/**
 * 문제 설명
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 2 ≤ my_string 길이 ≤ 5
 * 2 ≤ n ≤ 10
 * "my_string"은 영어 대소문자로 이루어져 있습니다.
 *
 * 입출력 예
 * my_string	n	result
 * "hello"	3	"hhheeellllllooo"
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * "hello"의 각 문자를 세 번씩 반복한 "hhheeellllllooo"를 return 합니다.
 */
public class 문자_반복_출력하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int N = scan.nextInt();
        String answer = solution(str, N);
        System.out.println(answer);
    }
    public static String solution(String str, int n) {
        String answer = "";
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < n; j++) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }
}
