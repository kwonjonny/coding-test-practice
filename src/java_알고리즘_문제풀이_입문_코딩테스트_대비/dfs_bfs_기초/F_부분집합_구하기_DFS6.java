package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_기초;

/**
 * 6. 부분집합 구하기(DFS)
 * <p>
 * 자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.
 * <p>
 * 입력설명
 * 첫 번째 줄에 자연수 N(1<=N<=10)이 주어집니다.
 * <p>
 * 출력설명
 * 첫 번째 줄부터 각 줄에 하나씩 부분집합을 아래와 출력예제와 같은 순서로 출력한다
 * 단 공집합은 출력하지 않습니다.
 * <p>
 * 입력예제 1
 * 3
 * <p>
 * 출력예제 1
 * 1 2 3
 * 1 2
 * 1 3
 * 1
 * 2 3
 * 2
 * 3
 */

import java.util.*;

public class F_부분집합_구하기_DFS6 {

    /**
     * 재 복습: 2025-05-23
     */
    public static class F_부분집합_구하기DFS6_5 {
        static int N ;
        static int[] check;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            check = new int[N + 1];
            DFS(1);
        }
        public static void DFS(int level) {
            if(level == N + 1) {
                StringBuilder ret = new StringBuilder();
                for(int i = 0; i < level; i++) {
                    if(check[i] == 1) {
                        ret.append(i).append(" ");
                    }
                }
                if(!ret.isEmpty()) System.out.println(ret);
            }
            else {
                check[level] = 1;
                DFS(level + 1);
                check[level] = 0;
                DFS(level + 1);
            }
        }
    }


    /**
     * 재 복습: 2025-05-16
     */
    public static class F_부분집합_구하기DFS6_4 {
        static int N;
        static int[] check;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            check = new int[N + 1];
            DFS(1);
        }
        public static void DFS(int level) {
            if(level == N + 1) {
                StringBuilder ret = new StringBuilder();
                for(int i = 0; i < level; i++) {
                    if(check[i] == 1) {
                        ret.append(i).append(" ");
                    }
                }
                if(!ret.isEmpty()) System.out.println(ret);
            }
            else {
                check[level] = 1;
                DFS(level + 1);
                check[level] = 0;
                DFS(level + 1);
            }
        }
    }


    /**
     * 재 복습: 2025-03-19
     */
    public static class F_부분집합_구하기DFS6_3 {
        static int N;
        static int[] check;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            check = new int[N + 1];
            DFS(1);
        }
        public static void DFS(int level) {
            if(level == N + 1) {
                StringBuilder ret = new StringBuilder();
                for(int i = 0; i < level; i++) {
                    if(check[i] == 1) {
                        ret.append(i).append(" ");
                    }
                }
                if(!ret.isEmpty()) System.out.println(ret.toString());
            }
            else {
                check[level] = 1;
                DFS(level + 1);
                check[level] = 0;
                DFS(level + 1);
            }
        }
    }


    /**
     * 재 복습: 2025-03-05
     */
    public static class F_부분집합_구하기DFS6_2 {
        static int N;
        static int[] check;

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            check = new int[N + 1];
            DFS(1);
        }
        public static void DFS(int T) {
            if(T == N + 1) {
                StringBuilder ret = new StringBuilder();
                for(int i = 0; i < T; i++) {
                    if(check[i] == 1) {
                        ret.append(i).append(" ");
                    }
                }
                if(!ret.isEmpty()) {
                    System.out.println(ret.toString());
                }
            }
            else {
                check[T] = 1;
                DFS(T + 1);
                check[T] = 0;
                DFS(T + 1);
            }
        }
    }


    /**
     * 재 복습: 2025-03-04
     */
    public static class F_부분집합_구하기DFS6_1 {
        static int[] check;
        static int N;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            check = new int[N + 1];
            DFS(1);
        }
        public static void DFS(int L) {
            if(L == N + 1) {
                StringBuilder ret = new StringBuilder();
                for(int i = 0; i < L; i++) {
                    if(check[i] == 1) ret.append(i).append(" ");
                }
                if(!ret.isEmpty()) System.out.println(ret.toString());
            }
            else {
                check[L] = 1;
                DFS(L + 1);
                check[L] = 0;
                DFS(L + 1);
            }
        }
    }


    static int N;
    static int[] check;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        check = new int[N + 1];
        DFS(1);
    }
    public static void DFS(int L) {
        if (L == N + 1) {
            StringBuilder ret = new StringBuilder();
            for (int i = 1; i <= N; i++) {
                if (check[i] == 1) ret.append(i).append(" ");
            }
            if (!ret.isEmpty()) {
                System.out.println(ret.toString());
            }
        } else {
            check[L] = 1;
            DFS(L + 1);
            check[L] = 0;
            DFS(L + 1);
        }
    }
}
