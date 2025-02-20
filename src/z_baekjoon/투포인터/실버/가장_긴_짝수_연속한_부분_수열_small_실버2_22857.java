package z_baekjoon.투포인터.실버;

import java.util.Scanner;

public class 가장_긴_짝수_연속한_부분_수열_small_실버2_22857 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int T = scan.nextInt();
        int[] array = new int[L];
        for(int i = 0; i < L; i++) {
            array[i] = scan.nextInt();
        }
        solution(L, T, array);
    }
    public static void solution(int L, int T, int[] array) {
        int left = 0, right = 0;
        int oddCount = 0;
        int evenLength  = 0;
        int answer = 0;
        while(right < L) {
            if(array[right] % 2 == 1) {
                oddCount++;
            }
            else {
                evenLength++;
            }

            while(oddCount > T) {
                if(array[left] % 2 == 1) {
                    oddCount--;
                }
                else {
                    evenLength--;
                }
                left++;
            }
            answer = Math.max(answer, evenLength);
            right++;
        }
        System.out.println(answer);
    }
}
