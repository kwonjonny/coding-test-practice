package z_baekjoon.silver.슬라이딩윈도우;

import java.util.*;

public class 우당탕탕_영화예매_실버4_29700 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int T = scan.nextInt();
        char[][] map = new char[N][K];
        for(int i = 0; i < N; i++) {
            String str = scan.next();
            map[i] = str.toCharArray();
        }
        solution(N, K, T, map);
    }
    public static void solution(int N, int K, int T, char[][] map) {
        int answer = 0;
        for(int i = 0; i < N; i++) {
            int cnt = 0;
            for(int j = 0; j < K; j++) {
                if(map[i][j] == '0') {
                    cnt++;
                    if(cnt >= T) answer++;
                }
                else if (map[i][j] != '0') {
                    cnt = 0;
                }
            }
        }
        System.out.println(answer);
    }
}
