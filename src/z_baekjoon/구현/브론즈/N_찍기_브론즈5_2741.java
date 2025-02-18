package z_baekjoon.구현.브론즈;

import java.util.*;

public class N_찍기_브론즈5_2741 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        solution(N);
    }
    public static void solution(int N) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 1; i<= N; i++) {
            answer.add(i);
        }
        Collections.sort(answer);
        for(int x : answer) {
            System.out.println(x);
        }
    }
}
