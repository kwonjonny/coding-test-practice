package z_baekjoon.silver.two_pointers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 좋다
 *
 * 시간 제한	메모리 제한	제출	    정답	    맞힌 사람	정답 비율
 *  2 초	256 MB  	62205	15738	11273	    24.347%
 * 문제
 * N개의 수 중에서 어떤 수가 다른 수 두 개의 합으로 나타낼 수 있다면 그 수를 “좋다(GOOD)”고 한다.
 *
 * N개의 수가 주어지면 그 중에서 좋은 수의 개수는 몇 개인지 출력하라.
 *
 * 수의 위치가 다르면 값이 같아도 다른 수이다.
 *
 * 입력
 * 첫째 줄에는 수의 개수 N(1 ≤ N ≤ 2,000), 두 번째 줄에는 i번째 수를 나타내는 Ai가 N개 주어진다. (|Ai| ≤ 1,000,000,000, Ai는 정수)
 *
 * 출력
 * 좋은 수의 개수를 첫 번째 줄에 출력한다.
 *
 * 예제 입력 1
 * 10
 * 1 2 3 4 5 6 7 8 9 10
 * 예제 출력 1
 * 8
 * 힌트
 * 3,4,5,6,7,8,9,10은 좋다.
 */
public class Gold5_1253 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer length = scan.nextInt();
        Integer[] intArray = new Integer[length];
        for(int i = 0; i < length;i ++) {
            intArray[i] = scan.nextInt();
        }
        solution(length, intArray);
    }
    public static void solution(Integer length, Integer[] intArray) {
        Arrays.sort(intArray);
        int answer = 0;
        for(int i = 0; i < length; i++) {
            int left = 0;
            int right = length - 1;
            Integer target = intArray[i];

            while(right > left) {
               if(right == i) {
                   right--;
                   continue;
               }
               if(left == i) {
                   left++;
                   continue;
               }
               int sum = intArray[right] + intArray[left];
               if(target.equals(sum)) {
                   answer++;
                   break;
               }
               if(sum > target) right--;
               if(sum < target) left++;
            }
        }
        System.out.println(answer);
    }
}
