package z_baekjoon.구현.브론즈;

import java.util.*;

public class 대표값_브론즈2_2587 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i < 5; i++) {
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        int sum = 0;
        for(int x : array) {
            sum += x;
        }

        System.out.println(sum / array.length);
        System.out.println(array[array.length / 2]);
    }
}
