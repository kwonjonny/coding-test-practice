package z_baekjoon.silver.투포인터;

import java.util.*;

public class 수들의_합2_실버4_2003 {
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
        int left = 0;
        int answer = 0;
        for(int right = 0; right < N; right++) {
            currentSum += array[right];
            if(currentSum == T) answer++;
            while(currentSum > T) {
                currentSum -= array[left++];
                if(currentSum == T) answer++;
            }
        }
        System.out.println(answer);
    }
}
