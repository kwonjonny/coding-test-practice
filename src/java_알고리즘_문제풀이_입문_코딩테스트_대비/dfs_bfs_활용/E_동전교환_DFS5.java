package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_활용;

/**
 * 5. 동전교환
 * 설명
 * <p>
 * 다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가?
 * <p>
 * 각 단위의 동전은 무한정 쓸 수 있다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 번째 줄에는 동전의 종류개수 N(1<=N<=12)이 주어진다. 두 번째 줄에는 N개의 동전의 종류가 주어지고,
 * <p>
 * 그 다음줄에 거슬러 줄 금액 M(1<=M<=500)이 주어진다.각 동전의 종류는 100원을 넘지 않는다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 번째 줄에 거슬러 줄 동전의 최소개수를 출력한다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     3
     1 2 5
     15
 * 예시 출력 1
 * <p>
 * 3
 * 힌트
 */

import java.util.*;

public class E_동전교환_DFS5 {

    /**
     * 재 복습: 2025-06-02
     */
    public static class E_동전교환_DFS5_3 {
        static int N;
        static Integer[] array;
        static int T;
        static int answer = Integer.MAX_VALUE;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            array = new Integer[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            Arrays.sort(array, Collections.reverseOrder());
            T = scan.nextInt();
            DFS(0, 0);
            System.out.println(answer);
        }
        public static void DFS(int level, int sum) {
            if(sum > T) return;
            if(level >= T) return;
            if(sum == T) {
                answer = Math.min(answer, level);
            }
            else {
               for(int i = 0; i < N; i++) {
                   DFS(level + 1, sum + array[i]);
               }
            }
        }
    }


    /**
     * 재 복습: 2025-05-30
     */
    public static class E_동전교환_DFS5_2 {
        static int N;
        static int T;
        static int answer = Integer.MAX_VALUE;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            Integer[] array = new Integer[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            Arrays.sort(array, Collections.reverseOrder());
            T = scan.nextInt();
            DFS(0, 0, array);
            System.out.println(answer);
        }
        public static void DFS(int level, int sum, Integer[] array) {
            if(sum > T) return;
            if(level >= T) return;
            if(sum == T) {
                answer = Math.min(answer, level);
            }
            else {
                for(int i = 0; i < N; i++) {
                    DFS(level + 1, array[i] + sum, array);
                }
            }
        }
    }


    /**
     * 재 복습: 2025-05-29
     */
    public static class E_동정교환_DFS5_1 {
        static int N;
        static Integer[] array;
        static int T;
        static int answer = Integer.MAX_VALUE;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            array = new Integer[N];
            for (int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            T = scan.nextInt();
            Arrays.sort(array, Collections.reverseOrder());
            DFS(0, 0, array);
            System.out.println(answer);
        }
        public static void DFS(int level, int sum, Integer[] array) {
            if (sum > T) return;
            if (level >= T) return;
            if (sum == T) {
                answer = Math.min(answer, level);
            } else {
                for (int i = 0; i < N; i++) {
                    DFS(level + 1, sum + array[i], array);
                }
            }
        }
    }


    static int N;
    static int T;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        Integer[] array = new Integer[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        Arrays.sort(array, Collections.reverseOrder());
        T = scan.nextInt();
        DFS(0, 0, array);
        System.out.println(answer);
    }
    public static void DFS(int level, int sum, Integer[] array) {
        if (sum > T) return;
        if (level >= answer) return;
        if (sum == T) {
            answer = Math.min(answer, level);
        } else {
            for (int i = 0; i < N; i++) {
                DFS(level + 1, sum + array[i], array);
            }
        }
    }
}
