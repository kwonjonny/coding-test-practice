package z_programmers.입문;

import java.util.*;

/**
 * 문제 설명
 * 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 1 ≤ array의 길이 ≤ 100
 * 0 ≤ array 원소 ≤ 1,000
 * array에 중복된 숫자는 없습니다.
 *
 * 입출력 예
 * array	        result
 * [1, 8, 3]	    [8, 1]
 * [9, 10, 11, 8]	[11, 2]
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 1, 8, 3 중 가장 큰 수는 8이고 인덱스 1에 있습니다.
 *
 * 입출력 예 #2
 * 9, 10, 11, 8 중 가장 큰 수는 11이고 인덱스 2에 있습니다.
 */
public class 가장_큰_수_찾기 {
    public static void main(String[] args) {
        int[] array = {1, 8, 3};
        int[] answer = solution(array);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int[] array) {
        List<Integer> answer = new ArrayList<>();
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        answer.add(max);
        answer.add(maxIndex);
        return answer.stream()
                .mapToInt(e -> e)
                .toArray();
    }
}
