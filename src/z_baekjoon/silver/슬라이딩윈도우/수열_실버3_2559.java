package z_baekjoon.silver.슬라이딩윈도우;
import java.util.*;

public class 수열_실버3_2559 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        solution(N, K, array);
    }
    public static void solution(int N, int K, int[] array) {
        int currentSum = 0;
        for(int i = 0; i < K; i++) {
            currentSum += array[i];
        }
        int max = currentSum;
        for(int i = K; i < N; i++) {
            currentSum += array[i] - array[i - K];
            max = Math.max(max, currentSum);
        }
        System.out.println(max);
    }
}
