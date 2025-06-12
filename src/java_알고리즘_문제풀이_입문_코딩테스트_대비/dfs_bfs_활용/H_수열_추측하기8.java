package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_활용;

/**
 * 8. 수열 추측하기
 * 설명
 *
 * 가장 윗줄에 1부터 N까지의 숫자가 한 개씩 적혀 있다. 그리고 둘째 줄부터 차례대로 파스칼의 삼각형처럼 위의 두개를 더한 값이 저장되게 된다.
 *
 * 예를 들어 N이 4 이고 가장 윗 줄에 3 1 2 4 가 있다고 했을 때, 다음과 같은 삼각형이 그려진다.
 *
 *
 * 3 1  2 4
 *  4  3  6
 *   7  9
 *    16
 *
 * N과 가장 밑에 있는 숫자가 주어져 있을 때 가장 윗줄에 있는 숫자를 구하는 프로그램을 작성하시오.
 *
 * 단, 답이 여러가지가 나오는 경우에는 사전순으로 가장 앞에 오는 것을 출력하여야 한다.
 *
 *
 * 입력
 *
 * 첫째 줄에 두개의 정수 N(1≤N≤10)과 F가 주어진다.
 *
 * N은 가장 윗줄에 있는 숫자의 개수를 의미하며 F는 가장 밑에 줄에 있는 수로 1,000,000 이하이다.
 *
 *
 * 출력
 *
 * 첫째 줄에 삼각형에서 가장 위에 들어갈 N개의 숫자를 빈 칸을 사이에 두고 출력한다.
 *
 * 답이 존재하지 않는 경우는 입력으로 주어지지 않는다.
 *
 *
 * 예시 입력 1
 * 4 16
 *
 * 예시 출력 1
 * 3 1 2 4
 */

import java.util.Scanner;

public class H_수열_추측하기8 {
    static int N;
    static int T;
    static int[] pm, check, array;
    static boolean flag = false;
    static int[][] dy = new int[35][35];
    public static int combi(int N, int T) {
        if(dy[N][T] > 0) return dy[N][T];
        if(N == T || T == 0) return 1;
        else {
            return dy[N][T] = combi(N - 1, T - 1) + combi(N - 1, T);
        }
    }
    public static void DFS(int L, int sum) {
        if(flag) return;
        if(L == N) {
            if(sum == T) {
                for(int x : array) System.out.print(x + " ");
                flag = true;
            }
        }
        else {
            for(int i = 1; i <= N; i++) {
                if(check[i] == 0) {
                    check[i] = 1;
                    array[L] = i;
                    DFS(L + 1, sum + (array[L] * pm[L]));
                    check[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        T = scan.nextInt();
        pm = new int[N];
        check = new int[N + 1];
        array = new int[N];
        for(int i = 0; i < N; i++) {
            pm[i] = combi(N - 1, i);
        }
        DFS(0, 0);
    }
}
