package 알고리즘.큰돌의터전.일주차;

import java.util.*;

public class E1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] alphabets = new int[28];
        for(int i = 0; i < T; i++) {
            String str = scan.next();
            for(int j = 0; j < 1; j++) {
                int findCharInt = str.charAt(j) - 'a';
                alphabets[findCharInt]++;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 28; i++) {
            if(alphabets[i] >= 5) {
                stringBuilder.append((char) ('a' + i));
            }
        }
        if(stringBuilder.length() == 0) stringBuilder.append("PREDAJA");

        System.out.println(stringBuilder);
    }

    /**
     * 재 복습: 2025-02-25
     */
    public static class E12 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();

            int[] alphabets = new int[26];
            for(int i = 0; i < N; i++) {
                String str = scan.next();
                for(int j = 0; j < 1; j++) {
                    char findChar = str.charAt(j);
                    alphabets[findChar - 'a']++;
                }
            }

            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < 26; i++) {
                if(alphabets[i] >= 5) {
                    stringBuilder.append((char) ('a' + i));
                }
            }
            if(stringBuilder.length() == 0) stringBuilder.append("PREDAJA");
            System.out.println(stringBuilder.toString());
        }
    }


    /**
     * 재 복습: 2025-02-26
     */
    public static class E12_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int L = scan.nextInt();
            int[] alphabets = new int[26];

            for(int i = 0; i < L; i++) {
                String str = scan.next();
                for(int j = 0; j < 1; j++) {
                    char c = str.charAt(j);
                    alphabets[c - 'a']++;
                }
            }

            StringBuilder ret = new StringBuilder();
           for(int i = 0; i < alphabets.length; i++) {
               if(alphabets[i] >= 5) {
                   char c = (char) ('a' + i);
                   ret.append(c);
               }
           }
           if(ret.length() == 0) ret.append("PREDAJA");
            System.out.println(ret.toString());
        }
    }



}
