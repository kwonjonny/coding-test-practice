package z_baekjoon.투포인터.골드;

import java.util.Arrays;
import java.util.Scanner;

public class 수_고르기_골드5_2230 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int T = scan.nextInt();
        int[] array = new int[L];
        for(int i = 0; i < L; i++) {
            array[i] = scan.nextInt();
        }
        solution(L, T, array);
    }
    public static void solution(int L, int T, int[] array) {
        Arrays.sort(array);
        int minAnswer = Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0; right < L; right++) {
            while(right > left && (array[right] - array[left] >= T)) {
                minAnswer = Math.min(minAnswer, array[right] - array[left++]);
            }
        }
        System.out.println(minAnswer);
    }
}
