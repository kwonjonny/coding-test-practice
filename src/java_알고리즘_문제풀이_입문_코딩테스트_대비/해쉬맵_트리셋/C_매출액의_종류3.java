package java_알고리즘_문제풀이_입문_코딩테스트_대비.해쉬맵_트리셋;

/**
 * 3. 매출액의 종류
 * 설명
 * <p>
 * 현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를
 * <p>
 * 각 구간별로 구하라고 했습니다.
 * <p>
 * 만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
 * <p>
 * 20 12 20 10 23 17 10
 * <p>
 * 각 연속 4일간의 구간의 매출종류는
 * <p>
 * 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
 * <p>
 * 두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
 * <p>
 * 세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
 * <p>
 * 네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
 * <p>
 * N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
 * <p>
 * 매출액의 종류를 출력하는 프로그램을 작성하세요.
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
 * 첫 줄에 각 구간의 매출액 종류를 순서대로 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    7 4
    20 12 20 10 23 17 10
 * 예시 출력 1
 * <p>
 * 3 4 4 3
 */

import java.util.*;

public class C_매출액의_종류3 {

    public static class C_매출액의_종류3_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) array[i] = scan.nextInt();
            solution(N, T, array);
        }
        public static void solution(int N, int T, int[] array) {
            Map<Integer, Integer> ret = new HashMap<>();
            List<Integer> answer = new ArrayList<>();
            for(int i = 0; i < T; i++) ret.put(array[i], ret.getOrDefault(array[i], 0) + 1);
            answer.add(ret.size());
            int lt = 0;
            for(int rt = T; rt < N; rt++) {
                ret.put(array[rt], ret.getOrDefault(array[rt], 0) + 1);
                ret.put(array[lt], ret.get(array[lt]) - 1);
                if(ret.get(array[lt]) == 0) ret.remove(array[lt]);
                lt++;
                answer.add(ret.size());
            }
            for(int x : answer) {
                System.out.print(x + " ");
            }
        }
    }
}
