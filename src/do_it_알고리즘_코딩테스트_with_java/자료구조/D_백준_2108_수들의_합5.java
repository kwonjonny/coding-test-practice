package do_it_알고리즘_코딩테스트_with_java.자료구조;

import java.util.*;
public class D_백준_2108_수들의_합5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum = 1;
        int count = 1;
        int startIdx = 1;
        int endIdx = 1;
        while(endIdx < N) {

            if(sum == N) {
                endIdx++;
                sum = sum + endIdx;
                count++;
            }
            else if (sum > N) {
                sum = sum - startIdx;
                startIdx++;
            }
            else {
                endIdx++;
                sum = sum + endIdx;
            }
        }
        System.out.println(count);
    }
}
