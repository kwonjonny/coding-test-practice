package z_baekjoon.silver.투포인터;

import java.util.*;
public class 부분합_골드4_1806 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        int answer = solution(N, T, array);
        System.out.println(answer);
    }
    public static int solution(int N, int T, int[] array) {
        int length = Integer.MAX_VALUE;
        int currentSum = 0;
        int left = 0;
        for(int right = 0; right < N; right++) {
            currentSum += array[right];
            while(currentSum >= T) {
                length = Math.min(length, right - left + 1);
                currentSum -= array[left++];
            }
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}
