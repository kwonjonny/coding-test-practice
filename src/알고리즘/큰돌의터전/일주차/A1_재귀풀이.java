package 알고리즘.큰돌의터전.일주차;

import java.util.*;

public class A1_재귀풀이 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[9];
        for (int i = 0; i < 9; i++) {
            array[i] = scan.nextInt();
        }
        makeCombination(array, 7, 0, 0, new int[7]);
    }

    public static void makeCombination(int[] array, int T, int start, int depth, int[] result) {
        if (depth == T) {
            solve(result);
            return;
        }
        for (int i = start; i < array.length; i++) {
            result[depth] = array[i];
            makeCombination(array, T, depth + 1, i + 1, result);
        }
    }

    public static void solve(int[] result) {
        int sum = Arrays.stream(result).sum();
        if (sum == 100) {
            Arrays.sort(result);
            for (int x : result) {
                System.out.println(x);
            }
        }
        System.exit(0);
    }


}
