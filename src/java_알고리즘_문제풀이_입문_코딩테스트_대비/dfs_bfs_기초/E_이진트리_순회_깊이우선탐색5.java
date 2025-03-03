package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_기초;

/**
 * 5. 이진트리 순회 (깊이우선탐색)
 *
 */

public class E_이진트리_순회_깊이우선탐색5 {
    public static void main(String[] args) {
       E_이진트리_순회_깊이우선탐색5 T = new E_이진트리_순회_깊이우선탐색5();
        T.tree = new Node(1);
        T.tree.lt = new Node(2);
        T.tree.rt = new Node(3);
        T.tree.lt.lt = new Node(4);
        T.tree.lt.rt = new Node(5);
        T.tree.rt.lt = new Node(5);
        T.tree.rt.rt = new Node(7);
        DFS(T.tree);
    }
    public static void DFS(Node root) {
        if(root == null) return;
        else {
            System.out.print(root.data + " ");
            DFS(root.lt);
            DFS(root.rt);
        }
    }
    Node tree;
    public static class Node {
        Node lt, rt;
        int data;
        public Node(int data) {
            this.data = data;
            this.lt = null;
            this.rt = null;
        }
    }
}
