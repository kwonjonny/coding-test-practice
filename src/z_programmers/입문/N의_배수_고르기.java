package z_programmers.입문;

import java.util.*;

/**
 * 문제 설명
 * 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 10,000
 * 1 ≤ numlist의 크기 ≤ 100
 * 1 ≤ numlist의 원소 ≤ 100,000
 *
 * 입출력 예
 * n	numlist	                                result
 * 3	[4, 5, 6, 7, 8, 9, 10, 11, 12]	        [6, 9, 12]
 * 5	[1, 9, 3, 10, 13, 5]	                [10, 5]
 * 12	[2, 100, 120, 600, 12, 12]	            [120, 600, 12, 12]
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * numlist에서 3의 배수만을 남긴 [6, 9, 12]를 return합니다.
 *
 * 입출력 예 #2
 * numlist에서 5의 배수만을 남긴 [10, 5]를 return합니다.
 *
 * 입출력 예 #3
 * numlist에서 12의 배수만을 남긴 [120, 600, 12, 12]를 return합니다.
 */
public class N의_배수_고르기 {
    public static void main(String[] args) {
        int N = 5;
        int[] numList = {1, 9, 3, 10, 13, 5};
        int[] answer = solution(N, numList);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int N, int[] numList) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < numList.length; i++) {
            if(numList[i] % N == 0) {
                answer.add(numList[i]);
            }
        }
        int[] answerArray = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            answerArray[i] = answer.get(i);
        }
        return answerArray;
    }
}
