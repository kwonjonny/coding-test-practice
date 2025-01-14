package two_pointers;

import java.util.Scanner;

/**
 * 연속 부분수열
 * 설명
 *
 * N개의 수로 이루어진 수열이 주어집니다.
 *
 * 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
 *
 * 만약 N=8, M=6이고 수열이 다음과 같다면
 *
 * 1 2 1 3 1 1 1 2
 *
 * 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
 *
 *
 * 입력
 *
 * 첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
 *
 * 수열의 원소값은 1,000을 넘지 않는 자연수이다.
 *
 *
 * 출력
 *
 * 첫째 줄에 경우의 수를 출력한다.
 *
 * 예시 입력
    8 6
    1 2 1 3 1 1 1 2
 *
 * 예시 출력
 * 3
 */
public class A_TwoPointersAndSlidingWindow1 {

    /*
     * 재 복습: 2025-01-14
     */
    public static class ATwoPointersAndSlidingWindow7 {
        public static void main(String[] args) {
            ATwoPointersAndSlidingWindow7 aTwoPointersAndSlidingWindow7 = new ATwoPointersAndSlidingWindow7();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer order = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            aTwoPointersAndSlidingWindow7.solution(length, order, intArray);
        }
        public void solution(Integer length, Integer order, Integer[] intArray) {
            int answer = 0;
            int currentSum = 0;
            int left = 0;
            for(int right = 0; right < length; right++) {
                currentSum = currentSum + intArray[right];
                if(order.equals(currentSum)) answer++;
                while(currentSum > order) {
                    currentSum = currentSum - intArray[left++];
                    if(order.equals(currentSum)) answer++;
                }
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-01-13
     */
    public static class ATwoPointersAndSlidingWindow6 {
        public static void main(String[] args) {
            ATwoPointersAndSlidingWindow6 aTwoPointersAndSlidingWindow6 = new ATwoPointersAndSlidingWindow6();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer order = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            aTwoPointersAndSlidingWindow6.solution(length, order, intArray);
        }
        public void solution(Integer length, Integer order, Integer[] intArray) {
            int left = 0;
            int answer = 0;
            int currentSum = 0;
            for(int right = 0; right < length; right++) {
                currentSum = currentSum + intArray[right];
                if(order.equals(currentSum)) answer++;
                while(currentSum > order) {
                    currentSum = currentSum - intArray[left++];
                    if(order.equals(currentSum)) answer++;
                }
            }
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int score = scan.nextInt();
        int[] intArray = new int[length];
        for(int i = 0; i < length; i++) {
            intArray[i] = scan.nextInt();
        }
        System.out.println(solution(length, score, intArray));
    }

    public static Integer solution(int length, int score, int[] intArray) {
        int answer = 0;
        int sum = 0;
        int left = 0;

        for(int right = 0; right < length; right++) {
            sum = sum + intArray[right];

            if(sum == score) {
                answer++;
            }

            while(sum >= score) {
                sum = sum - intArray[left++];
                if(sum == score) answer++;
            }

        }
        return answer;
    }

    /**
     * 재 복습: 2024-12-25
     */
    public static class ATwoPointersAndSlidingWindow2 {
        public static void main(String[] args) {
            ATwoPointersAndSlidingWindow2 aTwoPointersAndSlidingWindow2 = new ATwoPointersAndSlidingWindow2();
            Scanner scan = new Scanner(System.in);
            int length = scan.nextInt();
            int sum = scan.nextInt();
            int[] intArray = new int[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            System.out.println(aTwoPointersAndSlidingWindow2.solution(length, sum, intArray));
        }
        public Integer solution(int length , int sum, int[] intArray) {
            int count = 0;
            int left = 0;
            int loopSum = 0;

            for(int right = 0; right < length; right++) {
                loopSum = loopSum + intArray[right];
                if(loopSum == sum) {
                    count++;
                }

                while(loopSum >= sum) {
                    loopSum = loopSum - intArray[left++];
                    if(loopSum == sum) count++;
                }
            }
            return count;
        }
    }

    /**
     * 재 복습: 2024-12-26
     */
    public static class ATwoPointersAndSlidingWindow3 {
        public static void main(String[] args) {
            ATwoPointersAndSlidingWindow3 aTwoPointersAndSlidingWindow3 = new ATwoPointersAndSlidingWindow3();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer call = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            System.out.println(aTwoPointersAndSlidingWindow3.solution(length, call, intArray));
        }
        public Integer solution(Integer length, Integer call, Integer[] intArray) {
            Integer answer = 0;
            Integer sum = 0;
            Integer left = 0;
            for(int right = 0; right < length; right++) {
                sum = sum + intArray[right];
                if(sum.equals(call)) answer++;
                while(sum >= call) {
                    sum = sum - intArray[left++];
                    if(sum.equals(call)) answer++;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class ATwoPointersAndSlidingWindow4 {
        public static void main(String[] args) {
            ATwoPointersAndSlidingWindow4 aTwoPointersAndSlidingWindow4 = new ATwoPointersAndSlidingWindow4();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer sum = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            Integer answer = aTwoPointersAndSlidingWindow4.solution(length, sum, intArray);
            System.out.println(answer);
        }
        public Integer solution(Integer length, Integer sum, Integer[] intArray) {
            Integer answer = 0;
            int currentSum = 0;
            int left = 0;
            for(int rigth = 0; rigth < length; rigth++) {
                currentSum = currentSum + intArray[rigth];

                if(sum.equals(currentSum)) {
                    answer++;
                }
                while(currentSum > sum) {
                    currentSum = currentSum - intArray[left++];
                    if(sum.equals(currentSum)) answer++;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class ATwoPointersAndSlidingWindow5 {
        public static void main(String[] args) {
            ATwoPointersAndSlidingWindow5 aTwoPointersAndSlidingWindow5 = new ATwoPointersAndSlidingWindow5();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer order = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            aTwoPointersAndSlidingWindow5.solution(length, order, intArray);
        }
        public void solution(Integer length, Integer order, Integer[] intArray) {
            int answer = 0;
            int left = 0;
            int currentSum = 0;
            for(int right = 0; right < length; right++) {
                currentSum = currentSum + intArray[right];
                if(order.equals(currentSum)) answer++;
                while(currentSum > order) {
                    currentSum = currentSum - intArray[left++];
                    if(order.equals(currentSum)) answer++;
                }
            }
            System.out.println(answer);
        }
    }
}