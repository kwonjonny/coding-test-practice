package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_기초;

/**
 * 5. 이진트리 순회 (깊이우선탐색)
 *
 * 아래 그림과 같은 이진트리 전위순회와 중위순회 후위순회를 연습해보세요.
 *
 *              1
 *            |   |
 *           2     3
 *         |  |   |  |
 *         4  5   6  7
 *
 * 전위순회 출력: 1 2 4 5 3 6 7
 * 중위순회 출력: 4 2 5 1 6 3 7
 * 후위순회 출력: 4 5 2 6 7 3 1
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
            System.out.print(root.data + " "); // 전위
            DFS(root.lt);
            // System.out.print(root.data + " "); // 중위
            DFS(root.rt);
            // System.out.print(root.data + " "); // 후위
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
