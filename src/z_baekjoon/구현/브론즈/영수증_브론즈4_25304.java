package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 영수증_브론즈4_25304 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int N = scan.nextInt();
        int sum = 0;
        for(int i = 0; i < N; i++) {
            int price = scan.nextInt();
            int Q = scan.nextInt();
            sum += price * Q;
        }
        if(sum == T) System.out.println("Yes");
        else System.out.println("No");
    }
}
