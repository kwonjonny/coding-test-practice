package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 단어_길이_재기_브론즈5_2743 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int answer = solution(str);
        System.out.println(answer);
    }
    public static int solution(String str) {
        return str.length();
    }
}
