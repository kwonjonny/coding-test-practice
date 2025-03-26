package z_baekjoon.구현.브론즈;

import java.util.*;

public class 최대값_브론즈3_2566 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 9;
        int T = 9;
        int[][] array = new int[N][T];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < T; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        solution(array, N, T);
    }
    public static void solution(int[][] array, int N, int T) {
        int max = 0;
        int answerI = 0;
        int answerJ = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < T; j++) {
                if(array[i][j] > max) {
                    max = array[i][j];
                    answerI = i;
                    answerJ = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((answerI + 1)+ " " + (answerJ + 1));
    }
}
