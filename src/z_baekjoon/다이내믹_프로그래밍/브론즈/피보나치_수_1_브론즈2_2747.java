package z_baekjoon.다이내믹_프로그래밍.브론즈;

import java.util.Scanner;

public class 피보나치_수_1_브론즈2_2747 {
    static int[] dp;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        dp = new int[N + 1];
        int answer = solution(N);
        System.out.println(answer);
    }
    public static int solution(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;

        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[N];
    }
}
