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

    /**
     * 재 복습: 2025-01-14
     */
    public static class ASlidingWindow9 {
        public static void main(String[] args) {
            ASlidingWindow8 aSlidingWindow8 = new ASlidingWindow8();
            Scanner scan = new Scanner(System.in);
            Integer legnth = scan.nextInt();
            Integer order = scan.nextInt();
            Integer[] intArray = new Integer[legnth];
            for(int i = 0; i < legnth; i++) {
                intArray[i] = scan.nextInt();
            }
            aSlidingWindow8.solution(legnth, order, intArray);
        }
        public void solution(Integer length, Integer order, Integer[] intArray) {
            int currentSum = 0;
            for(int i = 0; i < order; i++) {
                currentSum = currentSum + intArray[i];
            }
            int max = currentSum;
            for(int right = order; right < length; right++) {
                currentSum = currentSum + (intArray[right] - intArray[right - order]);
                max = Math.max(max, currentSum);
            }
            System.out.println(max);
        }
    }

    /**
     * 재 복습: 2025-01-13
     */
    public static class ASlidingWindow8 {
        public static void main(String[] args) {
            ASlidingWindow8 aSlidingWindow8 = new ASlidingWindow8();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer order = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            aSlidingWindow8.solution(length, order, intArray);
        }
        public void solution(Integer length, Integer order, Integer[] intArray) {
            int currentSum = 0;
            int max = 0;
            for(int i = 0; i < order; i++) {
                currentSum = currentSum + intArray[i];
            }
            max = currentSum;

            for(int right = order; right < length; right++) {
                currentSum = currentSum + (intArray[right] - intArray[right - order]);
                max = Math.max(max, currentSum);
            }
            System.out.println(max);
        }
    }

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

    /**
     * 재 복습: 2024-12-26
     */
    public static class ASlidingWindow5 {
        public static void main(String[] args) {
            ASlidingWindow5 aSlidingWindow5 = new ASlidingWindow5();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer sliding = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            System.out.println(aSlidingWindow5.solution(length, sliding, intArray));
        }
        public Integer solution(Integer length, Integer sliding, Integer[] intArray) {
            Integer max = 0;
            Integer currentSum = 0;
            for(int i = 0; i < sliding; i++) {
                currentSum = currentSum + intArray[i];
            }
            max = currentSum;

            for(int i = sliding; i < length; i++) {
                currentSum = currentSum + (intArray[i] - intArray[i - sliding]);
                max = Math.max(currentSum, max);
            }
            return max;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class ASlidingWindow6 {
        public static void main(String[] args) {
            ASlidingWindow6 aSlidingWindow6 = new ASlidingWindow6();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer orderCount = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            Integer answer = aSlidingWindow6.solution(length, orderCount, intArray);
            System.out.println(answer);
        }
        public Integer solution(Integer length, Integer orderCount, Integer[] intArray) {
            int currentSum = 0;
            int max = 0;
            for(int i = 0; i < orderCount; i++) {
                int a = intArray[i];
                currentSum = currentSum + a;
            }
            max = currentSum;

            for(int rigth = orderCount; rigth < length; rigth++) {
                int a = intArray[rigth];
                int left = rigth - orderCount;
                currentSum = currentSum + (intArray[rigth] - intArray[left]);
                max = Math.max(max, currentSum);
            }
            return max;
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class ASlidingWindow7 {
        public static void main(String[] args) {
            ASlidingWindow7 aSlidingWindow7 = new ASlidingWindow7();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer order = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            aSlidingWindow7.solution(length, order, intArray);
        }
        public void solution(Integer length, Integer order, Integer[] intArray) {
            int max = 0;
            int currentSum = 0;
            for(int i = 0; i < order; i++) {
                currentSum = currentSum + intArray[i];
            }
            max = currentSum;
            for(int right = order; right < length; right++) {
                int left = right - order;
                currentSum = currentSum + (intArray[right] - intArray[left]);
                max = Math.max(max, currentSum);
            }
            System.out.println(max);
        }
    }
}