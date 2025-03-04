package java_알고리즘_문제풀이_입문_코딩테스트_대비.문자열;

/**
 * 11. 문자열 압축
 * 설명
 * <p>
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 * <p>
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * <p>
 * 단 반복횟수가 1인 경우 생략합니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 줄에 압축된 문자열을 출력한다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    KKHSSSSSSSE
 * 예시 출력 1
 * <p>
 * K2HS7E
 * 예시 입력 2
 * <p>
    KSTTTSEEKFKKKDJJGG
 * 예시 출력 2
 * <p>
 * KST3SE2KFK3DJ2G2
 */
import java.util.*;

public class K_문자열_압축11 {
    
    /**
     * 재 복습: 2025-03-04
     */
    public static class K_문자열_압축11_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String answer = solution(str);
            System.out.println(answer);
        }
        public static String solution(String str) {
            StringBuilder ret = new StringBuilder();

            int cnt = 1;
            for(int i = 0; i < str.length() - 1; i++) {
                if(str.charAt(i) == str.charAt(i + 1)) {
                    cnt++;
                }
                else {
                    ret.append(str.charAt(i));
                    if(cnt > 1) {
                        ret.append(cnt);
                        cnt = 1;
                    }
                }
            }
            ret.append(str.charAt(str.length() - 1));
            if(cnt > 1) ret.append(cnt);
            return ret.toString();
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String answer = solution(str);
        System.out.println(answer);
    }
    public static String solution(String str) {
        int cnt = 1;
        StringBuilder ret = new StringBuilder();
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                ret.append(str.charAt(i));
                if(cnt > 1) ret.append(cnt);
                cnt = 1;
            }
        }

        ret.append(str.charAt(str.length() - 1));
        if (cnt > 1) ret.append(cnt);

        return ret.toString();
    }
}
