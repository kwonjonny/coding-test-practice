package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_기초;

/**
 * 12. 경로 탐색 (인접리스트)
 * <p>
 * 방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
 * 아래 그래프에서 1번 정점에서 5번 정점으로 가는 가지수는
 * 1 <-> 2 -> 5
 * |  X  |
 * 3  -> 4
 * <p>
 * 1 2 3 4 5
 * 1 2 5
 * 1 3 4 2 5
 * 1 3 4 5
 * 1 4 2 5
 * 1 4 5
 * 총 6 가지입니다.
 * <p>
 * 입력설명
 * 첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.
 * <p>
 * 출력설명
 * 총 가지수를 출력한다.
 * <p>
 * 입력예제 1
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
 * <p>
 * 출력예제 1
 * 6
 */

import java.util.*;

public class L_경로_탐색_인접리스트12 {

    /**
     * 재 복습: 2025-05-30
     */
    public static class L_경로_탐색_인접리스트12_9 {
        static int N;
        static int T;
        static int[] check;
        static List<List<Integer>> graph;
        static int answer = 0;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            graph = new ArrayList<>();
            check = new int[N + 1];
            check[1] = 1;
            for(int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }
            for(int i = 0; i < T; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                graph.get(a).add(b);
            }
            DFS(1);
            System.out.println(answer);
        }
        public static void DFS(int level) {
            if(level == N) answer++;
            else {
                for(int NX : graph.get(level)) {
                    if(check[NX] == 0) {
                        check[NX] = 1;
                        DFS(NX);
                        check[NX] = 0;
                    }
                }
            }
        }
    }


    /**
     * 재 복습:2025-05-22
     */
    public static class L_경로_탐색_인접리스트12_8 {
        static List<List<Integer>> graph;
        static int N;
        static int T;
        static int[] check;
        static int answer;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            check = new int[N + 1];
            check[1] = 1;
            graph = new ArrayList<>();
            for(int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }
            for(int i = 0; i < T; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                graph.get(a).add(b);
            }
            DFS(1);
            System.out.println(answer);
        }
        public static void DFS(int level) {
            if(level == N) answer++;
            else {
                for(int nx : graph.get(level)) {
                    if(check[nx] == 0) {
                        check[nx] = 1;
                        DFS(nx);
                        check[nx] = 0;
                    }
                }
            }
        }
    }


    /**
     * 재 복습: 2025-05-21
     */
    public static class L_경로_탐색_인접리스트12_7 {
        static List<List<Integer>> graph;
        static int N;
        static int T;
        static int answer;
        static int[] check;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            graph = new ArrayList<>();
            check = new int[N + 1];
            for(int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }
            for(int i = 0; i < T; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                graph.get(a).add(b);
            }
            check[1] = 1;
            DFS(1);
            System.out.println(answer);
        }
        public static void DFS(int level) {
            if(level == N) answer++;
            else {
                for(int nx : graph.get(level)) {
                    if(check[nx] == 0) {
                        check[nx] = 1;
                        DFS(nx);
                        check[nx] = 0;
                    }
                }
            }
        }
    }


    /**
     * 재 복습: 2025-05-20
     */
    public static class L_경로_탐색_인접리스트12_6 {
        static int N;
        static int T;
        static List<List<Integer>> graph;
        static int[] check;
        static int answer;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            graph = new ArrayList<>();
            check = new int[N  + 1];
            for(int i = 1; i <= N; i++) {
                graph.add(new ArrayList<>());
            }
            for(int i = 1; i <= T; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                graph.get(a).add(b);
            }
            DFS(1);
            System.out.println(answer);
        }
        public static void DFS(int level) {
            if(level == N) answer++;
            else {
                for(int nx : graph.get(level)) {
                    if(check[nx] == 0) {
                        check[nx] = 1;
                        DFS(nx);
                        check[nx] = 0;
                    }
                }
            }
        }
    }


    /**
     * 재 복습: 2025-03-17
     */
    public static class L_경로_탐색_인접리스트12_5 {
        static int N;
        static int T;
        static List<List<Integer>> graph;
        static int[] check;
        static int answer = 0;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            graph = new ArrayList<>();
            check = new int[N + 1];
            check[1] = -1;
            for(int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }
            for(int i = 0; i < T; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                graph.get(a).add(b);
            }
            DFS(1);
            System.out.println(answer);
        }
        public static void DFS(int level) {
            if(level == N) {
                answer++;
            }
            else {
                for(int nx : graph.get(level)) {
                    if(check[nx] == 0) {
                        check[nx] = 1;
                        DFS(nx);
                        check[nx] = 0;
                    }
                }
            }
        }
    }


    /**
     * 재 복습: 2025-03-14
     */
    public static class L_경로_탐색_인접리스트12_4 {
        static int answer = 0;
        static List<List<Integer>> graph;
        static int N;
        static int T;
        static int[] check;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            check = new int[N + 1];
            check[1] = -1;
            graph = new ArrayList<>();
            for(int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }
            for(int i = 0; i < T; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                graph.get(a).add(b);
            }
            DFS(1);
            System.out.println(answer);
        }
        public static void DFS(int level) {
            if(level == N) answer++;
            else {
                for(int nx : graph.get(level)) {
                    if(check[nx] == 0) {
                        check[nx] = 1;
                        DFS(nx);
                        check[nx] = 0;
                    }
                }
            }
        }
    }

    /**
     * 재 복습: 2025-03-07
     */
    public static class L_경로_탐색_인접리스트12_3 {
        static List<List<Integer>> graph;
        static int[] check;
        static int N;
        static int T;
        static int answer = 0;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            graph = new ArrayList<>();
            check = new int[N + 1];
            for(int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }
            for(int i = 0; i < T; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                graph.get(a).add(b);
            }
            check[1] = -1;
            DFS(1);
            System.out.println(answer);
        }
        public static void DFS(int V) {
            if(V == N) answer++;
            else {
                for(int nv : graph.get(V)) {
                    if(check[nv] == 0) {
                        check[nv] = 1;
                        DFS(nv);
                        check[nv] = 0;
                    }
                }
            }
        }
    }


    /**
     * 재 복습: 2025-03-04
     */
    public static class L_경로_탐색_인접리스트12_2 {
        static int[] check;
        static int answer;
        static List<List<Integer>> graph;
        static int N;
        static int T;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            check = new int[N + 1];
            graph = new ArrayList<>();
            for(int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }
            for(int i = 0; i < T; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                graph.get(a).add(b);
            }
            check[1] = 1;
            DFS(1);
            System.out.println(answer);
        }
        public static void DFS(int V) {
            if(V == N) answer++;
            else {
                for(int nx : graph.get(V)) {
                    if(check[nx] == 0) {
                        check[nx] = 1;
                        DFS(nx);
                        check[nx] = 0;
                    }
                }
            }
        }
    }

    /**
     * 재 복습: 2025-03-04
     */
    public static class L_경로_탐색_인접리스트12_1 {
        static List<List<Integer>> graph;
        static int answer;
        static int[] check;
        static int N;
        static int T;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            graph = new ArrayList<>();
            check = new int[N + 1];
            for(int i = 0; i <= N; i++) {
                graph.add(new ArrayList<Integer>());
            }
            for(int i = 0; i < T; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                graph.get(a).add(b);
            }
            check[1] = 1;
            DFS(1);
            System.out.println(answer);
        }
        public static void DFS(int L) {
            if(L == N) answer++;
            else {
                for(int nextValue : graph.get(L)) {
                    if(check[nextValue] == 0) {
                        check[nextValue] = 1;
                        DFS(nextValue);
                        check[nextValue] = 0;
                    }
                }
            }
        }
    }


    static int N;
    static int T;
    static List<List<Integer>> graph;
    static int[] check;
    static int answer;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        T = scan.nextInt();
        graph = new ArrayList<>();
        check = new int[N + 1];
        for(int i = 0; i <= N; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for(int i = 1; i<= T; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph.get(a).add(b);
        }
        check[1] = 1;
        DFS(1);
        System.out.println(answer);
    }
    public static void DFS(int V) {
        if(V == N) answer++;
        else {
            for(int nextV : graph.get(V)) {
                if(check[nextV] == 0) {
                    check[nextV] = 1;
                    DFS(nextV);
                    check[nextV] = 0;
                }
            }
        }
    }
}
