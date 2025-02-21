package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 피보나치_수_브론즈2_2747 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();


        int prev = 0;
        int next = 1;
        for(int i = 0; i < N; i++) {
            int temp = next;
            next = prev + next;
            prev = temp;
        }
        System.out.println(prev);
    }
}
