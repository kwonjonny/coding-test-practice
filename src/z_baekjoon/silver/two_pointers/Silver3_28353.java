package z_baekjoon.silver.two_pointers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 고양이 카페 성공
 *
 * 시간 제한	            메모리 제한	제출	            정답	    맞힌 사람	정답 비율
 * 2 초 (추가 시간 없음)	1024 MB     (추가 메모리 없음)	1568	922	        805	62.989%
 * 문제
 * 찬우는 친구들과 고양이 카페에 가려 한다.
 *
 * 고양이 카페에는
 * N마리의 고양이가 있다.
 * i번째 고양이의 무게는
 * w_i이다. 찬우와 친구들은 모두 고양이를 사랑하기 때문에 무릎 위에 고양이를 정확히
 * 2마리 데리고 있으면 행복해진다. 하지만 허약한 찬우와 친구들은 데리고 있는 두 고양이의 무게의 합이
 * K를 넘는다면 버티지 못할 것이다.
 *
 * 각 고양이의 무게와 한 명이 버틸 수 있는 최대 무게
 * K가 주어질 때 최대 몇 명이 행복해질 수 있는지 구해보자.
 *
 * 입력
 * 첫째 줄에 정수
 * N과
 * K가 공백으로 구분되어 주어진다.
 *
 * 둘째 줄에는 각 고양이의 무게를 의미하는
 * N개의 정수
 *
 * 출력
 * 행복해질 수 있는 사람의 수의 최댓값을 출력한다.
 *
 * 예제 입력 1
 * 5 20
 * 8 16 11 2 4
 * 예제 출력 1
 * 2
 *
 * 예제 입력 2
 * 6 10
 * 9 5 6 7 4 3
 * 예제 출력 2
 * 2
 *
 * 예제 입력 3
 * 4 100
 * 100 99 98 97
 * 예제 출력 3
 * 0
 */
public class Silver3_28353 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int sumOrder = scan.nextInt();
        int[] intArray = new int[length];
        for(int i = 0; i < length; i++) {
            intArray[i] = scan.nextInt();
        }
        System.out.println(solution(length, sumOrder, intArray));
    }
    public static Integer solution(int length, int sumOrder, int[] intArray) {
        Arrays.sort(intArray);
        int left = 0;
        int right = length - 1;
        int answer = 0;
        while (right > left) {
            int sum = intArray[left] + intArray[right];
            if(sum <= sumOrder) {
                answer++;
                left++;
                right--;
            }
            else {
                right--;
            }        }
        return answer;
    }
}
