package recursive_tree_graph_dfs_bfs;

import java.util.Scanner;

/**
 * 피보나치 수열
 * 1) 피보나치 수열을 출력한다 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 *
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 4 8 13 을 출력하면 된다.
 *
 * 입력 설명
 * 첫 줄에 총 항수 N(3<=N<=45) 이 입력된다.
 *
 * 출력 설명
 * 첫 줄에 피보나치 수열을 출력합니다.
 *
 * 입력예제 1
 * 10
 *
 * 출력예제 1
 * 1 1 2 3 5 8 13 21 34 55
 */
public class A_StackFrame4 {
    static int[] fibo;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer order = scan.nextInt();
        fibo = new int[order + 1];
        DFS(order);
        for(int i = 1; i <= order; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    public static Integer DFS(Integer order) {
        if(order == 1) return fibo[order] = 1;
        else if (order == 2) return fibo[order] = 1;
        else return fibo[order] = DFS(order - 2) + DFS(order - 1);
    }
}
