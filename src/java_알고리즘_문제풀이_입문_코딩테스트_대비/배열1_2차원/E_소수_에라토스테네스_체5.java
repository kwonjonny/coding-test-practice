package java_알고리즘_문제풀이_입문_코딩테스트_대비.배열1_2차원;

/**
 * 5. 소수(에라토스테네스 체)
 * 설명
 * <p>
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * <p>
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 줄에 소수의 개수를 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    20
 * 예시 출력 1
 * <p>
 * 8
 */

import java.util.*;

public class E_소수_에라토스테네스_체5 {
    
    public static class E_소수_에라토스테네스_체5_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            solution(N);
        }
        public static void solution(int N) {
            int[] array = new int[N + 1];
            int cnt = 0;
            for(int i = 2; i < N; i++) {
                if(array[i] == 0) {
                cnt++;
                    for(int j = i * i; j < N; j = j + i) {
                        array[j] = 1;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
