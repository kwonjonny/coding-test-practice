package z_programmers.기초;

import java.util.*;

/**
 * 문제 설명
 * 정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 6 ≤ num_list의 길이 ≤ 30
 * 1 ≤ num_list의 원소 ≤ 100
 * 입출력 예
 * num_list	result
 * [12, 4, 15, 46, 38, 1, 14, 56, 32, 10]	[15, 32, 38, 46, 56]
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * [12, 4, 15, 46, 38, 1, 14, 56, 32, 10]를 정렬하면 [1, 4, 10, 12, 14, 15, 32, 38, 46, 56]이 되고, 앞에서 부터 6번째 이후의 수들을 고르면 [15, 32, 38, 46, 56]가 됩니다.
 */
public class 뒤에서_5등_위로 {
    public static void main(String[] args) {
        int[] numList = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        int[] answer = solution(numList);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int[] numList) {
        Arrays.sort(numList);
        List<Integer> answer = new ArrayList<>();
        for(int i = 5; i < numList.length; i++) {
            answer.add(numList[i]);
        }
        return answer.stream().mapToInt(e -> e).toArray();
    }
}
