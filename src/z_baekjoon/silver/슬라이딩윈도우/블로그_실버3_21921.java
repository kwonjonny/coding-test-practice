package z_baekjoon.silver.슬라이딩윈도우;

import java.util.*;

public class 블로그_실버3_21921 {
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
        int currentSum = 0;
        for (int i = 0; i < T; i++) {
            currentSum += array[i];
        }
        int answer = 0;
        if (currentSum == T) answer++;

        int max = answer;
        int count = 0;

        for (int i = T; i < N; i++) {
            currentSum += array[i] - array[i - T];
            if (currentSum == T) answer++;
            if (currentSum > max) {
                max = currentSum;
                count = 1;
            } else if(currentSum == max) count++;
        }
        if(max == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(max);
            System.out.println(count);
        }
    }
}
