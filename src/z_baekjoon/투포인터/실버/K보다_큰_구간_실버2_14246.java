package z_baekjoon.투포인터.실버;

import java.util.Scanner;

public class K보다_큰_구간_실버2_14246 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        int T = scan.nextInt();
        solution(N, array, T);
    }
    public static void solution(int N, int[] array, int T) {
        int left = 0;
        int currentSum = 0;
        long answer = 0;
        for(int right = 0; right < N; right++) {
            currentSum = currentSum + array[right];
            while(currentSum > T) {
                answer += (N - right);
                currentSum = currentSum - array[left++];
            }
        }
        System.out.println(answer);
    }
}
