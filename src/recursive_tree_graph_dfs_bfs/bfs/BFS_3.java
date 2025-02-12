package recursive_tree_graph_dfs_bfs.bfs;

import java.util.*;

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
public class BFS_3 {
    public static class BFS3 {
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
            BFS3 tree = new BFS3();
            tree.root = new Node(1);
            tree.root.lt = new Node(2);
            tree.root.rt = new Node(3);
            tree.root.lt.lt = new Node(4);
            tree.root.lt.rt = new Node(5);
            int answer = BFS3.BFS(tree.root);
            System.out.println(answer);
        }
        public static int BFS(Node root) {
            Queue<Node> Q = new LinkedList<>();
            int L = 0;
            Q.offer(root);
            while(!Q.isEmpty()) {
                int len = Q.size();
                for(int i = 0; i < len; i++) {
                    Node current = Q.poll();
                    if(current.lt == null && current.rt == null) return L;
                    if(current.lt != null) Q.offer(current.lt);
                    if(current.rt != null) Q.offer(current.rt);
                }
                L++;
            }
            return -1;
        }
    }
}
