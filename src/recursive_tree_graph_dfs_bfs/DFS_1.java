package recursive_tree_graph_dfs_bfs;


/**
 * 이진트리 순회 (깊이우선탐색)
 *
 * 아래 그림과 같은 이진트리를 전위순회, 중위순회, 후위순회를 연습해보세요
 *
 *
 *                  1
 *               2 --- 3
 *              |       |
 *             ---     ---
 *            |   |   |   |
 *           4    5   6   7
 *
 *           전위 1 2 4 5 3 6 7
 *           중위 4 2 5 1 6 3 7
 *           후위 4 5 2 6 7 3 1
 */
public class DFS_1 {

    /**
     * 재 복습: 2025-02-04
     */
    public static class DFS1 {
        public static class Node {
            Node lt, rt;
            int data;
            public Node(int data) {
                this.data = data;
                this.lt = null;
                this.rt = null;
            }
        }
        Node root;

        public static void main(String[] args) {
            DFS1 tree = new DFS1();
            tree.root = new Node(1);
            tree.root.lt = new Node(2);
            tree.root.rt = new Node(3);
            tree.root.lt.lt = new Node(4);
            tree.root.lt.rt = new Node(5);
            tree.root.rt.lt = new Node(6);
            tree.root.rt.rt = new Node(7);
            DFS(tree.root);
        }
        public static void DFS(Node node) {
            if(node == null) return;
            else {
                System.out.print(node.data + " ");
                DFS(node.lt);
                DFS(node.rt);
            }
        }
    }

    public static class Node {
        Node right, left;
        int data;
        public Node(int V) {
            this.data = V;
            this.right = null;
            this.left = null;
        }
    }
    Node root;

    public static void main(String[] args) {
        DFS_1 tree = new DFS_1();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        DFS(tree.root);
    }
    public static void DFS(Node node) {
        if(node == null) return;
        else {
            System.out.print(node.data + " ");
            DFS(node.left);
            DFS(node.right);
        }
    }
}
