package java_알고리즘_문제풀이_입문_코딩테스트_대비.투포인터_슬라이딩윈도우;

import java.util.*;

/**
 * 6. 최대 길이 연속부분수열
 * 설명
 * <p>
 * 0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
 * <p>
 * 만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
 * <p>
 * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
 * <p>
 * 여러분이 만들 수 있는 1이 연속된 연속부분수열은
 * <p>
 * 이며 그 길이는 8입니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.
 * <p>
 * 두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 줄에 최대 길이를 출력하세요.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     14 2
     1 1 0 0 1 1 0 1 1 0 1 1 0 1
 * 예시 출력 1
 * <p>
 * 8
 */
public class F_최대_길이_연속부분수열6 {

    /**
     * 재 복습: 2025-05-09
     */
    public static class F_최대_길이_연속부분수열6_3 {
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
            int left = 0;
            int length = 0;
            int zeroCount = 0;
            for(int right = 0; right < N; right++) {
                if(array[right] == 0) zeroCount++;
                while(zeroCount > T) {
                    if(array[left] == 0) zeroCount--;
                    left++;
                }
                length = Math.max(length, right + 1 - left);
            }
            System.out.println(length);
        }
    }


    /**
     * 재 복습: 2025-03-06
     */
    public static class F_최대_길이_연속부분수열6_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            int[] array =  new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            int answer = solution(N, T, array);
            System.out.println(answer);
        }
        public static int solution(int N, int T, int[] array) {
            int zeroCount = 0;
            int left = 0;
            int answer = 0;
            for(int right = 0; right < N; right++) {
                if(array[right] == 0) zeroCount++;
                while(zeroCount > T) {
                    if(array[left] == 0) zeroCount--;
                    left++;
                }
                answer = Math.max(answer, right - left + 1);
            }
            return answer;
        }
    }


    /**
     * 재 복습: 2025-03-05
     */
    public static class F_최대_길이_연속부분수열6_1 {
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
            int zeroPoint = 0;
            int answer = 0;
            int left = 0;
            for(int right = 0; right < N; right++) {
                if(array[right] == 0) zeroPoint++;
                while(zeroPoint > T) {
                    if(array[left] == 0) zeroPoint--;
                    left++;
                }
                answer = Math.max(answer, right - left + 1);
            }
            return answer;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        int answer = solution(N, T, array);
        System.out.println(answer);
    }

    public static int solution(int N, int T, int[] array) {
        int lt = 0;
        int zeroCount = 0;
        int maxLength = 0;
        for (int right = 0; right < N; right++) {
            if (array[right] == 0) zeroCount++;
            while (zeroCount > T) {
                if (array[lt] == 0) zeroCount--;
                lt++;
            }
            maxLength = Math.max(maxLength, right - lt + 1);
        }
        return maxLength;
    }
}
