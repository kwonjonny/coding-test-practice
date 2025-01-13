package recursive_tree_graph_dfs_bfs;

import java.util.Scanner;

/**
 * 팩토리얼
 * 설명
 * 자연수 N이 입력되면 N!을 구하는 프로그램을 작성하세요.
 * 예를 들어 5! = 1*2*3*4*5=120 입니다.
 *
 * 입력
 * 첫 번재 줄에 N 팩토리얼 값을 출력합니다.
 *
 * 출력
 * 첫 번째 줄에 이진수를 출력하세요.
 *
 * 예시 입력 1
 * 5
 *
 * 예시 출력 1
 * 120
 */
public class A_StackFrame3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer order = scan.nextInt();
        Integer result = DFS(order);
        System.out.println(result);
    }
    public static Integer DFS(Integer order) {
        int result = 1;
        if(order == 0) return 1;
        else {
            result = order * DFS(order - 1);
        }
        return result;
    }
}
