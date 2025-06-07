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

    /**
     * 재 복습: 2025-06-07
     */
    public static class E_이진트리_순회_깊이우선탐색5_7 {
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
        public static void main(String[] args) {
            E_이진트리_순회_깊이우선탐색5_7 T = new E_이진트리_순회_깊이우선탐색5_7();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            T.root.rt.lt = new Node(6);
            T.root.rt.rt = new Node(7);
            DFS(T.root);
        }
        public static void DFS(Node root) {
            if(root == null) return;
            else {
                // 전위
                System.out.print(root.data + " ");
                DFS(root.lt);
                // 중위
                DFS(root.rt);
                // 후위
            }
        }
    }


    /**
     * 재 복습: 2025-05-22
     */
    public static class E_이진트리_순회_깊이우선탐색5_6 {
        public static void main(String[] args) {
            E_이진트리_순회_깊이우선탐색5_6 T = new E_이진트리_순회_깊이우선탐색5_6();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            T.root.rt.lt = new Node(6);
            T.root.rt.rt = new Node(7);
            DFS(T.root);
        }
        public static void DFS(Node root) {
            if(root == null) return;
            else {
                DFS(root.lt);
                // 중위
                System.out.print(root.data + " ");
                DFS(root.rt);
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
     * 재 복습: 2025-05-16
     */
    public static class E_이진트리_순회_깊이우선탐색5_5 {
        public static void main(String[] args) {
            E_이진트리_순회_깊이우선탐색5_5 tree = new E_이진트리_순회_깊이우선탐색5_5();
            tree.root = new Node(1);
            tree.root.lt = new Node(2);
            tree.root.rt = new Node(3);
            tree.root.lt.lt = new Node(4);
            tree.root.lt.rt = new Node(5);
            tree.root.rt.lt = new Node(6);
            tree.root.rt.rt = new Node(7);
            DFS(tree.root);
        }
        public static void DFS(Node root) {
            if(root == null) return;
            else {
                // 전위
                //System.out.print(root.data + " ");
                DFS(root.lt);
                // 중위
                System.out.print(root.data + " ");
                DFS(root.rt);
                // 후위
                //System.out.print(root.data + " ");
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
     * 재 복습: 2025-03-14
     */
    public static class E_이진트리_순회_깊이우선탐색5_4 {
        public static void main(String[] args) {
            E_이진트리_순회_깊이우선탐색5_4 T = new E_이진트리_순회_깊이우선탐색5_4();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            T.root.rt.lt = new Node(6);
            T.root.rt.rt = new Node(7);
            DFS(T.root);
        }
        public static void DFS(Node root) {
            if(root == null) return;
            else {
                System.out.print(root.data + " ");
                DFS(root.lt);
                DFS(root.rt);
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
     * 재 복습: 2025-03-07
     */
    public static class E_이진트리_순회_깊이우선탐색5_3 {
        public static void main(String[] args) {
            E_이진트리_순회_깊이우선탐색5_3 T = new E_이진트리_순회_깊이우선탐색5_3();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            T.root.rt.lt = new Node(6);
            T.root.rt.rt = new Node(7);
            DFS(T.root);
        }
        public static void DFS(Node root) {
            if(root == null) return;
            else {
                System.out.print(root.data + " ");
                DFS(root.lt);
                DFS(root.rt);
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
    public static class E_이진트리_순회_깊이우선탐색5_2 {
        public static void main(String[] args) {
            E_이진트리_순회_깊이우선탐색5_2 T = new E_이진트리_순회_깊이우선탐색5_2();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            T.root.rt.lt = new Node(6);
            T.root.rt.rt = new Node(7);
            DFS(T.root);
        }
        public static void DFS(Node root) {
            if(root == null) return;
            else {
                System.out.print(root.data + " ");
                DFS(root.lt);
                DFS(root.rt);
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
    public static class E_이진트리_순회_깊이우선탐색5_1 {
        public static void main(String[] args) {
            E_이진트리_순회_깊이우선탐색5_1 T = new E_이진트리_순회_깊이우선탐색5_1();
            T.root = new Node(1);
            T.root.lt = new Node(2);
            T.root.rt = new Node(3);
            T.root.lt.lt = new Node(4);
            T.root.lt.rt = new Node(5);
            T.root.rt.lt = new Node(6);
            T.root.rt.rt = new Node(7);
            DFS(T.root);
        }
        public static void DFS(Node root) {
            if(root == null) return;
            else {
                // 전위
                System.out.print(root.data + " ");
                DFS(root.lt);
                // 중위
                //System.out.print(root.data + " ");
                DFS(root.rt);
                // 후위
                //System.out.print(root.data + " ");
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
