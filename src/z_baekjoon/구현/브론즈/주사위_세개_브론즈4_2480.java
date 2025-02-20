package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 주사위_세개_브론즈4_2480 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 3;
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        solution(array, N);
    }
    public static void solution(int[] array, int N) {
        int first = array[0];
        int second = array[1];
        int third = array[2];
        int answer = 0;
        if (first == second && second == third) {
            answer = 10000 + (first) * 1000;
        } else if (first == second || second == third || first == third) {
            if (first == second) answer = 1000 + (first) * 100;
            if (second == third) answer = 1000 + (second) * 100;
            if (first == third) answer = 1000 + (third) * 100;
        } else {
            int maxValue = Math.max(first, Math.max(second, third));
            answer = maxValue * 100;
        }
        System.out.println(answer);
    }
}
