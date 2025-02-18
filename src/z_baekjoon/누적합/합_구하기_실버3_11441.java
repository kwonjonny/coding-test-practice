package z_baekjoon.누적합;

import java.util.Scanner;

public class 합_구하기_실버3_11441 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            array[i] = scan.nextInt();
        }

        int[] prefixSum = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }

        int T = scan.nextInt();
        for(int i = 0; i < T; i++) {
            int P = scan.nextInt();
            int L = scan.nextInt();
            int currentSum = prefixSum[L] - prefixSum[P - 1];
            System.out.println(currentSum);
        }
    }
}
