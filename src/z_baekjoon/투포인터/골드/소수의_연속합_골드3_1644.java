package z_baekjoon.투포인터.골드;


import java.util.*;

public class 소수의_연속합_골드3_1644 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        solution(T);
    }

    public static void solution(int T) {
        int[] array = new int[T + 1];
        for (int i = 2; i * i <= T; i++) {
            if (array[i] == 0) {
                for (int j = i * i; j <= T; j = j + i) {
                    array[j] = 1;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < array.length; i++) {
            if (array[i] != 1) {
                list.add(i);
            }
        }

        int left = 0;
        int currentSum = 0;
        int answer = 0;
        for(int right = 0; right < list.size(); right++) {
            currentSum += list.get(right);
            if(currentSum == T) answer++;
            while(currentSum > T) {
                currentSum -= list.get(left++);
                if(currentSum == T) answer++;
            }
        }
        System.out.println(answer);
    }
}
