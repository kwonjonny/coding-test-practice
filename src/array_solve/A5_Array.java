package array_solve;

import java.util.Scanner;

/**
 * 소수(에라토스테네스 체)
 *
 * 설명:
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 *
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 *
 * 입력:
 *  - 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 *
 * 출력:
 * - 첫 줄에 소수의 개수를 출력합니다.
 *
 * 예제:
 * 입력:
 *  20
 *
 * 출력:
 *  8
 */
public class A5_Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer count = scan.nextInt();
        Integer solution = solution(count);
        System.out.println(solution);
    }

    public static Integer solution(Integer count) {
        int answer = 0;
        int[] ch = new int[count + 1];

        for(int i = 2; i <= count; i++) {
            if(ch[i] == 0) {
                answer++;
                for (int j = i; j <= count; j  = j + i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }
}