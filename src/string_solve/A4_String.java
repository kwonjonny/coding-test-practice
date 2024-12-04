package string_solve;


import java.util.Scanner;

/**
 * 문자 뒤집기
 *
 * 설명: N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 * 조건:
 * 1. 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 2. 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력:
 * - N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 *
 * 예제:
 * 입력:
 *   3
 *   good
 *   Time
 *   Big
 * 출력:
 *   doog
 *   emiT
 *   giB
 */
public class A4_String {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        Integer scanner = scan.nextInt();
        String[] strings = new String[scanner];
        for(int i=0; i<strings.length; i++) {
            strings[i] = scan.next();
        }
        solution(strings);
    }

    public static void solution(String[] strings) {
        for(String str : strings) {
            StringBuilder stringBuilder = new StringBuilder(str).reverse();
            System.out.println(stringBuilder);
        }
    }
}
