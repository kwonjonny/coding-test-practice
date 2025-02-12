package z_baekjoon.bronze;

import java.util.Scanner;

/**
 * 팰린드롬인지 확인하기 성공
 *
 * 문제
 * 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
 *
 * 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
 *
 * level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
 *
 * 입력
 * 첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.
 *
 * 출력
 * 첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.
 *
 * 예제 입력
 * level
 *
 * 예제 출력
 * 1
 */
public class Bronze3_10988 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }

    public static Integer solution(String str) {
        str = str.toLowerCase();

        String reverse = new StringBuilder(str.toLowerCase()).reverse().toString();
        if(reverse.equals(str)) {
            return 1;
        }
        return 0;
    }

    /**
     * 재 복습: 2024-12-20
     */
    public static class Bronze3_10988_1 {
        public static void main(String[] args) {
            Bronze3_10988_1 bronze3109881 = new Bronze3_10988_1();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            System.out.println(bronze3109881.solution(str));
        }
        public Integer solution(String str) {
            str = str.toLowerCase();
            String reverseString = new StringBuilder(str).reverse().toString();
            if(reverseString.equals(str)) {
                return 1;
            }
            return 0;
        }
    }
}
