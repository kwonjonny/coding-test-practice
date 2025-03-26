package z_baekjoon.구현.브론즈;

import java.util.*;

public class 베라의_패션_브론즈4_15439 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        solution(N);
    }
    public static void solution(int N) {
        int answer = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(i != j) answer++;
            }
        }
        System.out.println(answer);
    }
}
