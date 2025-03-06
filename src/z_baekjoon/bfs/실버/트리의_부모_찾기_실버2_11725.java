package z_baekjoon.bfs.실버;

import java.util.*;

public class 트리의_부모_찾기_실버2_11725 {
    static int N;
    static List<List<Integer>> graph;
    static int[] parent;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        parent = new int[N + 1];
        graph = new ArrayList<>();

        for(int i = 0; i <= N; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < N - 1; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        BFS(1);
        for(int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
    }
    public static void BFS(int level) {
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(level);
        parent[level] = - 1;
        while(!Q.isEmpty()) {
            int nx = Q.poll();
            for(int nv : graph.get(nx)) {
                if(parent[nv] == 0) {
                    parent[nv] = nx;
                    Q.offer(nv);
                }
            }
        }
    }
}
