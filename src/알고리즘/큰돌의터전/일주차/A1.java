package 알고리즘.큰돌의터전.일주차;

import java.util.*;
public class A1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[9];
        int sum = 0;
        for(int i = 0; i < 9; i++) {
            array[i] = scan.nextInt();
            sum += array[i];
        }
        Arrays.sort(array);
        for(int i = 0; i < 9; i++) {
            for(int j = i; j < 9; j++) {
                if(sum - array[i] - array[j] == 100) {
                    for(int k = 0; k < 9; k++) {
                        if(i == k || j == k) {
                            continue;
                        }
                        System.out.println(array[k]);
                    }
                    System.exit(0);
                }
            }
        }
    }

    /**
     * 재 복습: 2025-02-25
     */
    public static class A12 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[] array = new int[9];
            int sum = 0;
            for(int i = 0; i < 9; i++) {
                array[i] = scan.nextInt();
                sum += array[i];
            }
            Arrays.sort(array);

            for(int i = 0; i < 9; i++) {
                for(int j = 0; j < 9; j++) {
                    if(sum - array[i] - array[j] == 100) {
                        for(int k = 0;  k < 9; k++) {
                            if(i == k || j == k) continue;
                            System.out.println(array[k]);
                        }
                        System.exit(0);
                    }
                }
            }
        }
    }
}
