package java_알고리즘_문제풀이_입문_코딩테스트_대비.정렬_이분검색과_결정알고리즘;

/**
 * 5. 중복 확인
 * 설명
 * <p>
 * 현수네 반에는 N명의 학생들이 있습니다.
 * <p>
 * 선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어 내라고 했습니다.
 * <p>
 * 만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고,
 * <p>
 * N명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 번째 줄에 자연수 N(5<=N<=100,000)이 주어진다.
 * <p>
 * 두 번째 줄에 학생들이 적어 낸 N개의 자연수가 입력된다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 번째 줄에 D 또는 U를 출력한다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     8
     20 25 52 30 39 33 43 33
 * 예시 출력 1
 * <p>
 * D
 */

import java.util.*;

public class E_중복_확인5 {

    /**
     * 재 복습: 2025-04-08
     */
    public static class E_중복_확인_5_2 {
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
            Arrays.sort(array);
            String answer = "U";
            for(int i = 0; i < N - 1; i++) {
                if(array[i] == array[i + 1]) {
                    answer = "D";
                    break;
                }
            }
            System.out.println(answer);
        }
    }


    /**
     * 재 복습: 2025-03-05
     */
    public static class E_중복_확인_5_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            String answer = solution(N, array);
            System.out.println(answer);
        }
        public static String solution(int N, int[] array) {
            Arrays.sort(array);
            for(int i = 0; i < N - 1; i++) {
                if(array[i] == array[i + 1]) {
                    return "D";
                }
            }
            return "U";
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        String answer = solution(N, array);
        System.out.println(answer);
    }
    public static String solution(int N, int[] array) {
        Arrays.sort(array);
        for(int i = 0; i < N - 1; i++) {
            if(array[i] == array[i + 1]) {
                return "D";
            }
        }
        return "U";
    }
}
