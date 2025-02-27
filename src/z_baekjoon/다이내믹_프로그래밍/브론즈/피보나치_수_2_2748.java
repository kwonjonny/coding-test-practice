package z_baekjoon.다이내믹_프로그래밍.브론즈;

import java.util.Scanner;

public class 피보나치_수_2_2748 {
    static long[] dynamic;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        dynamic = new long[N + 1];
        long answer = solution(N);
        System.out.println(answer);
    }
    public static long solution(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;

        dynamic[1] = 1;
        dynamic[2] = 1;
        for(int i = 3; i <= N; i++) {
            dynamic[i] = dynamic[i - 1] + dynamic[i - 2];
        }

        return dynamic[N];
    }
}
