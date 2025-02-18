package z_baekjoon.투포인터;

import java.util.Scanner;

public class 싫은데요_실버1_25916 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        solution(N, M, array);
    }
    public static void solution(int N, int M, int[] array) {
        int left = 0;
        int currentSum = 0;
        int max = 0;
        for(int right = 0; right < N; right++) {
            currentSum += array[right];
            if (currentSum <= M && currentSum > max) max = currentSum;
            while(currentSum > M) {
                currentSum -= array[left++];
                if (currentSum <= M && currentSum > max) max = currentSum;

            }
        }
        System.out.println(max);
    }
}
