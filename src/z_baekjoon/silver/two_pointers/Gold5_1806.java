package z_baekjoon.silver.two_pointers;

import java.util.Scanner;

/**
 * 부분합
 *
 * 시간 제한	메모리 제한	        제출	    정답	    맞힌 사람	정답 비율
 * 0.5 초    (하단 참고)	128 MB	114168	31893	22559	    26.350%
 * 문제
 * 10,000 이하의 자연수로 이루어진 길이 N짜리 수열이 주어진다. 이 수열에서 연속된 수들의 부분합 중에 그 합이 S 이상이 되는 것 중, 가장 짧은 것의 길이를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 N (10 ≤ N < 100,000)과 S (0 < S ≤ 100,000,000)가 주어진다. 둘째 줄에는 수열이 주어진다. 수열의 각 원소는 공백으로 구분되어져 있으며, 10,000이하의 자연수이다.
 *
 * 출력
 * 첫째 줄에 구하고자 하는 최소의 길이를 출력한다. 만일 그러한 합을 만드는 것이 불가능하다면 0을 출력하면 된다.
 *
 * 예제 입력 1
 * 10 15
 * 5 1 3 5 10 7 4 9 2 8
 * 예제 출력 1
 * 2
 */
public class Gold5_1806 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int orderSum = scan.nextInt();
        int[] intArray = new int[length];
        for(int i = 0; i < length; i++) {
            intArray[i] = scan.nextInt();
        }
        System.out.println(solution(length, orderSum, intArray));
    }
    public static int solution(int length, int orderSum, int[] intArray) {
        int currentSum = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        for(int right = 0; right < length; right++) {
            currentSum = currentSum + intArray[right];

            while(currentSum >= orderSum) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum = currentSum - intArray[left++];
            }

        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
