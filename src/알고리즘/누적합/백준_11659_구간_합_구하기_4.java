package 알고리즘.누적합;
import java.util.*;

/**
 * 구간 합 구하기 4 성공
 *
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	256 MB	145526	59738	43462	38.449%
 * 문제
 * 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
 *
 * 출력
 * 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.
 *
 * 제한
 * 1 ≤ N ≤ 100,000
 * 1 ≤ M ≤ 100,000
 * 1 ≤ i ≤ j ≤ N
 * 예제 입력 1
 * 5 3
 * 5 4 3 2 1
 * 1 3
 * 2 4
 * 5 5
 * 예제 출력 1
 * 12
 * 9
 * 1
 * 출처
 * 문제를 만든 사람: baekjoon
 * 데이터를 추가한 사람: djm03178
 * 알고리즘 분류
 * 누적 합
 */
public class 백준_11659_구간_합_구하기_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] T = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            T[i] = scan.nextInt();
        }

        int[] prefixSum = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + T[i];
        }

        for(int i = 0; i < K; i++) {
            int P = scan.nextInt();
            int L = scan.nextInt();
            int currentSum = prefixSum[L] - prefixSum[P - 1];
            System.out.println(currentSum);
        }
    }
}
