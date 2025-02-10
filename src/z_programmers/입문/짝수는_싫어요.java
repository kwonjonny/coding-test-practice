package z_programmers.입문;

import java.util.*;

/**
 * 문제 설명
 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 100
 * 입출력 예
 * n	result
 * 10	[1, 3, 5, 7, 9]
 * 15	[1, 3, 5, 7, 9, 11, 13, 15]
 * 입출력 예 설명
 *
 * 입출력 #1
 * 10 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9]를 return합니다.
 *
 * 입출력 #1
 * 15 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9, 11, 13, 15]를 return합니다.
 */
public class 짝수는_싫어요 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] answer = solution(n);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) answer.add(i);
        }
        int[] answerArray = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
            answerArray[i] = answer.get(i);
        }
        return answerArray;
    }
}
