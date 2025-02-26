package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 더하기_사이클_브론즈1_1110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = 0;
        int original = N;
        while(true) {
            int firstDigit = N / 10;
            int secondDigit = N % 10;
            int sum = firstDigit + secondDigit;
            N = (secondDigit * 10) + (sum % 10);
            count++;
            if(original == N) break;
        }
        System.out.println(count);
    }
}
