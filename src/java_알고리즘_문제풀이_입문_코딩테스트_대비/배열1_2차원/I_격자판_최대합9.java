package java_알고리즘_문제풀이_입문_코딩테스트_대비.배열1_2차원;

/**
 * 9. 격자판 최대합
 * 설명
 * <p>
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 * <p>
 * 10 13 10 12 15
 * 12 39 30 23 11
 * 11 25 50 53 15
 * 19 27 29 37 27
 * 19 13 30 13 19
 * <p>
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * <p>
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 최대합을 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     5
     10 13 10 12 15
     12 39 30 23 11
     11 25 50 53 15
     19 27 29 37 27
     19 13 30 13 19
 * 예시 출력 1
 * <p>
 * 155
 */

import java.util.*;

public class I_격자판_최대합9 {

    /**
     * 재 복습: 2025-07-29
     */
    public static class I_격자판_최대합9_1 {
        public static void solution(int N, int[][] array) {
            int answer = 0;
            int sum1, sum2;
            for(int i = 0; i < N; i++) {
                sum1 = 0;
                sum2 = 0;
                for(int j = 0; j < N; j++) {
                    sum1 += array[i][j];
                    sum2 += array[j][i];
                }
                answer = Math.max(answer, sum1);
                answer = Math.max(answer, sum2);
            }
            sum1 = 0;
            sum2 = 0;
            for(int i = 0; i < N; i++) {
               sum1 += array[i][i];
               sum2 += array[i][N - 1 - i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
            System.out.println(answer);
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[][] array = new int[N][N];
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    array[i][j] = scan.nextInt();
                }
            }
            solution(N, array);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] array = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        int answer = solution(N, array);
        System.out.println(answer);
    }

    public static int solution(int N, int[][] array) {
        int max = 0;
        int p1, p2;
        for (int i = 0; i < N; i++) {
            p1 = 0;
            p2 = 0;
            for (int j = 0; j < N; j++) {
                p1 += array[i][j];
                p2 += array[j][i];
            }
            max = Math.max(max, p1);
            max = Math.max(max, p2);
        };

        p1 = 0;
        p2 = 0;
        for(int i = 0; i < N; i++) {
            p1 += array[i][i];
            p2 += array[i][N - 1 - i];
        }
        max = Math.max(max, p1);
        max = Math.max(max, p2);
        return max;
    }
}
