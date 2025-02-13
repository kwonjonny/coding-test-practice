package z_programmers.기초;

import java.util.*;

/**
 * 문제 설명
 * 정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 2 ≤ num_list의 길이 ≤ 10
 * 1 ≤ num_list의 원소 ≤ 9
 *
 * 입출력 예
 * num_list	            result
 * [2, 1, 6]	        [2, 1, 6, 5]
 * [5, 2, 1, 7, 5]	    [5, 2, 1, 7, 5, 10]
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 마지막 원소인 6이 그전 원소인 1보다 크기 때문에 6 - 1인 5를 추가해 return합니다.
 * 입출력 예 #2
 * 마지막 원소인 5가 그전 원소인 7보다 크지 않기 때문에 5의 두 배인 10을 추가해 return합니다.
 */
public class 마지막_두_원소 {
    public static void main(String[] args) {
        int[] numList = {5, 2, 1, 7, 5};
        int[] answer = solution(numList);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int[] numList) {
        List<Integer> answer = new ArrayList<>();
        int L = numList[numList.length - 1];
        int L2 = numList[numList.length - 2];
        int result = 1;
        if(L > L2) {
            result = L - L2;
        }
        else result = L * 2;

        System.out.println(result);
        for (int j : numList) {
            answer.add(j);
        }
        answer.add(result);
        return answer.stream().mapToInt(e -> e).toArray();
    }
}
