package z_baekjoon.완전탐색.브론즈;

import java.util.Scanner;

public class 삼육구_브론즈3_17614 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        solution(N);
    }
    public static void solution(int N) {
        int answer = 0;
        for(int i = 1; i <= N; i++) {
            String number = String.valueOf(i);
            for(char x : number.toCharArray()) {
                if(x == '3' || x == '6' || x == '9') {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
