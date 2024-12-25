package two_pointers;

import java.util.Scanner;

/**
 * 최대 매출
 * 설명
 *
 * 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
 *
 * 만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
 *
 * 12 15 11 20 25 10 20 19 13 15
 *
 * 연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
 *
 * 여러분이 현수를 도와주세요.
 *
 *
 * 입력
 *
 * 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
 *
 * 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
 *
 *
 * 출력
 *
 * 첫 줄에 최대 매출액을 출력합니다.
 *
 *
 * 예시 입력
 *
   10 3
   12 15 11 20 25 10 20 19 13 15
 *
 * 예시 출력
 * 56
 */
public class A_SlidingWindow3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer length = scan.nextInt();
        Integer sliding = scan.nextInt();
        Integer[] array = new Integer[length];
        for(int i = 0; i < length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println(solution(length, sliding, array));
    }

    public static Integer solution(Integer length, Integer sliding, Integer[] array) {
        int max = 0;
        int currentSum = 0;

        for(int i = 0; i < sliding; i++) {
            currentSum = currentSum + array[i];
        }
        max = currentSum;

        for(int i = sliding; i < length; i++) {
            currentSum = currentSum + (array[i] - array[i - sliding]);
            max = Math.max(max, currentSum);
        }
        return max;
    }

    /**
     * 재 복습: 2024-12-23
     */
    public static class ASlidingWindow3 {
        public static void main(String[] args) {
            ASlidingWindow3 aSlidingWindow3 = new ASlidingWindow3();
            Scanner scan = new Scanner(System.in);
            int length = scan.nextInt();
            int days = scan.nextInt();
            int[] intArray = new int[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            System.out.println(aSlidingWindow3.solution(length, days, intArray));
        }
        public int solution(int length, int days, int[] intArray) {
            int max = 0;
            int currentSum = 0;
            for(int i = 0; i < days; i++) {
                currentSum = currentSum + intArray[i];
            }
            max = currentSum;

            for(int i = days; i < length; i++) {
                currentSum = currentSum + (intArray[i] - intArray[i - days]);
                max = Math.max(max, currentSum);
            }
            return max;
        }
    }

    /**
     * 재 복습: 2024-12-25
     */
    public static class ASlidingWindow4 {
        public static void main(String[] args) {
            ASlidingWindow4 aSlidingWindow4 = new ASlidingWindow4();
            Scanner scan = new Scanner(System.in);
            int length = scan.nextInt();
            int sliding = scan.nextInt();
            int[] array = new int[length];
            for(int i = 0; i < length; i++) {
                array[i] = scan.nextInt();
            }
            System.out.println(aSlidingWindow4.solution(length, sliding, array));
        }
        public Integer solution(int length, int sliding, int[] array) {
            int max = 0;
            int sum = 0;

            for(int i = 0; i < sliding; i++) {
                sum = sum + array[i];
            }
            max = sum;

            for(int i = sliding; i < length; i++) {
                sum = sum + (array[i] - array[i - sliding]);
                max = Math.max(max, sum);
            }
            return max;
        }
    }
}