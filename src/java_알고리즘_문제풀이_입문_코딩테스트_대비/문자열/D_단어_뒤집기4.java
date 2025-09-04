package java_알고리즘_문제풀이_입문_코딩테스트_대비.문자열;

/**
 * 4. 단어 뒤집기
 * 설명
 * <p>
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * <p>
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     3
     good
     Time
     Big
 * 예시 출력 1
 * <p>
 * doog
 * emiT
 * giB
 */
import java.util.*;

public class D_단어_뒤집기4 {

    public static class D_단어_뒤집기4_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            String[] array = new String[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.next();
            }
            solution(N, array);
        }
        public static void solution(int N, String[] array) {
            for(int i = 0; i < N; i++) {
                String reverse = new StringBuilder(array[i]).reverse().toString();
                System.out.println(reverse);
            }
        }
    }
}
