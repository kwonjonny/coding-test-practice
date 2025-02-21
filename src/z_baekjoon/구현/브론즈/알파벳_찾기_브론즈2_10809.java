package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 알파벳_찾기_브론즈2_10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        solution(str);
    }
    public static void solution(String str) {
        int[] alphabets = new int[26];
        for(int i = 0; i < 26; i++) {
            alphabets[i] = -1;
        }

        for(int i = 0; i < str.length(); i++) {
            int parseInt = str.charAt(i) - 'a';
            if(alphabets[parseInt] == -1) {
                alphabets[parseInt] = i;
            }
        }

        for(int x: alphabets) {
            System.out.print(x + " ");
        }
    }
}
