package string_solve;

import java.util.Scanner;

/**
 * 가장 짧은 문자거리
 *
 * 설명: 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 *
 * 조건:
 * 1. 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 2. 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력:
 * - 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 *
 * 예제:
 * 입력:
 *  teachermode e
 *
 * 출력:
 *   1 0 1 2 1 0 1 2 2 1 0
 */
public class B1_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);

    }

}
