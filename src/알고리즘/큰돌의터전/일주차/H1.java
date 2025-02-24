package 알고리즘.큰돌의터전.일주차;

import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int T = scan.nextInt();
        int[] array = new int[L + 1];
        for(int i = 1; i <= L; i++) {
            array[i] = scan.nextInt();
        }

        int[] prefixSum = new int[L + 1];
        for(int i = 1; i <= L; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }

        int max = 0;
        for(int i = T; i <= L; i++) {
            max = Math.max(max, prefixSum[i] - prefixSum[i - T]);
        }
        System.out.println(max);
    }
}
