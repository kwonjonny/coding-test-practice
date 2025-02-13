package z_programmers.기초;

import java.util.*;

/**
 * 문제 설명
 * 정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 0 ≤ end_num ≤ start_num ≤ 50
 *
 * 입출력 예
 * start_num	end_num	            result
 * 10	            3	    [10, 9, 8, 7, 6, 5, 4, 3]
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 10부터 3까지 1씩 감소하는 수를 담은 리스트는 [10, 9, 8, 7, 6, 5, 4, 3]입니다.
 */
public class 카운트_다운 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startNum = scan.nextInt();
        int endNum = scan.nextInt();
        int[] answer = solution(startNum, endNum);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int startNum, int endNum) {
        List<Integer> answer = new ArrayList<>();
        for(int i = startNum; i >= endNum; i--) {
            answer.add(i);
        }
        return answer.stream().mapToInt(e -> e).toArray();
    }
}
