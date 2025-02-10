package z_programmers.입문;

import java.util.*;

/**
 * 중앙값 구하기
 *
 * 제한사항
 * array의 길이는 홀수입니다.
 *
 * 0 < array의 길이 < 100
 *
 * -1,000 < array의 원소 < 1,000
 *
 * 입출력 예
 * array	            result
 * [1, 2, 7, 10, 11]	7
 * [9, -1, 0]	        0
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 9, -1, 0을 오름차순 정렬하면 -1, 0, 9이고 가장 중앙에 위치하는 값은 0입니다.
 */
public class 중앙값_구하기 {
    public static void main(String[] args) {
        int[] array = {1,2,7,10,11};
        int answer = solution(array);
        System.out.println(answer);
    }
    public static int solution(int[] array) {
        Arrays.sort(array);
        int answer = 0;
        answer = array[array.length / 2];
        return answer;
    }
}
