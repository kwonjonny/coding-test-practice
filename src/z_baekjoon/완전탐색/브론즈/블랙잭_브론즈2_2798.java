package z_baekjoon.완전탐색.브론즈;

import java.util.*;
public class 블랙잭_브론즈2_2798 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();
        int[] array = new int[T];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        solution(N, T, array);
    }
    public static void solution(int N, int T, int[] array) {
        int max = 0;
        for(int i = 0; i < N - 2; i++) {
            for(int j = i + 1; j < N - 1; j++) {
                for(int k = j + 1; k < N; k++) {
                    int sum = array[i] + array[j] + array[k];
                    if(sum > max && sum <= T) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }


    public static class 블랙잭_브론즈2_2798_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            solution(N, T, array);
        }
        public static void solution(int N, int T, int[] array) {
            int answer = 0;
            for(int i = 0; i < N; i++) {
                for(int j = i + 1; j < N; j++) {
                    for(int k = j + 1; k < N; k++) {
                        int sum = array[i] + array[j] + array[k];
                        if(sum <= T && answer <= sum) {
                            answer = sum;
                        }
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
