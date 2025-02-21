package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class OX퀴즈_브론즈2_8958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 0; i < T; i++) {
           String str = scan.next();
            solution(T, str);
        }
    }
    public static void solution(int T, String str) {
        int sum = 0;
        int totalScore = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'O') {
                sum++;
                totalScore += sum;
            }
            else {
                sum = 0;
            }
        }
        System.out.println(totalScore);
    }
}
