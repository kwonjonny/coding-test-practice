package z_baekjoon.silver.two_pointers;

import java.util.Scanner;

/**
 * 수들의 합 5
 *
 * 시간 제한    메모리 제한	제출	    정답  	맞힌 사람	정답 비율
 * 2 초	       32 MB	    27670	13289	9852	    48.717%
 * 문제
 * 어떠한 자연수 N은, 몇 개의 연속된 자연수의 합으로 나타낼 수 있다. 당신은 어떤 자연수 N(1 ≤ N ≤ 10,000,000)에 대해서, 이 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 알고 싶어한다. 이때, 사용하는 자연수는 N이하여야 한다.
 *
 * 예를 들어, 15를 나타내는 방법은 15, 7+8, 4+5+6, 1+2+3+4+5의 4가지가 있다. 반면에 10을 나타내는 방법은 10, 1+2+3+4의 2가지가 있다.
 *
 * N을 입력받아 가지수를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫 줄에 정수 N이 주어진다.
 *
 * 출력
 * 입력된 자연수 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 출력하시오
 *
 * 예제 입력 1
 * 15
 * 예제 출력 1
 * 4
 */
public class Silver5_2018 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer orderSum = scan.nextInt();
        solution(orderSum);
    }
    public static void solution(Integer orderSum) {
        int answer = 0;
        int left = 1;
        int currentSum = 0;
        for(int right = 1; right <= orderSum; right++) {
            currentSum = currentSum + right;
            if(orderSum.equals(currentSum)) answer++;
            while(currentSum > orderSum) {
                currentSum = currentSum - left++;
                if(orderSum.equals(currentSum)) answer++;
            }
        }
        System.out.println(answer);
    }

    /**
     * 재 복습: 2025-01-06
     */
    public static class Silver5_2018_1 {
        public static void main(String[] args) {
            Silver5_2018_1 silver520181 = new Silver5_2018_1();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            silver520181.solution(count);
        }
        public void solution(Integer count) {
            int answer = 0;
            int currentSum = 0;
            int left = 1;
            for(int right = 1; right <= count; right++) {
                currentSum = currentSum + right;
                if(count.equals(currentSum)) answer++;
                while(currentSum > count) {
                    currentSum = currentSum - left++;
                    if(count.equals(currentSum)) answer++;
                }
            }
            System.out.println(answer);
        }
    }
}