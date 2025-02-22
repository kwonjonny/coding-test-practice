package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 알파벳_개수_브론즈4_10808 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        solution(str);
    }
    public static void solution(String str) {
        int[] charArray = new int[28];
        for(char x : str.toCharArray()) {
            int findChar = x - 'a';
            charArray[findChar]++;
        }

        for(int x : charArray) {
            System.out.print(x + " ");
        }
    }
}
