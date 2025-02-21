package z_baekjoon.구현.브론즈;

import java.util.*;

public class 태보태보_총난타_브론즈2_17249 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String[] parts = str.split("0");
        int left = partsLeft(parts[0]);
        int right = partsRight(parts[1]);
        System.out.println(left + " " + right);
    }
    public static int partsLeft(String parts) {
        int cnt = 0;
        for(int i = 0; i < parts.length() - 1; i++) {
            if((parts.charAt(i + 1) == '@') || parts.charAt(i + 1) == '(') {
                cnt++;
            }
        }
        return cnt;
    }

    public static int partsRight(String parts) {
        int cnt = 0;
        for(int i = 1; i < parts.length() - 1; i++) {
            if((parts.charAt(i + 1) == '@')) {
                cnt++;
            }
        }
        return cnt;
    }

}
