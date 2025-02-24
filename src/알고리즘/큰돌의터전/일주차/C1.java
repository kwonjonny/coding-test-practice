package 알고리즘.큰돌의터전.일주차;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int[] array = new int[101];
        for(int i = 0; i < 3; i++) {
            int start = scan.nextInt();
            int end = scan.nextInt();
            for(int j = start; j < end; j++) {
                array[j]++;
            }
        }

        int answer = 0;
        for(int i = 1; i < 100; i++) {
            if(array[i] != 0) {
                if(array[i] == 1) answer += A * array[i];
                else if(array[i] == 2) answer += B * array[i];
                else if(array[i] == 3) answer += C * array[i];
            }
        }
        System.out.println(answer);
    }

    /**
     * 재 복습: 2025-02-25
     */
    public static class C12 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();

            int[] array = new int[101];
            for(int i = 0; i < 3; i++) {
                int start = scan.nextInt();
                int end = scan.nextInt();
                for(int j = start; j < end; j++) {
                    array[j]++;
                }
            }

            int answer = 0;
            for(int i = 1; i < 100; i++) {
                if(array[i] != 0) {
                    if(array[i] == 1) answer += array[i] * A;
                    else if(array[i] == 2) answer += array[i] * B;
                    else if(array[i] == 3) answer += array[i] * C;
                }
            }
            System.out.println(answer);
        }
    }
}
