package java_알고리즘_문제풀이_입문_코딩테스트_대비.투포인터_슬라이딩윈도우;

/**
 * 3. 최대 매출
 * 설명
 * <p>
 * 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
 * <p>
 * 만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
 * <p>
 * 12 1511 20 2510 20 19 13 15
 * <p>
 * 연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
 * <p>
 * 여러분이 현수를 도와주세요.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
 * <p>
 * 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 줄에 최대 매출액을 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     10 3
     12 15 11 20 25 10 20 19 13 15
 * 예시 출력 1
 * <p>
 * 56
 */

import java.util.*;

public class C_최대_매출3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        int answer = solution(N, T, array);
        System.out.println(answer);
    }
    public static int solution(int N, int T, int[] array) {
        int currentSum = 0;
        for(int i = 0; i < T; i++) {
            currentSum += array[i];
        }
        int max = currentSum;
        for(int right = T; right < N; right++) {
            currentSum += array[right] - array[right - T];
            if(currentSum > max) max = currentSum;
        }
        return max;
    }
}
