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
     * 재 복습: 2025-03-14
     */
    public static class M_그래프_최단거리_BFS13_3 {
        static List<List<Integer>> graph;
        static int N;
        static int T;
        static int[] check;
        static int[] distance;
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
        public static void BFS(int level) {
            Queue<Integer> Q = new LinkedList<>();
            Q.offer(level);
            check[level] = -1;
            while(!Q.isEmpty()) {
                int nx = Q.poll();
                for(int nv : graph.get(nx)) {
                    if(check[nv] == 0) {
                        distance[nv] = distance[nx] + 1;
                        check[nv] = 1;
                        Q.offer(nv);
                    }
                }
            }
        }
    }

    /**
     * 재 복습: 2025-03-08
     */
    public static class M_그래프_최단거리_BFS13_2 {
        static int[] distance;
        static int[] check;
        static int N;
        static int T;
        static List<List<Integer>> graph;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            graph = new ArrayList<>();
            distance = new int[N + 1];
            check = new int[N + 1];
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
        public static void BFS(int L) {
            Queue<Integer> Q = new LinkedList<>();
            Q.offer(L);
            check[L] = - 1;
            while(!Q.isEmpty()) {
                int nx = Q.poll();
                for(int nv : graph.get(nx)) {
                    if(check[nv] == 0) {
                        check[nv] = 1;
                        distance[nv] = distance[nx] + 1;
                        Q.offer(nv);
                    }
                }
            }
        }
    }

    /**
     * 재 복습: 2025-03-04
     */
    public static class M_그래프_최단거리_BFS13_1 {
        static int[] check;
        static int[] distance;
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
            check[V] = 1;
            distance[V] = 0;
            Q.offer(V);
            while(!Q.isEmpty()) {
                int cv = Q.poll();
                for(int nv : graph.get(cv)) {
                    if(check[nv] == 0) {
                        check[nv] = 1;
                        distance[nv] = distance[cv] + 1;
                        Q.offer(nv);
                    }
                }
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
