package z_baekjoon.구현.브론즈;

import java.util.*;

public class 피보나치수_5_브론즈2_10870 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        solution(T);
    }
    public static void solution(int T) {
        if(T == 0) {
            System.out.println(0);
            return;
        }

        List<Integer> answer = new ArrayList<>();
        int prev = 0;
        int next = 1;
        for(int i = 0; i < T; i++) {
            answer.add(next);
            int temp = next;
            next = prev + next;
            prev = temp;
        }
        System.out.println(answer.get(answer.size() - 1));
    }
}
