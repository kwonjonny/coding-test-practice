package z_baekjoon.silver.two_pointers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 수 고르기 
 *
 * 시간 제한	메모리 제한	제출	    정답	    맞힌 사람	정답 비율
 * 2 초	    128 MB	    27814	9462	6568	    30.878%
 * 문제
 * N개의 정수로 이루어진 수열 A[1], A[2], …, A[N]이 있다. 이 수열에서 두 수를 골랐을 때(같은 수일 수도 있다), 그 차이가 M 이상이면서 제일 작은 경우를 구하는 프로그램을 작성하시오.
 *
 * 예를 들어 수열이 {1, 2, 3, 4, 5}라고 하자. 만약 M = 3일 경우, 1 4, 1 5, 2 5를 골랐을 때 그 차이가 M 이상이 된다. 이 중에서 차이가 가장 작은 경우는 1 4나 2 5를 골랐을 때의 3이 된다.
 *
 * 입력
 * 첫째 줄에 두 정수 N, M이 주어진다. 다음 N개의 줄에는 차례로 A[1], A[2], …, A[N]이 주어진다.
 *
 * 출력
 * 첫째 줄에 M 이상이면서 가장 작은 차이를 출력한다. 항상 차이가 M이상인 두 수를 고를 수 있다.
 *
 * 제한
 * 1 ≤ N ≤ 100,000
 * 0 ≤ M ≤ 2,000,000,000
 * 0 ≤ |A[i]| ≤ 1,000,000,000
 * 예제 입력 1
 * 3 3
 * 1
 * 5
 * 3
 * 예제 출력 1
 * 4
 */
public class Gold5_2230 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer length = scan.nextInt();
        Integer order = scan.nextInt();
        Integer[] intArray = new Integer[length];
        for(int i = 0; i < length; i++) {
            intArray[i] = scan.nextInt();
        }
        solution(length, order, intArray);
    }
    public static void solution(Integer length, Integer order, Integer[] intArray) {
        Arrays.sort(intArray);
        int left = 0;
        int answer = Integer.MAX_VALUE;
        for(int right = 0; right < length; right++) {
            while(right > left && intArray[right] - intArray[left] >= order) {
                answer = Math.min(answer, intArray[right] - intArray[left++]);
            }
        }
        System.out.println(answer);
    }
}
