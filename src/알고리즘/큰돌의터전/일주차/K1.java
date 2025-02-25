package 알고리즘.큰돌의터전.일주차;

import java.util.Scanner;

public class K1 {
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

    /**
     * 재 복습: 2025-02-25
     */
    public static class K12 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            int[] alphabets = new int[128];
            for(char x : str.toCharArray()) {
                alphabets[x]++;
            }

            Character mid = null;
            int flag = 0;
            StringBuilder ret = new StringBuilder();

            for(int i = 'Z'; i >= 'A'; i--) {
                if(alphabets[i] > 0) {
                    if(alphabets[i] % 2 == 1) {
                        mid = (char) i;
                        flag++;
                        alphabets[i]--;
                    }
                    if(flag == 2) break;

                    for(int j = 0; j < alphabets[i]; j = j + 2) {
                        ret.insert(0, (char) i);
                        ret.append((char) i);
                    }
                }
            }

            if(mid != null) {
                ret.insert(ret.length() / 2, mid);
            }
            if(flag == 2) {
                System.out.println("I'm Sorry Hansoo");
            } else {
                System.out.println(ret.toString());
            }
        }
    }
}
