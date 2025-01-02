package z_baekjoon.silver.two_pointers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 두 수의 합
 *
 * 시간 제한	메모리 제한	제출	    정답	    맞힌 사람	정답 비율
 * 1 초	    128 MB	     69902	25169	 18355	    34.508%
 * 문제
 * n개의 서로 다른 양의 정수 a1, a2, ..., an으로 이루어진 수열이 있다. ai의 값은 1보다 크거나 같고, 1000000보다 작거나 같은 자연수이다. 자연수 x가 주어졌을 때, ai + aj = x (1 ≤ i < j ≤ n)을 만족하는 (ai, aj)쌍의 수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 수열의 크기 n이 주어진다. 다음 줄에는 수열에 포함되는 수가 주어진다. 셋째 줄에는 x가 주어진다. (1 ≤ n ≤ 100000, 1 ≤ x ≤ 2000000)
 *
 * 출력
 * 문제의 조건을 만족하는 쌍의 개수를 출력한다.
 *
 * 예제 입력 1
 * 9
 * 5 12 7 10 9 1 2 3 11
 * 13
 *
 * 예제 출력 1
 * 3
 */
public class Silver3_3273 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer length = scan.nextInt();
        Integer[] intArray = new Integer[length];
        for(int i = 0; i < length; i++) {
            intArray[i] = scan.nextInt();
        }
        Integer orderCountSum = scan.nextInt();
        System.out.println(solution(length, intArray, orderCountSum));
    }
    public static Integer solution(Integer length, Integer[] intArray, Integer orderCountSum) {
        int answer = 0;
        Arrays.sort(intArray);
        int left = 0;
        int right = length - 1;
        while (left < right) {
            Integer sum = intArray[left] + intArray[right];
            if(sum.equals(orderCountSum)) {
                answer++;
                right--;
                left++;
            }
            else if (sum < orderCountSum) left++;
            else right--;
        }
        return answer;
    }
}
