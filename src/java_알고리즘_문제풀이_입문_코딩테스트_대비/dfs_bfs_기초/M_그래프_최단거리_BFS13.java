package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_기초;

/**
 * 13. 그래프 최단거리 (BFS)
 * <p>
 * 다음 그래프에서 1 번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요.
 * <p>
 * 1 <- 2 ->  5
 * |  \    X  |
 * 3 -> 4  -> 6
 * <p>
 * 입력설명
 * 첫째 줄에는 저엄의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.
 * <p>
 * 출력설명
 * 1번 정점에서 각 정점으로 가는 최소 간선수를 2번 정점부터 차례대로 출력하세요.
 * <p>
 * 입력예제1
     6 9
     1 3
     1 4
     2 1
     2 5
     3 4
     4 5
     4 6
     6 2
     6 5
 * <p>
 * 출력예제1
 * 2 : 3
 * 3 : 1
 * 4 : 1
 * 5 : 2
 */

import java.util.*;

public class M_그래프_최단거리_BFS13 {

    /**
     * 레벨 별 탐색 로직
     */
    public static class M_그래프_최단거리_BFS13_1 {
        static int[] distance;
        static int[] check;
        static List<List<Integer>> graph;
        static int N;
        static int T;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            graph = new ArrayList<>();
            check = new int[N + 1];
            distance = new int[N + 1];
            for(int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }
            for(int i = 0; i < T; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                graph.get(a).add(b);
            }
            BFS(1);
            for(int i = 2; i < N; i++) {
                System.out.println(i + " : " + distance[i]);
            }
        }
        public static void BFS(int V) {
            Queue<Integer> Q = new LinkedList<>();
            int level = 0;
            Q.offer(V);
            check[V] = 1;
            distance[V] = 1;
            while(!Q.isEmpty()) {
                int length = Q.size();
                for(int i = 0; i < length; i++) {
                    int x = Q.poll();
                    for(int cv : graph.get(x)) {
                        if(check[cv] == 0) {
                            check[cv] = 1;
                            distance[cv] = level + 1;
                            Q.offer(cv);
                        }
                    }
                }
                level++;
            }
        }
    }

    
    static int[] check;
    static int[] distance;
    static List<List<Integer>> graph;
    static int N;
    static int T;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        T = scan.nextInt();
        check = new int[N + 1];
        distance = new int[N + 1];
        graph = new ArrayList<>();
        for(int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < T; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph.get(a).add(b);
        }
        BFS(1);
        for(int i = 2; i < N; i++) {
            System.out.println(i + " : " + distance[i]) ;
        }
    }
    public static void BFS(int V) {
        Queue<Integer> Q = new LinkedList<>();
        check[V] = 1;
        distance[V] = 0;
        Q.offer(V);
        while(!Q.isEmpty()) {
            int currentValue = Q.poll();
            for(int nv : graph.get(currentValue)) {
                if(check[nv] == 0) {
                    distance[nv] = distance[currentValue] + 1;
                    check[nv] = 1;
                    Q.offer(nv);
                }
            }
        }
    }
}
