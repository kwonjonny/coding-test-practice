package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_기초;

/**
 * 10. Tree 말단 노드까지의 가장 짧은 경로
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

public class J_Tree_말단_노드까지의_가장_짧은_경로10 {

    /**
     * 재 복습: 2025-05-30
     */
    public static class J_Tree_말단_노드까지의_가장_짧은_경로10_7 {
        public static void main(String[] args) {
            J_Tree_말단_노드까지의_가장_짧은_경로10_7 T = new J_Tree_말단_노드까지의_가장_짧은_경로10_7();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            int answer = BFS(T.root);
            System.out.println(answer);
        }
        public static int BFS(Node root) {
            Queue<Node> Q = new LinkedList<>();
            Q.offer(root);
            int LEVEL = 0;
            while(!Q.isEmpty()) {
                int length = Q.size();
                for(int i = 0; i < length; i++) {
                    Node NX = Q.poll();
                    if(NX.lt == null && NX.rt == null) return LEVEL;
                    if(NX.lt != null) Q.offer(NX.lt);
                    if(NX.rt != null) Q.offer(NX.rt);
                }
                LEVEL++;
            }
            return - 1;
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
     * 재 복습: 2025-05-22
     */
    public static class J_Tree_말단_노드까지의_가장_짧은_경로10_6 {
        public static void main(String[] args) {
            J_Tree_말단_노드까지의_가장_짧은_경로10_6 T = new J_Tree_말단_노드까지의_가장_짧은_경로10_6();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            int answer = BFS(T.root);
            System.out.println(answer);
        }
        public static int BFS(Node root) {
            Queue<Node> Q = new LinkedList<>();
            Q.offer(root);
            int level = 0;
            while(!Q.isEmpty()) {
                int length = Q.size();
                for(int i = 0; i < length; i++) {
                    Node NX = Q.poll();
                    if(NX.lt == null && NX.rt == null) return level;
                    if(NX.lt != null) Q.offer(root.lt);
                    if(NX.rt != null) Q.offer(root.rt);
                }
                level++;
            }
            return -1;
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
     * 재 복습: 2025-05-19
     */
    public static class J_Tree_말단_노드까지의_가장_짧은_경로10_5 {
        public static void main(String[] args) {
            J_Tree_말단_노드까지의_가장_짧은_경로10_5 T = new J_Tree_말단_노드까지의_가장_짧은_경로10_5();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            int answer = BFS(T.root);
            System.out.println(answer);
        }
        public static int BFS(Node root) {
            Queue<Node> Q = new LinkedList<>();
            Q.offer(root);
            int level = 0;
            while(!Q.isEmpty()) {
                int length = Q.size();
                for(int i = 0; i < length; i++) {
                    Node x = Q.poll();
                    if(x.lt == null && x.rt == null) {
                       return level;
                    }
                    if(x.lt != null) Q.offer(x.lt);
                    if(x.rt != null) Q.offer(x.rt);
                }
                level++;
            }
            return -1;
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
    public static class J_Tree_말단_노드까지의_가장_짧은_경로10_4 {
        public static void main(String[] args) {
            J_Tree_말단_노드까지의_가장_짧은_경로10_4 T = new J_Tree_말단_노드까지의_가장_짧은_경로10_4();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            int answer = BFS(T.root);
            System.out.println(answer);
        }
        public static int BFS(Node root) {
            Queue<Node> Q = new LinkedList<>();
            int level = 0;
            Q.offer(root);
            while(!Q.isEmpty()) {
                int length = Q.size();
                for(int i = 0; i < length; i++) {
                    Node current = Q.poll();
                    if(current.lt == null && current.rt == null) {
                        return level;
                    }
                    if(current.lt != null) Q.offer(current.lt);
                    if(current.rt != null) Q.offer(current.rt);
                }
                level++;
            }
            return -1;
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
    public static class J_Tree_말단_노드까지의_가장_짧은_경로10_3 {
        public static void main(String[] args) {
            J_Tree_말단_노드까지의_가장_짧은_경로10_3 T = new J_Tree_말단_노드까지의_가장_짧은_경로10_3();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            int answer = BFS(T.root);
            System.out.println(answer);
        }
        public static int BFS(Node root) {
            Queue<Node> Q = new LinkedList<>();
            Q.offer(root);
            int level = 0;
            while(!Q.isEmpty()) {
                int length = Q.size();
                for(int i = 0; i < length; i++) {
                    Node current = Q.poll();
                    if(current.lt == null && current.rt == null) return level;
                    if(current.lt != null) Q.offer(current.lt);
                    if(current.rt != null) Q.offer(current.rt);
                }
                level++;
            }
            return -1;
        }
        public static class Node {
            int data;
            Node lt, rt;
            public Node(int data) {
                this.data = data;
                this.lt = null;
                this.rt = null;
            }
        }
        Node root;
    }


    /**
     * 재 복습: 2025-03-04
     */
    public static class J_Tree_말단_노드까지의_가장_짧은_경로10_2 {
        public static void main(String[] args) {
            J_Tree_말단_노드까지의_가장_짧은_경로10_2 T = new J_Tree_말단_노드까지의_가장_짧은_경로10_2();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            int answer = BFS(T.root);
            System.out.println(answer);
        }
        public static int BFS(Node root) {
            Queue<Node> Q = new LinkedList<>();
            Q.offer(root);
            int level = 0;
            while(!Q.isEmpty()) {
                int length = Q.size();
                for(int i = 0; i < length; i++) {
                    Node current = Q.poll();
                    if(current.lt == null && current.rt == null) {
                        return level;
                    }
                    if(current.lt != null) Q.offer(current.lt);
                    if(current.rt != null) Q.offer(current.rt);
                }
                level++;
            }
            return level;
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
    public static class J_Tree_말단_노드까지의_가장_짤은_경로_10_1 {
        public static void main(String[] args) {
            J_Tree_말단_노드까지의_가장_짤은_경로_10_1 T = new J_Tree_말단_노드까지의_가장_짤은_경로_10_1();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            int answer = BFS(T.root);
            System.out.println(answer);
        }
        public static int BFS(Node root) {
            int level = 0;
            Queue<Node> Q = new LinkedList<>();
            Q.offer(root);
            while(!Q.isEmpty()) {
                int length = Q.size();
                for(int i = 0; i < length; i++) {
                    Node current = Q.poll();
                    if(current.lt == null && current.rt == null) {
                        return level;
                    }
                    if(current.lt != null) Q.offer(current.lt);
                    if(current.rt != null) Q.offer(current.rt);
                }
                level++;
            }
            return level;
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
        J_Tree_말단_노드까지의_가장_짧은_경로10 T = new J_Tree_말단_노드까지의_가장_짧은_경로10();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        int answer = BFS(T.root);
        System.out.println(answer);
    }
    public static int BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int level = 0;
        while(!Q.isEmpty()) {
            int length = Q.size();
            for(int i = 0; i < length; i++) {
                Node current = Q.poll();
                if(current.lt == null && current.rt == null) {
                    return level;
                }
                if(current.lt != null) Q.offer(current.lt);
                if(current.rt != null) Q.offer(current.rt);
            }
            level++;
        }
        return level;
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
