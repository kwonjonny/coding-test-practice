package z_baekjoon.구현;

import java.util.Arrays;
import java.util.Scanner;

public class 수_정렬하기_브론즈2_2750 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        for(int x : array) {
            System.out.println(x);
        }
    }
}
