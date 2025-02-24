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
}
