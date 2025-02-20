package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 기찍N_브론즈4_2742 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        solution(N);
    }
    public static void solution(int N) {
        for(int i = N; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
