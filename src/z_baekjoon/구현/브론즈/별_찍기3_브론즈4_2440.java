package z_baekjoon.구현.브론즈;

import java.util.*;

public class 별_찍기3_브론즈4_2440 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        solution(N);
    }
    public static void solution(int N) {
        for(int i = 1; i < N; i++) {
            for(int j = i - 1; j < N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("*");
    }
}
