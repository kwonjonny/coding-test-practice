package z_baekjoon.투포인터.실버;

import java.util.*;

public class 배열_합치기_실버5_11728 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();
        int[] array1 = new int[N];
        int[] array2 = new int[T];
        for(int i = 0; i < N; i++) {
            array1[i] = scan.nextInt();
        }
        for(int i = 0; i < T; i++) {
            array2[i] = scan.nextInt();
        }
        solution(array1, array2);
    }
    public static void solution(int[] array1, int[] array2) {
        int p1 = 0;
        int p2 = 0;
        int[] answer = new int[array1.length + array2.length];
        int p3 = 0;
        while(p1 < array1.length && p2 < array2.length) {
            if(array1[p1] < array2[p2]) answer[p3++] = array1[p1++];
            else answer[p3++] = array2[p2++];
        }
        while(p1 < array1.length) answer[p3++] = array1[p1++];
        while(p2 < array2.length) answer[p3++] = array2[p2++];

        StringBuilder sb = new StringBuilder();
        for(int x : answer) {
            sb.append(x).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
