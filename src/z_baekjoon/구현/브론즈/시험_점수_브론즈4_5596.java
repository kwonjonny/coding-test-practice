package z_baekjoon.구현.브론즈;

import java.util.*;

public class 시험_점수_브론즈4_5596 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 4;
        int minGuk = 0;
        int manSae = 0;
        for(int i = 0; i < N; i++) {
            minGuk = minGuk + scan.nextInt();
        }
        for(int i = 0; i < N; i++) {
            manSae = manSae + scan.nextInt();
        }
        int answer = Math.max(minGuk, manSae);
        System.out.println(answer);
    }
}
