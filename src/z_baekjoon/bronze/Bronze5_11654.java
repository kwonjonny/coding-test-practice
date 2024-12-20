package z_baekjoon.bronze;

import java.util.Scanner;

/**
 * 문제: 아스키 코드
 * <p>
 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 * <p>
 * 입력
 * 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
 * <p>
 * 출력
 * 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
 * <p>
 * 예제 입력
 * A
 * <p>
 * 예제 출력
 * 65
 */
public class Bronze5_11654 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        System.out.println(solution(c));
    }

    public static Integer solution(char c) {
        return (int) c;
    }

    /**
     * 재 복습: 2024-12-20
     */
    public static class Bronze511654_1 {
        public static void main(String[] args) {
            Bronze511654_1 bronze5116541 = new Bronze511654_1();
            Scanner scan = new Scanner(System.in);
            char c = scan.next().charAt(0);
            System.out.println(bronze5116541.solution(c));
        }
        public Integer solution(char c) {
            return (int) c;
        }
    }
}
