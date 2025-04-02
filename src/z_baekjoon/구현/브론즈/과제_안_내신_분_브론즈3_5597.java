package z_baekjoon.구현.브론즈;

import java.util.*;

public class 과제_안_내신_분_브론즈3_5597 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 28;
        boolean[] check = new boolean[31];
        for(int i = 1; i <= N; i++) {
            int T = scan.nextInt();
            check[T] = true;
        }
        solution(N, check);
    }
    public static void solution(int N, boolean[] check) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 1; i <= 30; i++) {
            if(!check[i]) {
                answer.add(i);
            }
        }
        for(int x : answer) {
            System.out.println(x);
        }
    }
}
