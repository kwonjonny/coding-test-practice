package 알고리즘.큰돌의터전.일주차;

import java.util.*;

public class B1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        solution(str);
    }
    public static void solution(String str) {
        int[] array = new int[26];
        for(char x : str.toCharArray()) {
            array[x - 'a']++;
        }
        for(int x : array) {
            System.out.print(x + " ");
        }
    }

    /**
     * 재 복습: 2025-02-25
     */
    public static class B12 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            int[] alphabets = new int[26];
            for(int i = 0; i < str.length(); i++) {
                int findCharInt = str.charAt(i) - 'a';
                alphabets[findCharInt]++;
            }
            for(int x : alphabets) {
                System.out.print(x + " ");
            }
        }
    }


    /**
     * 재 복습: 2025-02-26
     */
    public static class B12_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            int[] alphabets = new int[26];
            for(char x : str.toCharArray()) {
                alphabets[x - 'a']++;
            }
            for(int x : alphabets) {
                System.out.print(x + " ");
            }
        }
    }
}
