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
