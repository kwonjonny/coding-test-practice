package java_알고리즘_문제풀이_입문_코딩테스트_대비.문자열;

/**
 * 1. 문자 찾기
 * 설명
 * <p>
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * <p>
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 * <p>
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 줄에 해당 문자의 개수를 출력한다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     Computercooler
     c
 * 예시 출력 1
 * <p>
 * 2
 */
import java.util.*;

public class A_문자_찾기1 {

    /**
     * 재 복습: 2025-04-29
     */
    public static class A_문자찾기1_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            solution(str, c);
        }
        public static void solution(String str, char c) {
            char t = Character.toLowerCase(c);
            int cnt = 0;
            for(char x : str.toCharArray()) {
                char y = Character.toLowerCase(x);
                if(y == t) cnt++;
            }
            System.out.println(cnt);
        }
    }


    /**
     * 재 복습: 2025-03-04
     */
    public static class A_문자_찾기1_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            int answer = solution(str, c);
            System.out.println(answer);
        }
        public static int solution(String str, char c) {
            str = str.toUpperCase();
            c = Character.toUpperCase(c);
            int answer = 0;
            for(int i = 0; i < str.length(); i++) {
                if(c == str.charAt(i)) answer++;
            }
            return answer;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);
        int answer = solution(str, c);
        System.out.println(answer);
    }
    public static int solution(String str, char c) {
        int cnt = 0;
        c = Character.toLowerCase(c);
        str = str.toLowerCase();
        for(char x : str.toCharArray()) {
            if(x == c) cnt++;
        }
        return cnt;
    }
}
