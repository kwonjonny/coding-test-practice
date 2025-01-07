package z_baekjoon.silver.two_pointers;

import java.util.Scanner;

/**
 * 수열
 *
 * 시간 제한	메모리 제한	제출	    정답	    맞힌 사람	정답 비율
 * 1 초	     128 MB	    68744	26060	19909	    36.650%
 *
 * 문제
 * 매일 아침 9시에 학교에서 측정한 온도가 어떤 정수의 수열로 주어졌을 때, 연속적인 며칠 동안의 온도의 합이 가장 큰 값을 알아보고자 한다.
 *
 * 예를 들어, 아래와 같이 10일 간의 온도가 주어졌을 때,
 *
 * 3 -2 -4 -9 0 3 7 13 8 -3
 *
 * 모든 연속적인 이틀간의 온도의 합은 아래와 같다.
 *
 * 이때, 온도의 합이 가장 큰 값은 21이다.
 *
 * 또 다른 예로 위와 같은 온도가 주어졌을 때, 모든 연속적인 5일 간의 온도의 합은 아래와 같으며,
 *
 * 이때, 온도의 합이 가장 큰 값은 31이다.
 *
 * 매일 측정한 온도가 정수의 수열로 주어졌을 때, 연속적인 며칠 동안의 온도의 합이 가장 큰 값을 계산하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에는 두 개의 정수 N과 K가 한 개의 공백을 사이에 두고 순서대로 주어진다. 첫 번째 정수 N은 온도를 측정한 전체 날짜의 수이다.
 *
 * N은 2 이상 100,000 이하이다. 두 번째 정수 K는 합을 구하기 위한 연속적인 날짜의 수이다. K는 1과 N 사이의 정수이다.
 *
 * 둘째 줄에는 매일 측정한 온도를 나타내는 N개의 정수가 빈칸을 사이에 두고 주어진다. 이 수들은 모두 -100 이상 100 이하이다.
 *
 * 출력
 * 첫째 줄에는 입력되는 온도의 수열에서 연속적인 K일의 온도의 합이 최대가 되는 값을 출력한다.
 *
 * 예제 입력 1
     10 2
     3 -2 -4 -9 0 3 7 13 8 -3
 *
 * 예제 출력 1
 * 21
 *
 * 예제 입력 2
     10 5
     3 -2 -4 -9 0 3 7 13 8 -3
 *
 * 예제 출력 2
 * 31
 */
public class Silver3_2559 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer length = scan.nextInt();
        Integer orderCount = scan.nextInt();
        Integer[] intArray = new Integer[length];
        for(int i = 0; i < length; i++) {
            intArray[i] = scan.nextInt();
        }
        System.out.println(solution(length, orderCount, intArray));
    }
    public static Integer solution(Integer length, Integer orderCount, Integer[] intArray) {
        int currentSum = 0;
        for(int i = 0; i < orderCount; i++) {
            currentSum = currentSum + intArray[i];
        }
        int answer = currentSum;
        for(int right = orderCount; right < length; right++) {
            int left = right - orderCount;
            currentSum = currentSum + (intArray[right] - intArray[left]);
            answer = Math.max(answer, currentSum);
        }
        return answer;
    }

    /**
     * 재 복습: 2025-01-07
     */
    public static class Silver3_2259_1 {
        public static void main(String[] args) {
            Silver3_2259_1 silver322591 = new Silver3_2259_1();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer sumOrder = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            System.out.println(silver322591.solution(length, sumOrder, intArray));
        }
        public Integer solution(Integer length, Integer sumOrder, Integer[] intArray) {
            int currentSum = 0;
            int max = 0;
            for(int i = 0; i < sumOrder; i++) {
                currentSum = currentSum + intArray[i];
            }
            max = currentSum;
            for(int right = sumOrder; right < length; right++) {
                currentSum = currentSum + (intArray[right] - intArray[right - sumOrder]);
                max = Math.max(max, currentSum);
            }
            return max;
        }
    }
}
