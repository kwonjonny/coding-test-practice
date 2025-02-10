package z_programmers.입문;

import java.util.*;

/**
 * 문제 설명
 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * -10,000 ≤ numbers의 원소 ≤ 10,000
 * 1 ≤ numbers의 길이 ≤ 1,000
 *
 * 입출력 예
 * numbers	                    result
 * [1, 2, 3, 4, 5]	            [2, 4, 6, 8, 10]
 * [1, 2, 100, -99, 1, 2, 3]	[2, 4, 200, -198, 2, 4, 6]
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * [1, 2, 3, 4, 5]의 각 원소에 두배를 한 배열 [2, 4, 6, 8, 10]을 return합니다.
 *
 * 입출력 예 #2
 * [1, 2, 100, -99, 1, 2, 3]의 각 원소에 두배를 한 배열 [2, 4, 200, -198, 2, 4, 6]을 return합니다.
 */
public class 배열_두배_만들기 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] answer = solution(numbers);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            answer.add(numbers[i] * 2);
        }
        int[] answerArray = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
            answerArray[i] = answer.get(i);
        }
        return answerArray;
    }
}
