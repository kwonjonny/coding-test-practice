package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 공_바꾸기_브론즈2_10813 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] array = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            array[i] = i;
        }

        for(int k = 0; k < M; k++) {
            int i = scan.nextInt();
            int j = scan.nextInt();

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        for(int i = 1; i <= N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
