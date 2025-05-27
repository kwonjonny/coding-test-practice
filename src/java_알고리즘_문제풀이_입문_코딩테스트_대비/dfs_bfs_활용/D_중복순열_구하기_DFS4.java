package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_활용;

import java.util.Scanner;

/**
 * 4. 중복순열 구하기 DFS
 *
 * 1부터 N까지 번호가 적힌 구슬이 있습니다. 이 중 중복을 허용하여 M번을 뽑아 일렬로 나열 하는 방법을 모두 출력합니다.
 *
 * 입력설명
 * 첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N)이 주어집니다.
 *
 * 출력설명
 * 첫 번째 줄에 결과를 출력합니다.
 * 출력순서는 사전순으로 오름차순으로 출력합니다.
 *
 * 입력예제 1
    3 2
 *
 * 출력예제 1
 * 1 1
 * 1 2
 * 1 3
 * 2 1
 * 2 2
 * 2 3
 * 3 1
 * 3 2
 * 3 3
 */
public class D_중복순열_구하기_DFS4 {

    /**
     * 재 복습: 2025-05-27
     */
    public static class D_중복순열_구하기_DFS4_2 {
        static int N;
        static int M;
        static int[] PM;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            M = scan.nextInt();
            PM = new int[M];
            DFS(0);
        }
        public static void DFS(int level) {
            if(level == M) {
                for(int x : PM) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            else {
                for(int i = 1; i <= N; i++) {
                    PM[level] = i;
                    DFS(level + 1);
                }
            }
        }
    }


    /**
     * 재 복습: 2025-03-06
     */
    public static class D_중복순열_구하기_DFS4_1 {
        static int N;
        static int M;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            M = scan.nextInt();
            int[] array = new int[M];
            DFS(0, array);
        }
        public static void DFS(int level, int[] array) {
            if(level == M) {
                for(int x : array) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            else {
                for(int i = 1; i <= N; i++) {
                    array[level] = i;
                    DFS(level + 1, array);
                }
            }
        }
    }


    static int N;
    static int M;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        int[] array = new int[M];
        DFS(0, array);
    }
    public static void DFS(int level, int[] array) {
        if(level == M) {
            for(int x : array) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else {
            for(int i = 1; i <= N; i++) {
                array[level] = i;
                DFS(level + 1,array);
            }
        }
    }
}
