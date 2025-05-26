package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_활용;

/**
 * 2. 바둑이 승차(DFS)
 * 설명
 * <p>
 * 철수는 그의 바둑이들을 데리고 시장에 가려고 한다. 그런데 그의 트럭은 C킬로그램 넘게 태울수가 없다.
 * <p>
 * 철수는 C를 넘지 않으면서 그의 바둑이들을 가장 무겁게 태우고 싶다.
 * <p>
 * N마리의 바둑이와 각 바둑이의 무게 W가 주어지면, 철수가 트럭에 태울 수 있는 가장 무거운 무게를 구하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 번째 줄에 자연수 C(1<=C<=100,000,000)와 N(1<=N<=30)이 주어집니다.
 * <p>
 * 둘째 줄부터 N마리 바둑이의 무게가 주어진다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 번째 줄에 가장 무거운 무게를 출력한다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     259 5
     81
     58
     42
     33
     61
 * 예시 출력 1
 * <p>
 * 242
 */

import java.util.*;

public class B_바둑이_승차_DFS2 {

    /**
     * 재 복습: 2025-05-26
     */
    public static class B_바둑이_승차DFS2_5 {
        static int T;
        static int N;
        static int max = 0;
        static int[] array;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            T = scan.nextInt();
            N = scan.nextInt();
            array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            DFS(0, array, 0);
            System.out.println(max);
        }
        public static void DFS(int sum, int[] array, int level) {
            if(sum > T) return;
            if(level == N) {
                max = Math.max(max, sum);
            }
            else {
                DFS(array[level] + sum, array, level + 1);
                DFS(sum, array, level + 1);
            }
        }
    }


    /**
     * 재 복습: 2025-03-26
     */
    public static class B_바둑이_승차DFS2_4 {
        static int T;
        static int N;
        static int answer = 0;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            T = scan.nextInt();
            N = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            DFS(0, array, 0);
            System.out.println(answer);
        }
        public static void DFS(int level, int[] array, int sum) {
            if(sum > T) return;
            if(level == N) {
                answer = Math.max(answer, sum);
            }
            else {
                DFS(level + 1, array, sum + array[level]);
                DFS(level + 1, array, sum);
            }
        }
    }


    /**
     * 재 복습: 2025-03-14
     */
    public static class B_바둑이_승차_DFS2_3 {
        static int N;
        static int T;
        static int answer = 0;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            int[] array = new int[T];
            for(int i = 0; i < T; i++) {
                array[i] = scan.nextInt();
            }
            DFS(0, 0, array);
            System.out.println(answer);
        }
        public static void DFS(int level, int sum, int[] array) {
            if(sum > N) return;
            if(level == T) {
                answer = Math.max(answer, sum);
            }
            else {
                DFS(level + 1, sum + array[level], array);
                DFS(level + 1, sum, array);
            }
        }
    }


    /**
     * 재 복습: 2025-03-07
     */
    public static class B_바둑이_승차_DFS2_2 {
        static int weight;
        static int N;
        static int answer = 0;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            weight = scan.nextInt();
            N = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            DFS(0, 0, array);
            System.out.println(answer);
        }
        public static void DFS(int level, int sum, int[] array) {
            if(sum > weight) return;
            if(level == N) {
                answer = Math.max(answer, sum);
            }
            else {
                DFS(level + 1, sum + array[level], array);
                DFS(level + 1, sum, array);
            }
        }
    }


    /**
     * 재 복습: 2025-03-06
     */
    public static class B_바둑이_승차_DFS2_1 {
        static int N;
        static int weight;
        static int answer = Integer.MIN_VALUE;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            weight = scan.nextInt();
            N = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            DFS(0, 0, array);
            System.out.println(answer);
        }
        public static void DFS(int level, int sum, int[] array) {
            if(sum > weight) return;
            if(N == level) {
                answer = Math.max(answer, sum);
            }
            else {
                DFS(level + 1, sum + array[level], array);
                DFS(level + 1, sum, array);
            }
        }
    }


    static int answer = Integer.MIN_VALUE;
    static int N;
    static int weight;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        weight = scan.nextInt();
        N = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        DFS(0,0, array);
        System.out.println(answer);
    }
    public static void DFS(int level, int sum, int[] array) {
        if(sum > weight) return;
        if(level == N) {
           answer = Math.max(answer, sum);
        }
        else {
            DFS(level + 1, sum + array[level], array);
            DFS(level + 1, sum, array);
        }
    }
}
