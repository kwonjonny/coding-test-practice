package z_baekjoon.다이내믹_프로그래밍.브론즈;

import java.math.BigInteger;
import java.util.Scanner;

public class 피보나치_수_4_실버5_10826 {
    static BigInteger[] dp;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        dp = new BigInteger[N + 1];
        BigInteger answer = solution(N);
        System.out.println(answer);
    }
    public static BigInteger solution(int N) {
        if(N == 1) return BigInteger.ONE;
        if(N == 0) return BigInteger.ZERO;

        dp[0] = BigInteger.ZERO;
        dp[1] = BigInteger.ONE;
        for(int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }
        return dp[N];
    }
}
