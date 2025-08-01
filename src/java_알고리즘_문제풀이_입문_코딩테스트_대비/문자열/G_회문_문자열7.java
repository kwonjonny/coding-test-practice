package java_알고리즘_문제풀이_입문_코딩테스트_대비.문자열;

/**
 * 7. 회문 문자열
 * 설명
 * <p>
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 * <p>
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * <p>
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    gooG
 * 예시 출력 1
 * <p>
 * YES
 */
import java.util.*;

public class G_회문_문자열7 {

    /**
     * 재 복습: 2025-07-26
     */
    public static class G_회문_문자열7_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            solution(str);
        }
        public static void solution(String str) {
            str = str.toLowerCase();
            String reverse = new StringBuilder(str).reverse().toString();
            if (reverse.equals(str)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String answer = solution(str);
        System.out.println(answer);
    }
    public static String solution(String str) {
        StringBuilder ret = new StringBuilder();
        str = str.toLowerCase();
        if(str.equals(new StringBuilder(str).reverse().toString())) ret.append("YES");
        else ret.append("NO");
        return ret.toString();
    }
}
