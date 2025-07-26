package java_알고리즘_문제풀이_입문_코딩테스트_대비.문자열;

/**
 * 9. 숫자만 추출
 * 설명
 * <p>
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 * <p>
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 * <p>
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 줄에 자연수를 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    g0en2T0s8eSoft
 * 예시 출력 1
 * <p>
 * 208
 */
import java.util.*;

public class I_숫자만_추출9 {

    /**
     * 재 복습: 2025-07-26
     */
    public static class I_숫자만_추출9_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            solution(str);
        }
        public static void solution(String str) {
            StringBuilder ret = new StringBuilder();
            for(int i = 0; i < str.length(); i++) {
                char findChar = str.charAt(i);
                if(Character.isDigit(findChar)) ret.append(findChar);
            }
            System.out.println(Integer.valueOf(ret.toString()));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int answer = solution(str);
        System.out.println(answer);
    }
    public static int solution(String str) {
        StringBuilder ret = new StringBuilder();
        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) ret.append(x);
        }
        return Integer.parseInt(ret.toString());
    }
}
