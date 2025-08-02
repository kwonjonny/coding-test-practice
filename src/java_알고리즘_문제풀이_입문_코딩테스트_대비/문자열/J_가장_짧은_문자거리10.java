package java_알고리즘_문제풀이_입문_코딩테스트_대비.문자열;

/**
 * 10. 가장 짧은 문자거리
 * 설명
 * <p>
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * <p>
 * 문자열의 길이는 100을 넘지 않는다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    teachermode e
 * 예시 출력 1
 * <p>
 * 1 0 1 2 1 0 1 2 2 1 0
 */
import java.util.*;

public class J_가장_짧은_문자거리10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);
        int[] answer = solution(str, c);
        for(int x : answer) {
            System.out.print(x + " ");
        }
    }
    public static int[] solution(String str, char c) {
        int[] array = new int[str.length()];
        int p = 1000;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                p = 0;
                array[i] = p;
            }
            else {
                p++;
                array[i] = p;
            }
        }
        p = 1000;
        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == c) {
                p = 0;
                array[i] = p;
            }
            else {
                p++;
                array[i] = Math.min(array[i], p);
            }
        }

        return array;
    }
}
