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
