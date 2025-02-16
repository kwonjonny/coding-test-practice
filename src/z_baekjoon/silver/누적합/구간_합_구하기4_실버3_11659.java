package z_baekjoon.silver.누적합;

import java.util.Scanner;

public class 구간_합_구하기4_실버3_11659 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] array = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            array[i] = scan.nextInt();
        }
        int[] prefixSum = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }

        for(int i = 0; i < K; i++) {
            int P = scan.nextInt();
            int L = scan.nextInt();
            int currentSum = prefixSum[L] - prefixSum[P - 1];
            System.out.println(currentSum);
        }
    }
}
