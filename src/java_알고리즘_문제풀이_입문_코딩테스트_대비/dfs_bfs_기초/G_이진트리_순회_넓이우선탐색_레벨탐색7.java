package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_기초;

/**
 * 7. 이진트리 순회 (넓이우선탐색 : 레벨탐색)
 *
 * 아래 그림과 같은 이진트리를 레벨탐색 연습하세요.
 *              1
 *           |   |
 *           2     3
 *         |  |   |  |
 *         4  5   6  7
 *
 * 레벨 탐색 순회 출력 : 1 2 3 4 5 6 7
 */

import java.util.*;

public class G_이진트리_순회_넓이우선탐색_레벨탐색7 {

    /**
     * 재 복습: 2025-03-07
     */
    public static class G_이진트리_순회_넓이우선탐색_레벨탐색7_3 {
        public static void main(String[] args) {
            G_이진트리_순회_넓이우선탐색_레벨탐색7_3 T = new G_이진트리_순회_넓이우선탐색_레벨탐색7_3();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            T.root.rt.lt= new Node(6);
            T.root.rt.rt = new Node(7);
            DFS(T.root);
        }
        public static void DFS(Node root) {
            Queue<Node> Q = new LinkedList<>();
            Q.offer(root);
            while(!Q.isEmpty()) {
                int length = Q.size();
                for(int i = 0; i < length; i++) {
                    Node current = Q.poll();
                    System.out.print(current.data + " ");
                    if(current.lt != null) Q.offer(current.lt);
                    if(current.rt != null) Q.offer(current.rt);
                }
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
    public static class G_이진트리_순회_넓이우선탐색_레벨탐색7_2 {
        public static void main(String[] args) {
            G_이진트리_순회_넓이우선탐색_레벨탐색7_2 T = new G_이진트리_순회_넓이우선탐색_레벨탐색7_2();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            T.root.rt.lt = new Node(6);
            T.root.rt.rt = new Node(7);
            BFS(T.root);
        }
        public static void BFS(Node root) {
            Queue<Node> Q = new LinkedList<>();
            Q.offer(root);
            int level = 0;
            while(!Q.isEmpty()) {
                int length = Q.size();
                for(int i = 0; i < length; i++) {
                    Node current = Q.poll();
                    System.out.println("level: " + level + " : " + current.data + " ");
                    if(current.lt != null) Q.offer(current.lt);
                    if(current.rt != null) Q.offer(current.rt);
                }
                level++;
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
     * 재 복습: 2025-03-04
     */
    public static class G_이진트리_순회_넓이우선탐색_레벨탐색7_1 {
        public static void main(String[] args) {
            G_이진트리_순회_넓이우선탐색_레벨탐색7_1 T = new G_이진트리_순회_넓이우선탐색_레벨탐색7_1();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            T.root.rt.lt = new Node(6);
            T.root.rt.rt = new Node(7);
            BFS(T.root);
        }
        public static void BFS(Node root) {
            Queue<Node> Q = new LinkedList<>();
            int level = 0;
            Q.offer(root);
            while(!Q.isEmpty()) {
                int length = Q.size();
                for(int i = 0; i < length; i++) {
                    Node current = Q.poll();
                    System.out.print("level:" + level + "  " + current.data + " ");
                    if(current.lt != null) Q.offer(current.lt);
                    if(current.rt != null) Q.offer(current.rt);
                }
                System.out.println();
                level++;
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


    public static void main(String[] args) {
        G_이진트리_순회_넓이우선탐색_레벨탐색7 T = new G_이진트리_순회_넓이우선탐색_레벨탐색7();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);
        BFS(T.root);
    }
    public static void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()) {
           int length = Q.size();
           for(int i = 0; i < length; i++) {
               Node current = Q.poll();
               System.out.println("level" + L + ": " + current.data + " ");
               if(current.lt != null) Q.offer(current.lt);
               if(current.rt != null) Q.offer(current.rt);
           }
           L++;
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
