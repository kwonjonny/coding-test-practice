package z_baekjoon.투포인터.실버;

import java.util.*;

public class 주몽_실버4_1940 {
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
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        int answer = 0;
        while(right > left) {
            int currentSum = array[left] + array[right];
            if(currentSum == T) {
                answer ++;
                left++;
                right--;
            }
            else if (currentSum > T) {
                right--;
            }
            else left++;
        }
        System.out.println(answer);
    }
}