package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_기초;

/**
 * 2. 재귀함수를 이용한 이진수 출력
 * <p>
 * 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요. 단 재귀함수를 이용해서 출력해야 합니다.
 * <p>
 * 입력설명
 * 첫 번째 줄에 10진수 N(1<=N<=1,000)이 주어집니다.
 * <p>
 * 출력설명
 * 첫 번째 줄에 이진수를 출력하세요.
 * <p>
 * 입력예제 1
    11
 * <p>
 * 출력예제 1
 * 1011
 */

import java.util.*;

public class B_재귀함수를_이용한_이진수_출력2 {

    /**
     * 재 복습: 2025-05-15
     */
    public static class B_재귀함수를_이용한_이진수_출력2_4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            DFS(N);
        }
        public static void DFS(int N) {
            if(N == 0) return;
            else {
                DFS(N / 2);
                System.out.print(N % 2);
            }
        }
    }


    /**
     * 재 복습: 2025-03-014
     */
    public static class B_재귀함수를_이용한_이진수_출력2_3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            DFS(N);
        }
        public static void DFS(int N) {
            if(N == 0) return;
            else {
                DFS(N / 2);
                System.out.print(N % 2);
            }
        }
    }


    /**
     * 재 복습: 2025-03-05
     */
    public static class B_재귀함수를_이용한_이진수_출력2_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            DFS(N);
        }
        public static void DFS(int N) {
            if(N == 0) return;
            else {
                DFS(N / 2);
                System.out.print(N % 2);
            }
        }
    }

    
    /**
     * 재 복습: 2025-03-04
     */
    public static class B_재귀함수를_이용한_이진수_출력2_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            DFS(N);
        }
        public static void DFS(int N) {
            if(N == 0) return;
            else {
                DFS(N / 2);
                System.out.print(N % 2);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        DFS(N);
    }
    public static void DFS(int N) {
        if(N == 0) return ;
        else {
           DFS(N / 2);
            System.out.print(N % 2);
        }
    }
}
