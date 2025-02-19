package z_baekjoon.투포인터.골드;

import java.util.*;

public class 두_용액_골드5_2470 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        solution(N, array);
    }
    public static void solution(int N, int[] array) {
        Arrays.sort(array);

        int left = 0;
        int right = array.length - 1;
        int[] answer = new int[2];
        int closestSum = Integer.MAX_VALUE;

        while (right > left) {
            int currentSum = array[left] + array[right];
            if(Math.abs(currentSum) < Math.abs(closestSum)) {
                closestSum = currentSum;
                answer[0] = array[left];
                answer[1] = array[right];
            }
            if(currentSum == 0) {
                break;
            }
            if(currentSum > 0) right--;
            else left++;
        }
        for(int x : answer) {
            System.out.println(x);
        }
    }
}
