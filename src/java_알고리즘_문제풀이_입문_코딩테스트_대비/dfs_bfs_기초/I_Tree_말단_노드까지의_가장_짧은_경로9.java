package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_기초;

/**
 * 9. Tree 말단 노드까지의 가장 짧은 경로
 *
 * 아래 그림과 같은 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
 * 각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 각 간선(에지)의 개수를 길이로 하겠습니다.
 *          1
 *      |       |
 *      2       3
 *   |     |
 *   4     5
 *   가장 짧은 길이는 3번 노드까지의 길이인 1이다.
 */

import java.util.*;

public class I_Tree_말단_노드까지의_가장_짧은_경로9 {

    /**
     * 재 복습: 2025-05-19
     */
    public static class I_Tree_말단_노드까지의_가장_짧은_경로9_5 {
        public static void main(String[] args) {
            I_Tree_말단_노드까지의_가장_짧은_경로9_5 tree = new I_Tree_말단_노드까지의_가장_짧은_경로9_5();
            tree.root = new Node(1);
            tree.root.lt = new Node(2);
            tree.root.rt = new Node(3);
            tree.root.lt.lt = new Node(4);
            tree.root.lt.rt = new Node(5);
            int answer = DFS(tree.root, 0);
            System.out.println(answer);
        }
        public static int DFS(Node root, int level) {
            if(root.lt == null && root.rt == null) {
                return level;
            }
            else {
                return Math.min(DFS(root.lt, level + 1), DFS(root.rt, level + 1));
            }
        }
        Node root;
        public static class Node {
            int data;
            Node lt, rt;
            public Node(int data) {
                this.data = data;
                this.lt = null;
                this.rt = null;
            }
        }
    }


    /**
     * 재 복습: 2025-03-14
     */
    public static class I_Tree_말단_노드까지의_가장_짧은_경로9_4 {
        public static void main(String[] args) {
            I_Tree_말단_노드까지의_가장_짧은_경로9_4 T = new I_Tree_말단_노드까지의_가장_짧은_경로9_4();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            int answer = DFS(0, T.root);
            System.out.println(answer);
        }
        public static int DFS(int level, Node root) {
            if(root.lt == null && root.rt == null) {
                return level;
            }
            else {
                return Math.min(DFS(level + 1, root.lt), DFS(level + 1, root.rt));
            }
        }
        Node root;
        public static class Node {
            int data;
            Node lt, rt;
            public Node(int data) {
                this.data = data;
                this.lt = null;
                this.rt = null;
            }
        }
    }


    /**
     * 재 복습: 2025-03-07
     */
    public static class I_Tree_말단_노드까지의_가장_짧은_경로9_3 {
        public static void main(String[] args) {
            I_Tree_말단_노드까지의_가장_짧은_경로9_3 T = new I_Tree_말단_노드까지의_가장_짧은_경로9_3();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            DFS(0, T.root);
            System.out.println(answer);
        }
        static int answer = Integer.MAX_VALUE;
        public static void DFS(int level, Node root) {
            if(root.lt == null && root.rt == null) {
                answer = Math.min(answer, level);
                return;
            }
            else {
                if(root.lt != null) DFS(level + 1, root.lt);
                if(root.rt != null) DFS(level + 1, root.rt);
            }
        }
        Node root;
        public static class Node {
            int data;
            Node lt, rt;
            public Node(int data) {
                this.data = data;
                this.lt = null;
                this.rt = null;
            }
        }
    }


    /**
     * 재 복습: 2025-03-05
     */
    public static class I_Tree_말단_노드까지의_가장_짧은_경로9_2 {
        public static void main(String[] args) {
            I_Tree_말단_노드까지의_가장_짧은_경로9_2 T = new I_Tree_말단_노드까지의_가장_짧은_경로9_2();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            int answer =  DFS(0, T.root);
            System.out.println(answer);
        }
        public static int DFS(int level, Node root) {
            if(root.lt == null && root.rt == null) return level;
            else return Math.min(DFS(level + 1, root.lt), DFS(level + 1, root.rt));
        }
        Node root;
        public static class Node {
            int data;
            Node lt, rt;
            public Node(int data) {
                this.data = data;
                this.lt = null;
                this.rt = null;
            }
        }
    }


    /**
     * 재 복습: 2025-03-04
     */
    public static class I_Tree_말단_노드까지의_가장_짧은_경로9_1 {
        public static void main(String[] args) {
            I_Tree_말단_노드까지의_가장_짧은_경로9_1 T = new I_Tree_말단_노드까지의_가장_짧은_경로9_1();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            int answer = DFS(0, T.root);
            System.out.println(answer);
        }
        public static int DFS(int level, Node root) {
            if(root.lt == null && root.rt == null) return level;
            else return Math.min(DFS(level + 1, root.lt), DFS(level + 1, root.rt));
        }
        Node root;
        public static class Node {
            int data;
            Node lt, rt;
            public Node(int data) {
                this.data = data;
                this.lt = null;
                this.rt = null;
            }
        }
    }


    public static void main(String[] args) {
        I_Tree_말단_노드까지의_가장_짧은_경로9 T = new I_Tree_말단_노드까지의_가장_짧은_경로9();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        int answer = DFS(0, T.root);
        System.out.println(answer);
    }
    public static int DFS(int L, Node root) {
        if(root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
    }
    Node root;
    public static class Node {
        int data;
        Node lt, rt;
        public Node(int data) {
            this.data = data;
            this.lt = null;
            this.rt = null;
        }
    }
}
