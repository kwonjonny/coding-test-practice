package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 지능형_기차_2_브론즈3_2460 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int max = 0;
        for(int i = 0; i < 10; i++) {
            int T = scan.nextInt();
            int L = scan.nextInt();
            sum += (L - T);
            if(sum > max) max = sum;
        }
        System.out.println(max);
    }
}
