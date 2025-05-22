package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_기초;

/**
 * 1. 재귀함수
 * <p>
 * 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요.
 * <p>
 * 입력설명
 * 첫 번째 줄은 정수 N(3<=N<=10)이 입력된다.
 * <p>
 * 출력 설명
 * 첫째 줄에 출력한다.
 * <p>
 * 입력 예제 1
    3
 * <p>
 * 출력 예제 1
 * 1 2 3
 */

import java.util.*;

public class A_재귀함수1 {

    /**
     * 재 복습: 2025-05-22
     */
    public static class A_재귀함수1_4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            DFS(N);
        }
        public static void DFS(int N) {
            if(N == 0) return;
            else {
                DFS(N - 1);
                System.out.print(N + " ");
            }
        }
    }


    /**
     * 재 복습: 2025-05-16
     */
    public static class A_재귀함수1_3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            DFS(N);
        }
        public static void DFS(int N) {
            if(N == 0) return;
            else {
                DFS(N - 1);
                System.out.print(N + " ");
            }
        }
    }


    /**
     * 재 복습: 2025-05-09
     */
    public static class A_재귀함수1_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            DFS(N);
        }
        public static void DFS(int N) {
            if(N == 0) return;
            else {
                DFS(N - 1);
                System.out.print(N + " ");
            }
        }
    }


    /**
     * 재 복습: 2025-03-14
     */
    public static class A_재귀함수1_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            DFS(N);
        }
        public static void DFS(int N) {
            if(N == 0) return;
            else {
                DFS(N - 1);
                System.out.print(N + " 3");;
            }
        }
    }


    /**
     * 재 복습: 2025-03-05
     */
    public static class A_재귀함수_1_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            DFS(N);
        }
        public static void DFS(int N) {
            if(N == 0) return;
            else {
                DFS(N - 1);
                System.out.print(N + " ");
            }
        }
    }


    /**
     * 재 복습: 2025-03-04
     */
    public static class A_재귀함수_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            DFS(N);
        }
        public static void DFS(int N) {
            if(N == 0) return;
            else {
                DFS(N - 1);
                System.out.print(N + " ");
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        DFS(N);
    }
    public static void DFS(int N) {
        if(N == 0) return;
        else {
            DFS(N - 1);
            System.out.print(N + " ");
        }
    }
}
