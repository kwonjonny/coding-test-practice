package recursive_tree_graph_dfs_bfs.bfs;

import java.util.*;

/**
 * 송아지 찾기 1(BFS : 상태트리탐색)
 * 설명
 *
 * 현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
 *
 * 현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
 *
 * 송아지는 움직이지 않고 제자리에 있다.
 *
 * 현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
 *
 * 최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.
 *
 *
 * 출력
 * 점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재합니다.
 *
 *
 * 예시 입력 1
 * 5 14
 *
 * 예시 출력 1
 * 3
 */
public class BFS_2 {

    /**
     * 재 복습: 2025-02-12
     */
    public static class BFS3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int S = scan.nextInt();
            int E = scan.nextInt();
            System.out.println(BFS(S,E));
        }
        public static int BFS(int S, int E) {
            check = new int[10001];
            Queue<Integer> Q = new LinkedList<>();
            int L = 0;
            check[S] = 1;
            Q.offer(S);
            while(!Q.isEmpty()) {
                int len = Q.size();
                for(int i = 0; i < len; i++) {
                    int X = Q.poll();
                    if(X == E) return L;
                    for(int j = 0; j < 3; j++) {
                        int NX = X + cong[j];
                        if (NX >= 1 && NX <= 10000 && check[NX] == 0) {
                            check[NX] = 0;
                            Q.offer(NX);
                        }
                    }
                }
                L++;
            }
            return -1;
        }
        public static int[] check;
        public static int[] cong = {1, -1, 5};
    }

    public static class BFS2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int S = scan.nextInt();
            int E = scan.nextInt();
            int answer = BFS(S, E);
            System.out.println(answer);
        }
        public static int[] check;
        public static int[] cong = {1, -1, 5};
        public static int BFS(int S, int E) {
            check = new int[10001];
            check[S] = 1;
            int L = 0;
            Queue<Integer> Q = new LinkedList<>();
            Q.offer(S);
            while(!Q.isEmpty()) {
                int len = Q.size();
                for(int i = 0; i < len; i++) {
                    int X = Q.poll();
                    for(int j = 0; j < 3; j++) {
                        int NX = X + cong[j];
                        if(NX == E) return L + 1;
                        if(NX >= 1 && NX <= 10000 && check[NX] == 0) {
                            check[NX] = 1;
                            Q.offer(NX);
                        }
                    }
                }
                L++;
            }
            return 0;
        }
    }
}
