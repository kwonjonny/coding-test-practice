package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 지능형_기차_브론즈3_2455 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 4;
        int K = 2;

        int[][] intArray = new int[N][K];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < K; j++) {
                intArray[i][j] = scan.nextInt();
            }
        }

        int max = 0;
        int cal = 0;
        for(int[] x : intArray) {
            int first = x[0];
            int second = x[1];
            int T = second - first;
            cal += T;
            if(cal > max) max = cal;
        }
        System.out.println(max);
    }
}
