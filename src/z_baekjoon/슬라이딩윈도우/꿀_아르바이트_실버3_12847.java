package z_baekjoon.슬라이딩윈도우;

import java.util.*;

public class 꿀_아르바이트_실버3_12847 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        solution(N, T, array);
    }
    public static void solution(int N, int T, int[] array) {
        long currentSum = 0;
        for(int i = 0; i < T; i++) {
            currentSum += array[i];
        }
        long max = currentSum;
        for(int i = T; i < N; i++) {
            int left = i - T;
            currentSum += (array[i] - array[left]);
            max = Math.max(max, currentSum);
        }
        System.out.println(max);
    }
}
