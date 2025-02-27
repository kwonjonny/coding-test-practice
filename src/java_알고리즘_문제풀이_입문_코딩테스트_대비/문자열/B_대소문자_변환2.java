package java_알고리즘_문제풀이_입문_코딩테스트_대비.문자열;

/**
 * 2. 대소문자 변환
 * 설명
 * <p>
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 * <p>
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    StuDY
 * 예시 출력 1
 * <p>
 * sTUdy
 */
import java.util.*;

public class B_대소문자_변환2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String answer = solution(str);
        System.out.println(answer);
    }
    public static String solution(String str) {
        StringBuilder ret = new StringBuilder();
        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) ret.append(Character.toUpperCase(x));
            else if(Character.isUpperCase(x)) ret.append(Character.toLowerCase(x));
        }
        return ret.toString();
    }
}
