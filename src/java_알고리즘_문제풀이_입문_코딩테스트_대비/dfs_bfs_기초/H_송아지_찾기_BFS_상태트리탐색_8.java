package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_기초;

/**
 * 8. 송아지 찾기 1(BFS : 상태트리탐색)
 * 설명
 * <p>
 * 현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
 * <p>
 * 현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
 * <p>
 * 송아지는 움직이지 않고 제자리에 있다.
 * <p>
 * 현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
 * <p>
 * 최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    5 14
 * 예시 출력 1
 * <p>
 * 3
 */

import java.util.*;

public class H_송아지_찾기_BFS_상태트리탐색_8 {

    /**
     * 재 복습: 2025-03-04
     */
    public static class H_송아지_찾기_BFS_상태트리탐색_8_1 {
        static int[] distance = {-1, 1, 5};
        static int[] check;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            int answer = BFS(N, T);
            System.out.println(answer);
        }
        public static int BFS(int N, int T) {
            check = new int[10001];
            int level = 0;
            Queue<Integer> Q = new LinkedList<>();
            Q.offer(N);
            while(!Q.isEmpty()) {
                int length = Q.size();
                for(int i = 0; i < length; i++) {
                    int x = Q.poll();
                    if(x == T) {
                        return level;
                    }
                    for(int j = 0; j < 3; j++) {
                        int nx = x + distance[j];
                        if(nx >= 1 && nx <= 10000 && check[nx] == 0) {
                            check[nx] = 1;
                            Q.offer(nx);
                        }
                    }
                }
                level++;
            }
            return level;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();
        BFS(N, T);
        System.out.println(answer);
    }
    public static void BFS(int N, int T) {
        check = new int[10001];
        Queue<Integer> Q = new LinkedList<>();
        check[N] = 1;
        int level = 0;
        Q.offer(N);
        while (!Q.isEmpty()) {
            int length = Q.size();
            for (int i = 0; i < length; i++) {
                int x = Q.poll();
                if (x == T) {
                    answer = level;
                    break;
                }
                for (int j = 0; j < 3; j++) {
                    int nx = x + distance[j];
                    if (nx >= 1 && nx <= 10000 && check[nx] == 0) {
                        check[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            level++;
        }
    }
    static int answer;
    static int[] distance = {-1, 1, 5};
    static int[] check;
}
