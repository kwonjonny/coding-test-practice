package java_알고리즘_문제풀이_입문_코딩테스트_대비.투포인터_슬라이딩윈도우;

import java.util.*;

public class F_최대_길이_연속부분수열6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        int answer = solution(N, T, array);
        System.out.println(answer);
    }
    public static int solution(int N, int T, int[] array) {
        int lt = 0;
        int zeroCount = 0;
        int maxLength = 0;
        for(int right = 0; right < N; right++) {
            if(array[right] == 0) zeroCount++;
            while(zeroCount > T) {
                if(array[lt] == 0) zeroCount--;
                lt++;
            }
            maxLength = Math.max(maxLength, right - lt + 1);
        }
        return maxLength;
    }
}
