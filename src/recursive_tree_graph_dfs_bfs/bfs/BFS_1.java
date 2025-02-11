package recursive_tree_graph_dfs_bfs.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 이진트리 순회 (BFS: 레벨 탐색)
 *
 *              1
 *          2        3
 *       4    5    6    7
 *
 *  출력 예시1
 *  1 2 3 4 5 6 7
 */
public class BFS_1 {

    /**
     * 재 복습: 2025-02-11
     */
    public static class BFS2 {
        public static class Node {
            int data;
            Node lt;
            Node rt;
            public Node(int data) {
                this.lt = null;
                this.rt = null;
                this.data = data;
            }
        }
        Node root;
        public static void main(String[] args) {
            BFS2 bfs2 = new BFS2();
            bfs2.root = new Node(1);
            bfs2.root.lt = new Node(2);
            bfs2.root.rt = new Node(3);
            bfs2.root.lt.lt = new Node(4);
            bfs2.root.lt.rt = new Node(5);
            bfs2.root.rt.lt = new Node(6);
            bfs2.root.rt.rt = new Node(7);
            BFS2.BFS(bfs2.root);
        }
        public static void BFS(Node root) {
            Queue<Node> Q = new LinkedList<>();
            Q.offer(root);
            while(!Q.isEmpty()) {
                for(int i = 0; i < Q.size(); i++) {
                    Node current = Q.poll();
                    System.out.print(current.data + " ");
                    if(current.lt != null) Q.offer(current.lt);
                    if(current.rt != null) Q.offer(current.rt);
                }
            }
        }
    }

    public static class Node {
        Node lt, rt;
        int data;
        public Node(int data) {
            this.lt = null;
            this.rt = null;
            this.data = data;
        }
    }

    Node root;

    public static void main(String[] args) {
        BFS_1 bfs1 = new BFS_1();
        bfs1.root = new Node(1);
        bfs1.root.lt = new Node(2);
        bfs1.root.rt = new Node(3);
        bfs1.root.lt.lt = new Node(4);
        bfs1.root.lt.rt = new Node(5);
        bfs1.root.rt.lt = new Node(6);
        bfs1.root.rt.rt = new Node(7);
        BFS(bfs1.root);
    }

    public static void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i = 0; i < len; i++) {
              Node node = queue.poll();
                System.out.print(node.data + " ");
                if(node.lt != null) queue.offer(node.lt);
                if(node.rt != null) queue.offer(node.rt);
            }
        }
        System.out.println();
    }
}
