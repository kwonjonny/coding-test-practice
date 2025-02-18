package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 팰린드롬수_브론즈1_1259 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int N = scan.nextInt();
            if(N == 0) break;

            String parse = String.valueOf(N);
            String reverse = new StringBuilder(parse).reverse().toString();
            if(parse.equals(reverse)) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
