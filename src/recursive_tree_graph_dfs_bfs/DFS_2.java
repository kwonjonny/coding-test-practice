package recursive_tree_graph_dfs_bfs;

import java.util.Scanner;

/**
 * 부분 집합 구하기 (DFS)
 *
 * 자연수 N 이 주어지면 1부터 N 까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.
 *
 * 입력 설명
 * 첫 번째 줄에 자연수 N(1<=N<=10)이 주어집니다.
 *
 * 출력 설명
 * 첫 번째 줄부터 각 줄에 하나씩 부분집합을 아래와 출력예제와 같은 순서로 출력한다.
 * 단 공집합은 출력하지 않습니다.
 *
 * 입력 예제 1
 * 3
 *
 * 출력 예제 1
 * 1 2 3
 * 1 2
 * 1 3
 * 1
 * 2 3
 * 2
 * 3
 */
public class DFS_2 {

    /**
     * 재 복습: 2025-02-07
     */
    public static class DFS3 {
        static int order;
        static int[] array;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            order = scan.nextInt();
            array = new int[order + 1];
            DFS(1);
        }
        public static void DFS(Integer L) {
            if(L == order + 1) {
                String temp = "";
                for(int i =1; i <= order; i++) {
                    if(array[i] == 1) {
                        temp = temp + (i + " ");
                    }
                }
                if(temp.length() > 0) System.out.println(temp);
            }
            else {
                array[L] = 1;
                DFS(L + 1);
                array[L] = 0;
                DFS(L + 1);
            }
        }
    }


    public static class DFS2 {
        public static void DFS(int L) {
            if(L == n + 1) {
                String temp = "";
                for(int i = 1; i <= n; i++) {
                    if(ch[i] == 1) temp = temp + (i + " ");
                }
                if(temp.length()>0) System.out.println(temp);
            } else {
                ch[L] = 1;
                DFS(L + 1);
                ch[L] = 0;
                DFS(L + 1);
            }
        }
        static int n;
        static int[] ch;
        public static void main(String[] args) {
            DFS2 dfs2 = new DFS2();
            n = 3;
            ch = new int[n + 1];
            DFS(1);
        }
    }
}
