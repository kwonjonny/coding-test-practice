package java_알고리즘_문제풀이_입문_코딩테스트_대비.배열1_2차원;

/**
 * 8. 등수구하기
 * 설명
 * <p>
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 * <p>
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 * <p>
 * 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 입력된 순서대로 등수를 출력한다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     5
     87 89 92 100 76
 * 예시 출력 1
 * <p>
 * 4 3 2 1 5
 */

import java.util.*;

public class H_등수구하기8 {

    /**
     * 재 복습: 2025-07-29
     */
    public static class H_등수구하기8_1 {
        public static void solution(int N, int[] array) {
            List<Integer> answer = new ArrayList<>();
            for(int i = 0; i < N; i++) {
                int cnt = 1;
                for(int j = 0; j < N; j++) {
                    if(array[i] < array[j]) {
                        cnt++;
                    }
                }
                answer.add(cnt);
            }
            for(int x : answer) {
                System.out.print(x + " ");
            }
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            solution(N, array);
        }
    }

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
        int[] answer = new int[N];
        for(int i = 0; i < N; i++) {
            int score = 1;
            for(int j = 0; j < N; j++) {
                if(array[i] < array[j]) {
                    score++;
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}
