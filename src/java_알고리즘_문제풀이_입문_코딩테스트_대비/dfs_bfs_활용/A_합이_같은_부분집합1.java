package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_활용;

/**
 * 1. 합이 같은 부분집합(DFS : 아마존 인터뷰)
 * 설명
 * <p>
 * N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때
 * <p>
 * 두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 “YES"를 출력하고, 그렇지 않으면 ”NO"를 출력하는 프로그램을 작성하세요.
 * <p>
 * 둘로 나뉘는 두 부분집합은 서로소 집합이며, 두 부분집합을 합하면 입력으로 주어진 원래의 집합이 되어 합니다.
 * <p>
 * 예를 들어 {1, 3, 5, 6, 7, 10}이 입력되면 {1, 3, 5, 7} = {6, 10} 으로 두 부분집합의 합이 16으로 같은 경우가 존재하는 것을 알 수 있다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 번째 줄에 자연수 N(1<=N<=10)이 주어집니다.
 * <p>
 * 두 번째 줄에 집합의 원소 N개가 주어진다. 각 원소는 중복되지 않는다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 번째 줄에 “YES" 또는 ”NO"를 출력한다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     6
     1 3 5 6 7 10
 * 예시 출력 1
 * <p>
 * YES
 */

import java.util.*;

public class A_합이_같은_부분집합1 {

    /**
     * 재 복습: 2025-06-02
     */
    public static class A_합이_같은_부분집합1_4 {
        static int N;
        static int[] array;
        static int totalSum = 0;
        static String answer = "NO";
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
                totalSum += array[i];
            }
            DFS(0, 0);
            System.out.println(answer);
        }
        public static void DFS(int level, int sum) {
            if(level == N) {
                if((totalSum - sum) == sum) {
                    answer = "YES";
                    return;
                }
            }
            else {
                DFS(level + 1, sum + array[level]);
                DFS(level + 1, sum);
            }
        }
    }


    /**
     * 재 복습: 2025-05-30
     */
    public static class A_합이_같은_부분집합1_3 {
        static int N;
        static int[] array;
        static int totalSum = 0;
        static String answer = "NO";
        static boolean flag;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
                totalSum += array[i];
            }
            DFS(0, 0);
            System.out.println(answer);
        }
        public static void DFS(int level, int sum){
            if(flag) return;
            if(level == N) {
                if(totalSum - sum == sum) {
                    answer = "YES";
                    flag = true;
                }
            }
            else {
                DFS(level + 1, sum + array[level]);
                DFS(level + 1, sum);
            }
        }
    }


    /**
     * 재 복습: 2025-05-28
     */
    public static class A_합이_같은_부분집합1_2 {
        static int N;
        static int[] array;
        static String answer = "NO";
        static int totalSum = 0;
        static boolean flag = false;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
                totalSum += array[i];
            }
            DFS(0, array, 0);
            System.out.println(answer);
        }
        public static void DFS(int level, int[] array, int sum) {
            if(flag) return;
            if(level == N) {
                if(totalSum - (sum) == sum) {
                    answer = "YES";
                    flag = true;
                }
            }
            else {
                DFS(level + 1, array, array[level] + sum);
                DFS(level + 1, array, sum);
            }
        }
    }


    /**
     * 재 복습: 2025-03-06
     */
    public static class A_합이_같은_부분집합1_1 {
        static int N;
        static String answer = "NO";
        static int totalSum = 0;
        static boolean flag = false;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
                totalSum += array[i];
            }
            DFS(0, 0, array);
            System.out.println(answer);
        }
        public static void DFS(int level, int sum, int[] array) {
            if(flag) return;
            if(N == level) {
                if((totalSum - sum) == sum) {
                    answer = "YES";
                    flag = true;
                }
            }
            else {
                DFS(level + 1, sum + array[level], array);
                DFS(level + 1, sum, array);
            }
        }
    }


    static String answer = "NO";
    static int N;
    static boolean flag;
    static int total;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
            total += array[i];
        }
        DFS(0, 0, array);
        System.out.println(answer);
    }
    public static void DFS(int level, int sum, int[] array) {
        if(flag) return;
        if(level == N) {
            if((total - sum) == sum) answer = "YES";
        }
        else {
            DFS(level + 1, sum + array[level], array);
            DFS(level + 1, sum, array);
        }
    }
}
