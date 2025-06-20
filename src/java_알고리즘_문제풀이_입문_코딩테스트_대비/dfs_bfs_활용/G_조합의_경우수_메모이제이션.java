package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_활용;

import java.util.Scanner;

/**
 * 7. 조합의 경우수(메모이제이션)
 *
 * 하지만 여러분은 이 공식을 쓰지않고 다음 공식을 사용하여 재귀를 이용해 조합수를 구해주는 프로그램을 작성하세요.
 *
 * 입력
 *
 * 첫째 줄에 자연수 n(3<=n<=33)과 r(0<=r<=n)이 입력됩니다.
 *
 *
 * 출력
 *
 * 첫째 줄에 조합수를 출력합니다.
 *
 *
 * 예시 입력 1
 * 5 3
 *
 * 예시 출력 1
 * 10
 *
 * 예시 입력 2
 * 33 19
 *
 * 예시 출력 2
 * 818809200
 */
public class G_조합의_경우수_메모이제이션 {

    /**
     * 재 복습: 2025-06-20
     */
    public static class G_조합의_경우수_메모이제이션_4 {
        static int N;
        static int T;
        static int[][] df = new int[35][35];
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            int answer = DFS(N, T);
            System.out.println(answer);
        }
        public static int DFS(int N, int T) {
            if(T == 0 || N == T) return 1;
            if(df[N][T] >= 1) return df[N][T];
            else {
                return df[N][T] = DFS(N - 1, T - 1) + DFS(N - 1, T);
            }
        }
    }


    /**
     * 재 복습: 2025-06-12
     */
    public static class G_조합의_경우수_메모이제이션_3 {
        static int N;
        static int T;
        static int[][] dy = new int[35][35];
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            int answer = DFS(N, T);
            System.out.println(answer);
        }
        public static int DFS(int N, int T) {
            if(T == 0 || N == T) return 1;
            if(dy[N][T] > 0) return dy[N][T];
            else {
                return dy[N][T] = DFS(N - 1, T - 1) + DFS(N - 1, T);
            }
        }
    }


    /**
     * 재 복습: 2025-06-11
     */
    public static class G_조합의_경우수_메모이제이션_2 {
        static int[][] dy = new int[35][35];
        static int N;
        static int T;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            int answer = DFS(N, T);
            System.out.println(answer);
        }
        public static int DFS(int N, int T) {
            if(dy[N][T] > 0) return dy[N][T];
            if(T == 0 || N == T) return 1;
            else {
                return dy[N][T] = DFS(N - 1, T - 1) + DFS(N - 1, T);
            }
        }
    }


    /**
     * 재 복습: 2025-06-05
     */
    public static class G_조합의_경우수_메모이제이션_1 {
        static int[][] dy = new int[35][35];
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int R = scan.nextInt();
            int answer = DFS(N, R);
            System.out.println(answer);
        }
        public static int DFS(int N, int R) {
            if(dy[N][R] > 0) return dy[N][R];
            if(N == R || R == 0) return 1;
            else {
                return dy[N][R] = DFS(N - 1, R - 1) + DFS(N - 1, R);
            }
        }
    }


    static int[][] dy = new int[35][35];
    static int N;
    static int T;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        T = scan.nextInt();
        int answer = DFS(N, T);
        System.out.println(answer);
    }
    public static int DFS(int N, int T) {
        if(dy[N][T] > 0) return dy[N][T];
        if(N == T || T == 0) return 1;
        else {
            return dy[N][T] = DFS(N - 1, T - 1) + DFS(N - 1, T);
        }
    }
}
