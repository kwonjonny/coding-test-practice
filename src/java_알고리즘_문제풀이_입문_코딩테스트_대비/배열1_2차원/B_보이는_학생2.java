package java_알고리즘_문제풀이_입문_코딩테스트_대비.배열1_2차원;

/**
 * 2. 보이는 학생
 * 설명
 * <p>
 * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
 * <p>
 * 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 선생님이 볼 수 있는 최대학생수를 출력한다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     8
     130 135 148 140 145 150 150 153
 * 예시 출력 1
 * <p>
 * 5
 */

import java.util.*;

public class B_보이는_학생2 {

    /**
     * 재 복습: 2025-04-02
     */
    public static class B_보이는_학생2_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            solution(N, array);
        }
        public static void solution(int N, int[] array) {
            int answer = 0;
            int maxHeight = 0;
            for(int i = 0; i < N; i++) {
                if(array[i] > maxHeight) {
                    maxHeight = array[i];
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-03-06
     */
    public static class B_보이는_학생2_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            int answer = solution(N, array);
            System.out.println(answer);
        }
        public static int solution(int N, int[] array) {
            int answer = 0;
            int maxHeight = 0;
            for(int i = 0; i < N; i++) {
                if(maxHeight < array[i]) {
                    maxHeight = array[i];
                    answer++;
                }
            }
            return answer;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        int answer = solution(N, array);
        System.out.println(answer);
    }
    public static int solution(int N, int[] array) {
        int answer = 0;
        int max = 0;
        for(int i = 0; i < N; i++) {
            if(max < array[i]) {
                max = array[i];
                answer++;
            }
        }
        return answer;
    }
}
