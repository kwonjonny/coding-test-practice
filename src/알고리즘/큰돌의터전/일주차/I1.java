package 알고리즘.큰돌의터전.일주차;

import java.util.*;

public class I1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();

        Map<String, Integer> stringKeyMap = new HashMap<>();
        Map<Integer, String> integerKeyMap = new HashMap<>();
        for(int i = 1; i <= N; i++) {
            String name = scan.next();
            stringKeyMap.put(name, i);
            integerKeyMap.put(i, name);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < T; i++) {
            String str = scan.next();
            if(Character.isDigit(str.charAt(0))) {
                String value = integerKeyMap.get(Integer.parseInt(str));
                stringBuilder.append(value).append("\n");
            }
            else {
                int key = stringKeyMap.get(str);
                stringBuilder.append(key).append("\n");
            }
        }
        System.out.println(stringBuilder.toString());
    }

    /**
     * 재 복습: 2025-02-25
     */
    public static class I12 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int L = scan.nextInt();
            int T = scan.nextInt();
            Map<String, Integer> stringMap = new HashMap<>();
            Map<Integer, String> integerMap = new HashMap<>();
            for(int i = 1; i <= L; i++) {
                String str = scan.next();
                stringMap.put(str, i);
                integerMap.put(i, str);
            }

            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < T; i++) {
                String str = scan.next();
                if(Character.isDigit(str.charAt(0))) {
                    String x = integerMap.get(Integer.parseInt(str));
                    stringBuilder.append(x).append("\n");
                }
                else {
                    int x = stringMap.get(str);
                    stringBuilder.append(x).append("\n");
                }
            }
            System.out.println(stringBuilder.toString());
        }
    }
}