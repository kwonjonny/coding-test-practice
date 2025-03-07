package z_baekjoon.구현.브론즈;

import java.util.*;

public class 십부제_브론즈4_10797 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[5];
        for(int i = 0; i < 5; i++) {
            array[i] = scan.nextInt();
        }
        int answer = 0;
        for(int x : array) {
            if(x == N) answer++;
        }
        System.out.println(answer);
    }
}
