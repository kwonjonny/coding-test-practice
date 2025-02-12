package recursive_tree_graph_dfs_bfs;

/**
 * 문제 설명:
 *
 * Tree 말단 노드 까지 가장 짧은 경로
 *
 * 아래 글미과 같은 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를
 * 구하는 프로그램을 작성하세요.
 *
 * 각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 회수를 즉 간선(에지) 의 개수를 길이로
 * 하겠습니다.
 *
 *              1
 *           |      |
 *           2      3
 *        |     |
 *        4     5
 *  가장 짧은 길이는 3번 노드까지의 길이인 1이다
 */
public class DFS_3 {
    public static class DFS3 {
        public static class Node {
            public int data;
            public Node lt, rt;
            public Node(int data) {
                this.lt = null;
                this.rt = null;
                this.data = data;
            }
        }
        Node root;
        public static void main(String[] args) {
            DFS3 tree = new DFS3();
            tree.root = new Node(1);
            tree.root.lt = new Node(2);
            tree.root.rt = new Node(3);
            tree.root.lt.lt = new Node(4);
            tree.root.lt.rt = new Node(5);
            int answer = DFS3.DFS(0, tree.root);
            System.out.println(answer);
        }
        public static int DFS(int L, Node root) {
            if(root.lt == null && root.rt == null) return L;
            else return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
        }
    }
}
