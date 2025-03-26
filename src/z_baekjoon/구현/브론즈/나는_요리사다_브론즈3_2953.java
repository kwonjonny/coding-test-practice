package z_baekjoon.구현.브론즈;

import java.util.*;

public class 나는_요리사다_브론즈3_2953 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 5;
        int T = 4;

        int[][] array = new int[N][T];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < T; j++) {
                array[i][j] = scan.nextInt();
            }
        }

        int sum = 0;
        int winner = 0;
        int maxScore = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < T; j++) {
                sum = sum + array[i][j];
            }
            if(sum > maxScore) {
                maxScore = sum;
                winner = i + 1;
            }
            sum = 0;
        }
        System.out.println(winner + " " + maxScore);
    }
}
