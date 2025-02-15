package z_코딩테스트_합격자되기_자바편;

import java.util.*;

public class 문제5_행렬의_곱셈 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,4}, {3,2}, {4,1}};
        int[][] arr2 = {{3,3}, {3,3}};
        int[][] answer = solution(arr1, arr2);
        for(int[] x : answer) {
            System.out.print(Arrays.toString(x) + " ");
        }
    }
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;

        int[][] answer = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                for(int k = 0; k < c1; k++) {
                    answer[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        return answer;
    }
}
