package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 최대값_브론즈3_2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[9];
        for(int i = 0; i < 9; i++) {
            array[i] = scan.nextInt();
        }
        solution(array);
    }
    public static void solution(int[] array) {
        int max = 0;
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
                answer = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(answer);
    }
}
