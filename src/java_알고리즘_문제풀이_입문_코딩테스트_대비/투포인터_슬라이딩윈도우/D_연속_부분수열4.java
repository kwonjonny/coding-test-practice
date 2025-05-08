package java_알고리즘_문제풀이_입문_코딩테스트_대비.투포인터_슬라이딩윈도우;

/**
 * 4. 연속 부분수열
 * 설명
 * <p>
 * N개의 수로 이루어진 수열이 주어집니다.
 * <p>
 * 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
 * <p>
 * 만약 N=8, M=6이고 수열이 다음과 같다면
 * <p>
 * 1 2 1 3 1 1 1 2
 * <p>
 * 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
 * <p>
 * 수열의 원소값은 1,000을 넘지 않는 자연수이다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫째 줄에 경우의 수를 출력한다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     8 6
     1 2 1 3 1 1 1 2
 * 예시 출력 1
 * <p>
 * 3
 */

import java.util.*;

public class D_연속_부분수열4 {

    /**
     * 재 복습: 2025-05-08
     */
    public static class D_연속_부분수열4_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            solution(N, T, array);
        }
        public static void solution(int N, int T, int[] array) {
            int answer = 0;
            int sum = 0;
            int left = 0;
            for(int right = 0; right < N; right++) {
                sum += array[right];
                if(sum == T) answer++;
                while(sum >= T) {
                    sum -= array[left++];
                    if(sum == T) answer++;
                }
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-03-05
     */
    public static class D_연속_부분수열4_1 {
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
            int left = 0;
            int currentSum = 0;
            int answer = 0;
            for(int right = 0; right < N; right++) {
                currentSum += array[right];
                if(currentSum == T) answer++;
                while(currentSum > T) {
                    currentSum -= array[left++];
                    if(currentSum == T) answer++;
                }
            }
            return answer;
        }
    }


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
        int answer = 0;
        int left = 0;
        for(int i = 0; i < N; i++) {
            currentSum += array[i];
            if(currentSum == T) answer++;
            while(currentSum > T) {
                currentSum -= array[left++];
                if(currentSum == T) answer++;
            }
        }
        return answer;
    }
}
