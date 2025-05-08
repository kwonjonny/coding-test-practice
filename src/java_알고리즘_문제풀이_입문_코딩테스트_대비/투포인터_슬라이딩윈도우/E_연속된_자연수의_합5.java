package java_알고리즘_문제풀이_입문_코딩테스트_대비.투포인터_슬라이딩윈도우;

/**
 * 5. 연속된 자연수의 합
 * 설명
 * <p>
 * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
 * <p>
 * 만약 N=15이면
 * <p>
 * 7+8=15
 * <p>
 * 4+5+6=15
 * <p>
 * 1+2+3+4+5=15
 * <p>
 * 와 같이 총 3가지의 경우가 존재한다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 줄에 총 경우수를 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    15
 * 예시 출력 1
 * <p>
 * 3
 */

import java.util.*;

public class E_연속된_자연수의_합5 {

    /**
     * 재 복습: 2025-05-08
     */
    public static class E_연속된_자연수의_합5_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            solution(N);
        }
        public static void solution(int N) {
            int left = 0;
            int sum = 0;
            int answer = 0;
            for(int i = 1; i < N; i++) {
                sum += i;
                if(sum == N) answer++;
                while(sum > N) {
                    sum -= left++;
                    if(sum == N) answer++;
                }
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-03-05
     */
    public static class E_연속된_자연수의_합5_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int answer = solution(N);
            System.out.println(answer);
        }
        public static int solution(int N) {
            int left = 1;
            int currentSum = 0;
            int answer = 0;
            for(int right = 1; right < N; right++) {
                currentSum += right;
                if(N == currentSum) answer++;
                while(currentSum > N) {
                    currentSum -= left++;
                    if(N == currentSum) answer++;
                }
            }
            return answer;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int answer = solution(N);
        System.out.println(answer);
    }
    public static int solution(int N) {
        int left = 1;
        int currentSum = 0;
        int answer = 0;
        for(int right = 1; right < N; right++) {
            currentSum += right;
            if(currentSum == N) answer++;

            while(currentSum > N) {
                currentSum -= left++;
                if(currentSum == N) answer++;
            }
        }
        return answer;
    }
}
