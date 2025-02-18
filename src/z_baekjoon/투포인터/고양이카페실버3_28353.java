package z_baekjoon.투포인터;

import java.util.*;

public class 고양이카페실버3_28353 {
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
        int answer = 0;
        int left = 0;
        int right = array.length - 1;
        while(right > left) {
            int sum = array[left] + array[right];
            if(sum <= T) {
                answer++;
                left++;
                right--;
            } else {
                right --;
            }
        }
        System.out.println(answer);
    }
}
