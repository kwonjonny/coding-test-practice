package z_baekjoon.구현.브론즈;

import java.util.*;

public class 주사위_게임_브론즈3_2476 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int maxPrize = 0;

        for(int i = 0; i < T; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            int answer = 0;
            if(a == b && b == c) {
                answer = 10000 + a * 1000;
            }
            else if (a == b || a == c) {
                answer = 1000 + a * 100;
            }
            else if (b == c) {
                answer = 1000 + b * 100;
            }
            else {
                int max = Math.max(a, Math.max(b, c));
                answer = max * 100;
            }

            if(answer > maxPrize) maxPrize = answer;
        }
        System.out.println(maxPrize);
    }
}
