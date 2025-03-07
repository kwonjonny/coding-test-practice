package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_기초;

/**
 * 4. 피보나치 수열
 * <p>
 * 1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수 이다 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 * <p>
 * 입력설명
 * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 * <p>
 * 출력설명
 * 첫 줄에 피보나치 수열을 출력합니다.
 * <p>
 * 입력예제 1
    10
 * <p>
 * 출력예제 1
 * 1 1 2 3 5 8 13 21 34 55
 */

import java.util.*;

public class D_피보나치_수열4 {

    /**
     * 재 복습: 2025-03-07
     */
    public static class D_피보나치_수열4_3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            fibo = new int[N + 1];
            DFS(N);
            for(int i = 1; i <= N; i++) {
                System.out.print(fibo[i] + " ");
            }
        }
        static int[] fibo;
        public static int DFS(int N) {
            if(fibo[N] != 0) return fibo[N];
            if(N == 1) return fibo[N] = 1;
            if(N == 2) return fibo[N] = 1;
            else {
                return fibo[N] = DFS(N - 2) + DFS(N - 1);
            }
        }
    }
    

    /**
     * 재 복습: 2025-03-05
     */
    public static class D_피보나치_수열4_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            fibo = new int[N + 1];
            DFS(N);
            for(int i = 1; i <= N; i++) {
                System.out.print(fibo[i] + " ");
            }
        }
        static int[] fibo;
        public static int DFS(int N) {
            if(fibo[N] != 0) return fibo[N];
            if(N == 1) return fibo[N] = 1;
            if(N == 2) return fibo[N] = 1;
            else return fibo[N] = DFS(N - 2) + DFS(N - 1);
        }
    }


    /**
     * 재 복습: 2025-03-04
     */
    public static class D_피보나치_수열4_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            fibo = new int[N + 1];
            DFS(N);
            for(int i = 1; i <= N; i++) {
                System.out.print(fibo[i] + " ");
            }
        }
        static int[] fibo;
        public static int DFS(int N) {
            if(fibo[N] != 0) return fibo[N];
            if(N == 1) return fibo[N] = 1;
            if(N == 2) return fibo[N] = 1;
            else return fibo[N] = DFS(N - 2) + DFS(N - 1);
        }
    }


    static int[] fibo;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        fibo = new int[N + 1];
        DFS(N);
        for(int i = 1; i <= N; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
    public static int DFS(int N) {
        if(fibo[N] != 0) return fibo[N];
        if(N == 1) return fibo[N] = 1;
        if(N == 2) return fibo[N] = 1;
        else return fibo[N] = DFS(N - 2) + DFS(N - 1);
    }
}
