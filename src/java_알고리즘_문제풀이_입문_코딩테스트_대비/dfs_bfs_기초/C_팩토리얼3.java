package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_기초;

/**
 * 3. 팩토리얼
 * <p>
 * 자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.
 * 예를 들어 5! = 5*4*3*2*1=120 입니다.
 * <p>
 * 입력설명
 * 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
 * <p>
 * 출력설명
 * 첫 번째 줄에 N팩토리얼 값을 출력합니다.
 * <p>
 * 입력예제 1
    5
 * <p>
 * 출력예제 1
 * 120
 */

import java.util.*;

public class C_팩토리얼3 {

    /**
     * 재 복습: 2025-05-15
     */
    public static class C_팩토리얼3_4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int answer = solution(N);
            System.out.println(answer);
        }
        public static int solution(int N) {
            if(N == 0) return 1;
            else {
                return N * solution(N - 1);
            }
        }
    }


    /**
     * 재 복습: 2025-03-14
     */
    public static class C_팩토리얼3_3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int answer = DFS(N);
            System.out.println(answer);
        }
        public static int DFS(int N) {
            if(N == 0) return 1;
            else {
                return N * DFS(N - 1);
            }
        }
    }


    /**
     * 재 복습: 2025-03-05
     */
    public static class C_팩토리얼3_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int answer = DFS(N);
            System.out.println(answer);
        }
        public static int DFS(int N) {
            if(N == 0) return 1;
            else {
                return N * DFS(N - 1);
            }
        }
    }

    
    /**
     * 재 복습: 2025-03-04
     */
    public static class C_팩토리얼3_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int answer = DFS(N);
            System.out.println(answer);
        }
        public static int DFS(int N) {
            if(N == 0) return 1;
            else return N * DFS(N - 1);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int answer = DFS(N);
        System.out.println(answer);
    }
    public static int DFS(int N) {
        if(N == 0) return 1;
        return N * DFS(N - 1);
    }
}
