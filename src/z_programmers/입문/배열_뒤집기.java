package z_programmers.입문;

import java.util.*;

/**
 * 문제 설명
 * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ num_list의 길이 ≤ 1,000
 * 0 ≤ num_list의 원소 ≤ 1,000
 * 입출력 예
 * num_list	result
 * [1, 2, 3, 4, 5]	[5, 4, 3, 2, 1]
 * [1, 1, 1, 1, 1, 2]	[2, 1, 1, 1, 1, 1]
 * [1, 0, 1, 1, 1, 3, 5]	[5, 3, 1, 1, 1, 0, 1]
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * num_list가 [1, 2, 3, 4, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 4, 3, 2, 1]을 return합니다.
 * 입출력 예 #2
 *
 * num_list가 [1, 1, 1, 1, 1, 2]이므로 순서를 거꾸로 뒤집은 배열 [2, 1, 1, 1, 1, 1]을 return합니다.
 * 입출력 예 #3
 *
 * num_list가 [1, 0, 1, 1, 1, 3, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 3, 1, 1, 1, 0, 1]을 return합니다.
 */
public class 배열_뒤집기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numList1 = {1, 2, 3, 4, 5};
        int[] numList2 = {1, 1, 1, 1, 1, 2};
        int[] numList3 = {1, 0, 1, 1, 1, 3, 5};
        int[] answer1 = solution(numList1);
        System.out.println(Arrays.toString(answer1));
        int[] answer2 = solution(numList2);
        System.out.println(Arrays.toString(answer2));
        int[] answer3 = solution(numList3);
        System.out.println(Arrays.toString(answer3));
    }
    public static int[] solution(int[] numList) {
        int length = numList.length;
        int[] answer = new int[length];
        for(int i = 0; i < numList.length; i++) {
            answer[i] = numList[length - i - 1];
        }
        return answer;
    }
}
