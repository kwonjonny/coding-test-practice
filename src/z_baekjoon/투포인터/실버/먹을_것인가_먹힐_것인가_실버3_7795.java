package z_baekjoon.투포인터.실버;

import java.util.*;

public class 먹을_것인가_먹힐_것인가_실버3_7795 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 0; i < T; i++) {
            int K = scan.nextInt();
            int P = scan.nextInt();
            int[] array1 = new int[K];
            int[] array2 = new int[P];

            for(int j = 0; j < K; j++) {
                array1[j] = scan.nextInt();
            }
            for(int j = 0; j < P; j++) {
                array2[j] = scan.nextInt();
            }
            solution(array1, array2);
        }
    }
    public static void solution(int[] array1, int[] array2) {
        Arrays.sort(array1); Arrays.sort(array2);
        int p2 = 0;
        int answer = 0;
        for(int x : array1) {
            while(p2 < array2.length && x > array2[p2]) {
                p2++;
            }
            answer = answer + p2;
        }
        System.out.println(answer);
    }
}
