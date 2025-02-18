package z_baekjoon.투포인터;

import java.util.*;

public class 수들의_합_5_실버5_2018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        solution(N);
    }
    public static void solution(int N) {
        int[] array = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            array[i] = i;
        }
        int currentSum = 0;
        int left = 0;
        int answer = 0;
        for(int right = 0; right < array.length; right++) {
            currentSum = currentSum + array[right];
            if(currentSum == N) answer++;
            while(currentSum > N) {
                currentSum = currentSum - array[left++];
                if(currentSum == N) answer++;
            }
        }
        System.out.println(answer);
    }
}
