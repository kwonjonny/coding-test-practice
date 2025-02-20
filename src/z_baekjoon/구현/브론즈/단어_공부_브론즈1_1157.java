package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 단어_공부_브론즈1_1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        solution(str);
    }

    public static void solution(String str) {
        str = str.toUpperCase();
        int[] alphabet = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int findInteger = str.charAt(i) - 'A';
            alphabet[findInteger]++;
        }

        int maxIndex = 0;
        int maxCount = alphabet[0];
        boolean isDuplicate = false;
        for (int i = 1; i < 26; i++) {
            if (alphabet[i] > maxCount) {
                maxIndex = i;
                maxCount = alphabet[i];
                isDuplicate = false;
            } else if (alphabet[i] == maxCount) {
                isDuplicate = true;
            }
        }

        if (isDuplicate) {
            System.out.println("?");
        } else {
            char findChar = (char) (maxIndex + 'A');
            System.out.println(findChar);
        }
    }
}
