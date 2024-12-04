package string_solve;

import java.util.Scanner;
import java.util.Stack;

/**
 * 특정 문자 뒤집기
 *
 * 설명: 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 * 조건:
 * 1. 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 * 출력:
 * - 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 *
 * 예제:
 * 입력:
 *  a#b!GE*T@S
 *
 * 출력:
 *   S#T!EG*b@a
 */
public class A5_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String solution = solution(str);
        System.out.println(solution);
    }

    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                stack.push(c);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                stringBuilder.append(stack.pop());
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
