package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 별_찍기2_브론즈4_2439 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        solution(N);
    }
    public static void solution(int N) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N - 1 - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
