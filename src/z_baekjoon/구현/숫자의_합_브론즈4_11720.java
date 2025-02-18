package z_baekjoon.구현;

import java.util.*;

public class 숫자의_합_브론즈4_11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String K = scan.next();
        solution(N, K);
    }
    public static void solution(int N, String K) {
       int sum = 0;
       for(char x : K.toCharArray()) {
           sum += x - '0';
       }
        System.out.println(sum);
    }
}
