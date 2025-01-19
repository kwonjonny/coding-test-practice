package recursive_tree_graph_dfs_bfs;

import java.util.Scanner;

/**
 * 재귀함수
 * 설명
 * 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N 까지를 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄은 정수 N(3<=N<=10) 이 입력된다.
 *
 * 출력
 * 첫째 줄에 출력한다
 *
 * 예시 입력 1
 * 3
 *
 * 예시 출력 1
 * 1 2 3
 */
public class A_StackFrame1 {

    /**
     * 재 복습: 2025-01-19
     */
    public static class AStackFrame2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer order = scan.nextInt();
            AStackFrame2.DFS(order);
        }
        public static void DFS(Integer order) {
            if(order == 0) return;
            else {
                DFS(order - 1);
                System.out.print(order + " ");
            }
        }
    }

    /**
     * 재 복습: 2025-01-14
     */
    public static class AStackFrame1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer order = scan.nextInt();
            DFS(order);
        }
        public static void DFS(int order) {
            if(order == 0) return;
            else {
                DFS(order - 1);
                System.out.print(order + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer order = scan.nextInt();
        solution(order);
    }
    public static void solution(Integer order) {
        DFS(order);
    }
    public static void DFS(Integer order) {
        if(order == 0) return ;
        else {
            DFS(order - 1);
            System.out.print(order + " ");
        }
    }
}