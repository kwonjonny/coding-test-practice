package recursive_tree_graph_dfs_bfs;

/**
 * 문제 설명:
 *
 * 경로 탐색 (인접 행렬)
 *
 * 방향 그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는
 * 프로그램을 작성하세요. 아래 그래프에서 1번 정점에서 5번 정점으로 가는 가지수는
 *
 *
 * 1 <-> 2 -> 5
 * |  X  |
 * 3  -> 4
 *
 * 1 2 3 4 5
 * 1 2 5
 * 1 3 4 2 5
 * 1 3 4 5
 * 1 4 2 5
 * 1 4 5
 * 총 6 가지 입니다
 *
 * 입력 설명
 * 첫 번째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다
 * 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.
 *
 * 출력 설명
 * 총 가지수를 출력한다.
 *
 * 입력 예제 1
     5 9
     1 2
     1 3
     1 4
     2 1
     2 3
     2 5
     3 4
     4 2
     4 5
 */
import java.util.*;

public class DFS_4 {

    public static class DFS4 {
        public static int check[];
        public static int graph[][];
        public static int N, T, answer = 0;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            check = new int[N + 1];
            graph = new int[N + 1][N + 1];
            for(int i = 0; i < T; i++) {
                int M = scan.nextInt();
                int K = scan.nextInt();
                graph[M][K] = 1;
            }
            check[1] = 1;
            DFS(1);
            System.out.println(answer);
        }
        public static void DFS(int V) {
            if(V == N) answer++;
            else {
                for(int i = 1; i <= N; i++) {
                    if(graph[V][i] == 1 && check[i] == 0) {
                        check[i] = 1;
                        DFS(i);
                        check[i] = 0;
                    }
                }
            }
        }
    }

}
