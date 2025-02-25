package 알고리즘.큰돌의터전.일주차;

import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int T = scan.nextInt();
        int[] array = new int[L];
        for (int i = 0; i < L; i++) {
            array[i] = scan.nextInt();
        }
        if (T > 200000) {
            System.out.println(0);
        } else {
            int cnt = 0;
            for (int i = 0; i < L; i++) {
                for (int j = i + 1; j < L; j++) {
                    if (array[i] + array[j] == T) {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
