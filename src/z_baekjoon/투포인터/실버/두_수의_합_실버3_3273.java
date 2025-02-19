package z_baekjoon.투포인터.실버;

import java.util.*;
public class 두_수의_합_실버3_3273 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        int answer = solution(N, array, target);
        System.out.println(answer);
    }
    public static int solution(int N, int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int answer = 0;
        Arrays.sort(array);
        while(left < right) {
            int currentSum = array[left] + array[right];
            if(currentSum == target) {
                answer++;
                left++;
                right--;
            }
            else if (target > currentSum) {
                left++;
            }
            else right--;
        }
       return answer;
    }
}
