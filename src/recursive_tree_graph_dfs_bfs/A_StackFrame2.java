package recursive_tree_graph_dfs_bfs;

import java.util.Scanner;

/**
 * 재귀함수를 이용한 이진수 출력
 * 설명
 * 10이진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요.
 * 단 재귀함수를 이용해서 출력해야 합니다.
 *
 * 입력
 * 첫 번재 줄에 10진수 N(1<=N<=1,000)이 주어집니다.
 *
 * 출력
 * 첫 번째 줄에 이진수를 출력하세요.
 *
 * 예시 입력 1
 * 11
 *
 * 예시 출력 1
 * 1011
 */
public class A_StackFrame2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer order = scan.nextInt();
        DFS(order);
    }
    public static void DFS(Integer order) {
        if(order == 0) return;
        else {
            DFS(order / 2);
            System.out.print(order % 2 + "");
        }
    }
}
