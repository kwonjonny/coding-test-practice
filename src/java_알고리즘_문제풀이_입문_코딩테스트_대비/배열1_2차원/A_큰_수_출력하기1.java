package java_알고리즘_문제풀이_입문_코딩테스트_대비.배열1_2차원;

/**
 * 1. 큰 수 출력하기
 * 설명
 * <p>
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 * <p>
 * (첫 번째 수는 무조건 출력한다)
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     6
     7 3 9 5 6 12
 * 예시 출력 1
 * <p>
 * 7 9 6 12
 */

import java.util.*;

public class A_큰_수_출력하기1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        int[] answer = solution(N, array);
        for(int x : answer) {
            System.out.print(x + " ");
        }
    }
    public static int[] solution(int N, int[] array) {
        List<Integer> answer = new ArrayList<>();
        answer.add(array[0]);
        for(int i = 1; i < N; i++) {
            if(array[i] > array[i - 1]) answer.add(array[i]);

        }
        return answer.stream().mapToInt(e -> e).toArray();
    }
}
