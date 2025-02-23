package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 행렬_덧셈_브론즈3_2738 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        int[][] intArray1 = new int[N][M];
        int[][] intArray2 = new int[N][M];
        for(int j = 0; j < N; j++) {
            for(int k = 0; k < M; k++) {
                intArray1[j][k] = scan.nextInt();
            }
        }

        for(int j = 0; j < N; j++) {
            for(int k = 0; k < M; k++) {
                intArray2[j][k] = scan.nextInt();
            }
        }

        int[][] answerArray = new int[N][M];
        for(int i = 0; i < N; i++) {
           for(int j = 0; j < M; j++) {
                answerArray[i][j] = intArray1[i][j] + intArray2[i][j];
           }
       }

        for(int[] x : answerArray) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
