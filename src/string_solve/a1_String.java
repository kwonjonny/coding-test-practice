package string_solve;

import java.util.Scanner;

/**
 * 설명: 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지
 * <p>
 *  알아내는 프로그램을 작성하시오.
 * </p>
 * 대소문자를 구분하지 않습니다. 문자열의 길이는 100을 넘지 않습니다.
 *
 *
 * <p>
 * 입력: 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 * </p>
 *
 * <p>
 * 출력: 첫 줄에 해당 문자의 개수를 출력한다.
 * </p>
 *
 * EX: ComputerCooler
 * EX: c
 */
public class a1_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);
        Integer sol = solution(str, c);
        System.out.println(sol);
    }

    public static Integer solution(final String str,
                                   char c) {
        Integer solution = 0;
        String lower = str.toLowerCase();
        for(int i=0; i<str.length(); i++) {
            if(lower.charAt(i) == c) {
                solution++;
            }
        }
        return solution;
    }
}
