package z_baekjoon.구현.브론즈;

import java.util.Arrays;
import java.util.Scanner;

public class 일곱_난쟁이_브론즈1_2309 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 9;
        int sum = 0;
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
            sum += array[i];
        }

        Arrays.sort(array);
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(sum - array[i] - array[j] == 100) {
                    for(int k = 0; k < N; k++) {
                        if(k == i || k == j) {
                            continue;
                        }
                        System.out.println(array[k]);
                    }
                    System.exit(0);
                }
            }
        }
    }
}
