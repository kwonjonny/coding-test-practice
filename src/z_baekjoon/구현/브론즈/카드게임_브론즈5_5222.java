package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 카드게임_브론즈5_5222 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += scan.nextInt();
        }
        System.out.println(sum);
    }
}
