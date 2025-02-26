package 알고리즘.큰돌의터전.일주차;

import java.util.*;

public class F1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char findChar = str.charAt(i);
            if (Character.isLowerCase(findChar)) {
                int findCharInt = findChar - 'a';
                char c = (char) ('a' + (findCharInt + 13) % 26);
                stringBuilder.append(c);
            } else if (Character.isUpperCase(findChar)) {
                int findCharInt = findChar - 'A';
                char c = (char) ('A' + (findCharInt + 13) % 26);
                stringBuilder.append(c);
            } else stringBuilder.append(findChar);
        }

        System.out.println(stringBuilder.toString());
    }
    
    /**
     * 재 복습: 2025-02-25
     */
    public static class F12 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char findChar = str.charAt(i);
                if (Character.isUpperCase(findChar)) {
                    int parseIntChar = findChar - 'A';
                    char parseChar = (char) ('A' + (parseIntChar + 13) % 26);
                    stringBuilder.append(parseChar);
                } else if (Character.isLowerCase(findChar)) {
                    int parseIntChar = findChar - 'a';
                    char parseChar = (char) ('a' + (parseIntChar + 13) % 26);
                    stringBuilder.append(parseChar);
                } else {
                    stringBuilder.append(findChar);
                }
            }
            System.out.println(stringBuilder.toString());
        }
    }


    /**
     * 재 복습: 2025-02-26
     */
    public static class F12_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            StringBuilder ret = new StringBuilder();
            for(int i = 0; i < str.length(); i++) {
                char findChar = str.charAt(i);
                if(Character.isLowerCase(findChar)) {
                    int parseInt = findChar - 'a';
                    char parseChar = (char) ('a' + (parseInt + 13) % 26);
                    ret.append(parseChar);
                } else if (Character.isUpperCase(findChar)) {
                    int parseInt = findChar - 'A';
                    char parseChar = (char) ('A' +( parseInt + 13) % 26);
                    ret.append(parseChar);
                } else {
                    ret.append(findChar);
                }
            }
            System.out.println(ret.toString());
        }
    }
}
