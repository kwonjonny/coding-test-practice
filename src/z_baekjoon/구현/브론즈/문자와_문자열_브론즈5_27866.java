package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 문자와_문자열_브론즈5_27866 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int N = scan.nextInt();
        solution(str, N);
    }
    public static void solution(String str, int N) {
        System.out.println(str.charAt(N - 1));
    }
}
