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

    /**
     * 재 복습: 2025-02-04
     */
    public static class AStackFrame7 {
        static int[] fivo;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer order = scan.nextInt();
            fivo = new int[order + 1];
            DFS(order);
            for(int i = 1; i < fivo.length; i++) {
                System.out.print(fivo[i] + " ");
            }
        }
        public static Integer DFS(Integer order) {
            if(order == 0) return fivo[order] = 1;
            else if (order == 1) return fivo[order] = 1;
            else if (order == 2) return fivo[order] = 1;
            else {
                return fivo[order] = DFS(order - 1) + DFS(order - 2);
            }
        }
    }

    /**
     * 재 복습: 2025-01-24
     */
    public static class AStackFrame6 {
        static int[] pivot;

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            pivot = new int[count + 1];
            DFS(count);
            for(int i = 1; i < pivot.length; i++) {
                System.out.print(pivot[i] + " ");
            }
        }
        public static Integer DFS(Integer count) {
            if(count == 0) return pivot[count] = 1;
            else if (count == 1) return pivot[count] = 1;
            else if (count == 2) return pivot[count] = 1;
            else {
               return pivot[count] = DFS(count - 1) + DFS(count - 2);
            }
        }
    }

    /**
     * 재 복습: 2025-01-19
     */
    public static class AStackFrame5 {
        static int[] fibo;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer order = scan.nextInt();
            fibo = new int[order + 1];
            AStackFrame5.DFS(order);
            for(int i = 1; i < fibo.length; i++) {
                System.out.print(fibo[i] + " ");
            }
        }
        public static Integer DFS(Integer order) {
            if(order == 1) return fibo[order] = 1;
            else if (order == 2) return fibo[order] = 1;
            else {
                return fibo[order] = DFS(order - 2) + DFS(order - 1);
            }
        }
    }

    /**
     * 재 복습: 2025-01-14
     */
    public static class AStackFrame4 {
        static int[] fivort;

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer order = scan.nextInt();
            fivort = new int[order + 1];
            DFS(order);
            for(int i = 1; i <= order; i++) {
                System.out.print(fivort[i] + " ");
            }
        }
        public static Integer DFS(Integer order) {
            if (order == 1) return fivort[order] = 1;
            else if (order == 2) return fivort[order] = 1;
            return fivort[order] = DFS(order - 1) + DFS(order - 2);
        }
    }

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
