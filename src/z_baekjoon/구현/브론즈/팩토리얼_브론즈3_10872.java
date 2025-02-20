package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 팩토리얼_브론즈3_10872 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        solution(N);
    }
    public static void solution(int N) {
        int answer = 1;
        for(int i = 1; i <= N; i++) {
            answer *= i;
        }
        System.out.println(answer);
    }
}
