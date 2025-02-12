package two_pointers;

import java.util.Scanner;

/**
 * 연속된 자연수의 합
 * 설명
 *
 * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
 * 만약 N=15이면
 *
 * 7+8=15
 * 4+5+6=15
 * 1+2+3+4+5=15
 *
 * 와 같이 총 3가지의 경우가 존재한다.
 *
 * 입력
 * 첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
 *
 * 출력
 * 첫 줄에 총 경우수를 출력합니다.
 *
 * 예시 입력
 * 15
 *
 * 예시 출력
 * 3
 */
public class A_TwoPointersAndSlidingWindow2 {

    /**
     * 재 복습: 2025-01-31
     */
    public static class ATwoPointersAndSlidingWindow7 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer target = scan.nextInt();
            ATwoPointersAndSlidingWindow7.solution(target);
        }
        public static void solution(Integer target) {
            int currentSum = 0;
            int answer = 0;
            int left = 1;
            for(int i = 1; i < target; i++) {
                currentSum = currentSum + i;
                if(currentSum == target) answer++;

                while(currentSum > target) {
                    currentSum = currentSum - left++;
                    if(currentSum == target) answer++;
                }
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-01-14
     */
    public static class ATwoPointersAndSlidingWindow6 {
        public static void main(String[] args) {
            ATwoPointersAndSlidingWindow6 aTwoPointersAndSlidingWindow6 = new ATwoPointersAndSlidingWindow6();
            Scanner scan = new Scanner(System.in);
            Integer order = scan.nextInt();
            aTwoPointersAndSlidingWindow6.solution(order);
        }
        public void solution(Integer order) {
            int answer = 0;
            int currentSum = 0;
            int left = 1;
            for(int right = 1; right < order; right++) {
                currentSum = currentSum + right;
                if(currentSum == order) answer++;
                while(currentSum > order) {
                    currentSum = currentSum - left++;
                    if(currentSum == order) answer++;
                }
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-01-13
     */
    public static class ATwoPointersAndSlidingWindow5 {
        public static void main(String[] args) {
            ATwoPointersAndSlidingWindow5 aTwoPointersAndSlidingWindow5 = new ATwoPointersAndSlidingWindow5();
            Scanner scan = new Scanner(System.in);
            Integer order = scan.nextInt();
            aTwoPointersAndSlidingWindow5.solution(order);
        }
        public void solution(Integer order) {
            int left = 1;
            int currentSum = 0;
            int answer = 0;
            for(int right = 1; right < order; right++) {
                currentSum = currentSum + right;
                if(currentSum == order) answer++;
                while(currentSum > order) {
                    currentSum = currentSum - left++;
                    if(currentSum == order) answer++;
                }
            }
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        System.out.println(solution(length));
    }

    public static Integer solution(int length) {
        int answer = 0;
        int currentSum = 0;
        int left = 0;

        int[] array = new int[length - 1];
        for(int i = 0; i < length - 1; i++) {
            array[i] = i + 1;
        }

        for (int j : array) {
            currentSum = currentSum + j;

            if (currentSum == length) answer++;

            while (currentSum > length) {
                currentSum = currentSum - array[left++];
                if (currentSum == length) answer++;
            }
        }
        return answer;
    }

    /**
     * 재 복습: 2024-12-26
     */
    public static class ATwoPointersAndSlidingWindow2 {
        public static void main(String[] args) {
            ATwoPointersAndSlidingWindow2 aTwoPointersAndSlidingWindow2 = new ATwoPointersAndSlidingWindow2();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            System.out.println(aTwoPointersAndSlidingWindow2.solution(length));
        }
        public Integer solution(Integer length) {
            Integer answer = 0;
            Integer sum = 0;
            Integer left = 1;
            for(int right = 1; right <= (length / 2) + 1; right++) {
                sum = sum + right;

                if(sum.equals(length)) {
                    answer++;
                }
                while(sum > length) {
                    sum = sum - left++;
                    if(sum.equals(length)) answer++;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class ATwoPointersAndSlidingWindow3 {
        public static void main(String[] args) {
            ATwoPointersAndSlidingWindow3 aTwoPointersAndSlidingWindow3 = new ATwoPointersAndSlidingWindow3();
            Scanner scan = new Scanner(System.in);
            Integer orderCount = scan.nextInt();
            Integer answer = aTwoPointersAndSlidingWindow3.solution(orderCount);
            System.out.println(answer);
        }
        public Integer solution(Integer orderCount) {
            Integer answer = 0;
            int left = 0;
            int currentSum = 0;
            for(int rigth = 0; rigth < orderCount; rigth++) {
                currentSum = currentSum + rigth;

                if(orderCount.equals(currentSum)) answer++;

                while(currentSum > orderCount) {
                    currentSum = currentSum - left++;
                    if(orderCount.equals(currentSum)) answer++;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class ATwoPointersAndSlidingWindow4 {
        public static void main(String[] args) {
            ATwoPointersAndSlidingWindow4 aTwoPointersAndSlidingWindow4 = new ATwoPointersAndSlidingWindow4();
            Scanner scan = new Scanner(System.in);
            Integer order = scan.nextInt();
            aTwoPointersAndSlidingWindow4.solution(order);
        }
        public void solution(Integer order) {
            int answer = 0;
            int currentSum = 0;
            int left = 0;
            for(int right = 0; right < order; right++) {
                currentSum = currentSum + right;
                if(order.equals(currentSum)) answer++;
                while(currentSum > order) {
                    currentSum = currentSum - left++;
                    if(order.equals(currentSum)) answer++;
                }
            }
            System.out.println(answer);
        }
    }
}
