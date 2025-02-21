package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 킹_퀸_룩_비숍_나이트_폰_브론즈5_3003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] intArray = new int[6];
        for(int i = 0; i < 6; i++) {
            intArray[i] = scan.nextInt();
        }
        solution(intArray);
    }
    public static void solution(int[] intArray) {
        int[] array = {1, 1, 2, 2, 2, 8};

        for(int i = 0; i < intArray.length; i++) {
            array[i] = array[i] - intArray[i];
        }

        for(int x: array) {
            System.out.print(x + " ");
        }
    }
}
