package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_활용;

import java.util.*;

/**
 * 순열 구하기
 * <p>
 * 10 이하의 N개의 자연수가 주어지면 이 중 M개를 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
 * <p>
 * 입력 설명
 * 첫 번째 줄에 자연수 N(3<=N<=10) 과 M(2<=M<=N) 이 주어집니다.
 * 두 번째 줄에 N개의 자연수가 오름차순으로 주어집니다.
 * <p>
 * 출력 설명
 * 첫 번째 줄에 결과를 출력합니다.
 * 출력순서는 사전순으로 오름차순으로 출력합니다
 * <p>
 * 입력예제1
     3 2
     3 6 9
 * <p>
 * 출력예제 1
 * 3 6
 * 3 9
 * 6 3
 * 6 9
 * 9 3
 * 9 6
 */
public class F_순열_구하기_DFS6 {

    static int N;
    static int T;
    static int[] check, array, pm;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        T = scan.nextInt();
        check = new int[N];
        array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        pm = new int[T];
        DFS(0);
    }
    public static void DFS(int level) {
        if (level == T) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 0; i < N; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    pm[level] = array[i];
                    DFS(level + 1);
                    check[i] = 0;
                }
            }
        }
    }
}
