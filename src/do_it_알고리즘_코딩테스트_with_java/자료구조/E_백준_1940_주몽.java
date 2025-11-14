package do_it_알고리즘_코딩테스트_with_java.자료구조;

import java.util.*;

public class E_백준_1940_주몽 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        int lt = 0;
        int rt = N - 1;
        int count = 0;
        while(lt < rt) {
            int sum = array[lt] + array[rt];
            if(sum == T) {
                count++;
                lt++;
                rt--;
            }
            else if (sum > T) rt--;
            else lt++;
        }
        System.out.println(count);
    }
}
