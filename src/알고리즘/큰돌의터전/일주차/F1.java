package 알고리즘.큰돌의터전.일주차;

import java.util.*;

public class F1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char findChar = str.charAt(i);
            if(Character.isLowerCase(findChar)) {
              int findCharInt = findChar - 'a';
              char c = (char) ('a' + (findCharInt + 13) % 26);
              stringBuilder.append(c);
            }
            else if (Character.isUpperCase(findChar)) {
                int findCharInt = findChar - 'A';
                char c = (char) ('A' + (findCharInt + 13) % 26);
                stringBuilder.append(c);
            }
            else stringBuilder.append(findChar);
        }

        System.out.println(stringBuilder.toString());
    }
}
