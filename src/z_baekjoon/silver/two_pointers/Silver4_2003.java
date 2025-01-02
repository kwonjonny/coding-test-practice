package z_baekjoon.silver.two_pointers;

import java.util.Scanner;

/**
 * 수들의 합 2
 *
 * 시간 제한	메모리 제한	제출	    정답	    맞힌 사람	정답 비율
 * 0.5 초	128 MB	    63640	30783	21182	    48.349%
 * 문제
 * N개의 수로 된 수열 A[1], A[2], …, A[N] 이 있다. 이 수열의 i번째 수부터 j번째 수까지의 합 A[i] + A[i+1] + … + A[j-1] + A[j]가 M이 되는 경우의 수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 10,000), M(1 ≤ M ≤ 300,000,000)이 주어진다. 다음 줄에는 A[1], A[2], …, A[N]이 공백으로 분리되어 주어진다. 각각의 A[x]는 30,000을 넘지 않는 자연수이다.
 *
 * 출력
 * 첫째 줄에 경우의 수를 출력한다.
 *
 * 예제 입력 1
    4 2
    1 1 1 1
 * 예제 출력 1
 * 3
 *
 * 예제 입력 2
    10 5
    1 2 3 4 2 5 3 1 1 2
 * 예제 출력 2
 * 3
 */
public class Silver4_2003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer length = scan.nextInt();
        Integer sumOrder = scan.nextInt();
        Integer[] intArray = new Integer[length];
        for(int i = 0; i < length; i++) {
            intArray[i] = scan.nextInt();
        }
        Integer answer = solution(length, sumOrder, intArray);
        System.out.println(answer);
    }
    public static Integer solution(Integer length, Integer sumOrder, Integer[] intArray) {
        int answer = 0;
        int currentSum = 0;
        int left = 0;
        for(int right = 0; right < length; right++) {
            currentSum = currentSum + intArray[right];

            if(sumOrder.equals(currentSum)) answer++;

            while(currentSum > sumOrder) {
                currentSum = currentSum - intArray[left++];
                if(sumOrder.equals(currentSum)) answer++;
            }
        }
        return answer;
    }
}
