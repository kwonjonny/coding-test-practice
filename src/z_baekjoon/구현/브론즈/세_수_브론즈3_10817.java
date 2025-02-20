package z_baekjoon.구현.브론즈;

import java.util.*;
public class 세_수_브론즈3_10817 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();
        solution(first, second, third);
    }
    public static void solution(int first, int second, int third) {
        int[] array = new int[3];
        array[0] = first; array[1] = second; array[2] = third;
        Arrays.sort(array);
        System.out.println(array[1]);
    }
}
