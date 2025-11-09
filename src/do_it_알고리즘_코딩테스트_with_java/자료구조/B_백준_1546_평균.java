package do_it_알고리즘_코딩테스트_with_java.자료구조;

import java.util.*;
public class B_백준_1546_평균 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        long sum = 0;
        long max = 0;
        for(int i = 0; i < N; i++) {
            if(A[i] > max) max = A[i];
            sum += A[i];
        }
        System.out.println(sum * 100.0 / max / N);
    }
}