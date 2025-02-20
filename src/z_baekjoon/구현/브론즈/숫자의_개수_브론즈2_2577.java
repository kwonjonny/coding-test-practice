package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 숫자의_개수_브론즈2_2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        solution(A, B, C);
    }
    public static void solution(int A, int B, int C) {
        int plex = A * B * C;
        String valueOfString = String.valueOf(plex);
        int[] nine = new int[10];
        for(int i = 0; i < valueOfString.length(); i++) {
            int X = valueOfString.charAt(i) - '0';
            nine[X]++;
        }
        for(int x : nine) {
            System.out.println(x + " ");
        }
    }
}
