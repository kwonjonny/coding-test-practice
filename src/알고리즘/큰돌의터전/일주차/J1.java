package 알고리즘.큰돌의터전.일주차;

import java.util.Scanner;

public class J1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int[] array = new int[128];
        for(char x : str.toCharArray()) {
            array[x]++;
        }

        StringBuilder stringBuilder = new StringBuilder();
        Character mid = null;
        int flag = 0;
        for(int i = 'Z'; i >= 'A'; i--) {
            if(array[i] > 0) {
                if(array[i] % 2 == 1) {
                    flag++;
                    array[i]--;
                    mid = (char) i;
                }

                if(flag == 2) break;

                for(int j = 0; j < array[i]; j = j + 2) {
                    stringBuilder.insert(0, (char) i);
                    stringBuilder.append((char) i);
                }
            }
        }

        if(mid != null) {
            stringBuilder.insert(stringBuilder.length() / 2, mid);
        }

        if(flag == 2) {
            System.out.println("I'm Sorry Hansoo");
        } else {
            System.out.println(stringBuilder.toString());
        }
    }
}
