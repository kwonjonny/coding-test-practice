package z_baekjoon.silver.two_pointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 소수의 연속합
 *
 * 시간 제한	메모리 제한	제출	정답	    맞힌 사람	정답          비율
 * 2 초	    128 MB	    53914	    23446	    16317	    41.442%
 *
 * 문제
 * 하나 이상의 연속된 소수의 합으로 나타낼 수 있는 자연수들이 있다. 몇 가지 자연수의 예를 들어 보면 다음과 같다.
 *
 * 3 : 3 (한 가지)
 * 41 : 2+3+5+7+11+13 = 11+13+17 = 41 (세 가지)
 * 53 : 5+7+11+13+17 = 53 (두 가지)
 * 하지만 연속된 소수의 합으로 나타낼 수 없는 자연수들도 있는데, 20이 그 예이다. 7+13을 계산하면 20이 되기는 하나 7과 13이 연속이 아니기에 적합한 표현이 아니다. 또한 한 소수는 반드시 한 번만 덧셈에 사용될 수 있기 때문에, 3+5+5+7과 같은 표현도 적합하지 않다.
 *
 * 자연수가 주어졌을 때, 이 자연수를 연속된 소수의 합으로 나타낼 수 있는 경우의 수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 자연수 N이 주어진다. (1 ≤ N ≤ 4,000,000)
 *
 * 출력
 * 첫째 줄에 자연수 N을 연속된 소수의 합으로 나타낼 수 있는 경우의 수를 출력한다.
 *
 * 예제 입력 1
 * 20
 * 예제 출력 1
 * 0
 *
 * 예제 입력 2
 * 3
 * 예제 출력 2
 * 1
 *
 * 예제 입력 3
 * 41
 * 예제 출력 3
 * 3
 *
 * 예제 입력 4
 * 53
 * 예제 출력 4
 * 2
 */
public class Gold3_1544 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int order = scan.nextInt();
        solution(order);
    }
    public static Integer solution(Integer order) {
        List<Integer> addArray = new ArrayList<>();
        int[] intArray = new int[order + 1];
        for(int i = 2; i * i<= order; i++) {
            if(intArray[i] == 0) {
                for(int j = i * i; j <= order; j = j + i) {
                    intArray[j] = 1;
                }
            }
        }
        for(int i = 2; i <= order; i++) {
            if(intArray[i] == 0) addArray.add(i);
        }

        int answer = 0;
        int currentSum = 0;
        int left = 0;
        for(int right = 0; right < addArray.size(); right++) {
            currentSum = currentSum + addArray.get(right);
            if(currentSum == order) answer++;
            while(currentSum >= order) {
                currentSum = currentSum - addArray.get(left++);
                if(currentSum == order) answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
