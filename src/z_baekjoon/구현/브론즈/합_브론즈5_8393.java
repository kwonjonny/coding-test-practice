package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 합_브론즈5_8393 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        solution(N);
    }
    public static void solution(int N) {
        int sum = 0;
        for(int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
