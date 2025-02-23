package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 공_넣기_브론즈3_10810 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] array = new int[N + 1];
        for(int i = 0; i < M; i++) {
            int start = scan.nextInt();
            int end = scan.nextInt();
            int howMany = scan.nextInt();
            for(int j = start; j <= end; j++) {
                array[j] = howMany;
            }
        }

        for(int i = 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
