package do_it_알고리즘_코딩테스트_with_java.자료구조;

import java.util.*;
public class C_백준_11659_구간_합_구하기4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();
        long[] S = new long[N + 1];
        for(int i = 1; i <= N; i++) {
            S[i] = S[i - 1] + scan.nextInt();
        }
        for(int i = 0; i < T; i++) {
            int X = scan.nextInt();
            int Y = scan.nextInt();
            System.out.println(S[Y] - S[X - 1]);
        }
    }
}
