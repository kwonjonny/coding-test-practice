package z_baekjoon.구현.실버;

import java.util.Scanner;

public class 숫자_빈도수_실버5_14912 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int T = scan.nextInt();
        int answer = 0;
        for(int i = 1; i <= L; i++) {
            String x = String.valueOf(i);
            for(char y : x.toCharArray()) {
                char c = String.valueOf(T).charAt(0);
                if(y == c) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
