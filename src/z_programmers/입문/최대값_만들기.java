package z_programmers.입문;

import java.util.*;

/**
 * 문제 설명
 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 0 ≤ numbers의 원소 ≤ 10,000
 * 2 ≤ numbers의 길이 ≤ 100
 * 입출력 예
 * numbers	result
 * [1, 2, 3, 4, 5]	20
 * [0, 31, 24, 10, 1, 9]	744
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 두 수의 곱중 최댓값은 4 * 5 = 20 입니다.
 * 입출력 예 #1
 *
 * 두 수의 곱중 최댓값은 31 * 24 = 744 입니다.
 */
public class 최대값_만들기 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int answer = solution(numbers1);
        System.out.println(answer);
        int[] numbers2 = {0, 31, 24, 10, 1, 9};
        int answer2 = solution(numbers2);
        System.out.println(answer2);
    }
    public static int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length - 2] * array[array.length - 1];
        return answer;
    }
}
