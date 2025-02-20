package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 개수_세기_브론즈5_10807 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        int T = scan.nextInt();
        solution(N, array, T);
    }
    public static void solution(int N, int[] array, int T) {
        int answer = 0;
        for(int i = 0; i < N; i++) {
            if(array[i] == T) answer++;
        }
        System.out.println(answer);
    }
}
