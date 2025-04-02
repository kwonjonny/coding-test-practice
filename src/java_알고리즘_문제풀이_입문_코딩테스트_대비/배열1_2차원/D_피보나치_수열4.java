package java_알고리즘_문제풀이_입문_코딩테스트_대비.배열1_2차원;

/**
 * 4. 피보나치 수열
 * 설명
 * <p>
 * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * <p>
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 줄에 피보나치 수열을 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    10
 * 예시 출력 1
 * <p>
 * 1 1 2 3 5 8 13 21 34 55
 */

import java.util.*;

public class D_피보나치_수열4 {

    /**
     * 재 복습: 2025-04-02
     */
    public static class D_피보나치_수열4_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            solution(N);
        }
        public static void solution(int N) {
            List<Integer> answer = new ArrayList<>();
            int prev = 0;
            int next = 1;
            for(int i = 0; i < N; i++) {
                answer.add(next);
                int temp = next;
                next = next + prev;
                prev = temp;
            }
            for(int x : answer) {
                System.out.print(x + " ");
            }
        }
    }

    /**
     * 재 복습: 2025-03-06
     */
    public static class D_피보나치_수열4_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[] answer = solution(N);
            for(int x : answer) {
                System.out.print(x + " ");
            }
        }
        public static int[] solution(int N) {
            List<Integer> answer = new ArrayList<>();
            int next = 1;
            int prev = 0;
            for(int i = 0; i < N; i++) {
                answer.add(next);
                int temp = next;
                next = next + prev;
                prev = temp;
            }
            return answer.stream().mapToInt(e -> e).toArray();
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] answer = solution(N);
        for(int x : answer) {
            System.out.print(x + " ");
        }
    }
    public static int[] solution(int N) {
        List<Integer> answer = new ArrayList<>();
        int prev = 0;
        int next = 1;
        for(int i = 0; i < N; i++) {
            answer.add(next);
            int temp = next;
            next = prev + next;
            prev = temp;
        }
        return answer.stream().mapToInt(e -> e).toArray();
    }
}
