package java_알고리즘_문제풀이_입문_코딩테스트_대비.정렬_이분검색과_결정알고리즘;

/**
 * 2. 버블 정렬
 * 설명
 * <p>
 * N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 * <p>
 * 정렬하는 방법은 버블정렬입니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
 * <p>
 * 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 오름차순으로 정렬된 수열을 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    6
    13 5 11 7 23 15
 * 예시 출력 1
 * <p>
 * 5 7 11 13 15 23
 */

import java.util.*;

public class B_버블정렬2 {

    /**
     * 재 복습: 2025-05-13
     */
    public static class B_버블정렬2_3 {
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
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N - 1; j++) {
                    if(array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            for(int x: array) {
                System.out.print(x + " ");
            }
        }
    }


    /**
     * 재 복습: 2025-04-03
     */
    public static class B_버블정렬2_2 {
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
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N - 1; j++) {
                    if(array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            for(int x : array) {
                System.out.print(x + " ");
            }
        }
    }


    /**
     * 재 복습: 2025-03-05
     */
    public static class B_버블정렬2_1 {
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
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N - 1; j++) {
                    if(array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }

            return array;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        int[] answer = solution(N ,array);
        for(int x : answer) {
            System.out.print(x + " ");
        }
    }
    public static int[] solution(int N, int[] array) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
