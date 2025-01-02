package z_baekjoon.bronze;

import java.util.Scanner;

/**
 * 대소문자 바꾸기
 *
 * 시간 제한	메모리 제한	제출	    정답	        맞힌 사람	정답 비율
 * 1 초	    128 MB	    36533	27140	    24586	    75.396%
 * 문제
 * 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
 *
 * 출력
 * 첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.
 *
 * 예제 입력 1
 * WrongAnswer
 *
 * 예제 출력 1
 * wRONGaNSWER
 */
public class Bronze5_2744 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }
    public static String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for(Character x : str.toCharArray()) {
            if(Character.isLowerCase(x)) stringBuilder.append(Character.toUpperCase(x));
            else stringBuilder.append(Character.toLowerCase(x));
        }
        return stringBuilder.toString();
    }
}
