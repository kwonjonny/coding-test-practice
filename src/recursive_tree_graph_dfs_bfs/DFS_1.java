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
 */
public class DFS_1 {

    public static class Node {
        int data;
        Node lt, rt;
        public Node(int val) {
            this.data = val;
            this.lt = null;
            this.rt = null;
        }
    }

    Node root;
    public static void DFS(Node root) {
        if(root == null) return;
        else {
//            System.out.print(root.data + " "); 전위
            DFS(root.lt);
//            System.out.print(root.data + " "); 중위
            DFS(root.rt);
//            System.out.print(root.data + " "); 후위 
        }
    }

    public static void main(String[] args) {
        DFS_1 tree = new DFS_1();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        DFS(tree.root);
    }
}
