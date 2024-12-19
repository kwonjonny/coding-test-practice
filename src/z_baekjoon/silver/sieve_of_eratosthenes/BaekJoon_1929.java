package z_baekjoon.silver.sieve_of_eratosthenes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 문제
 * M이상 N 이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 * <p>
 * 입력
 * 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
 * <p>
 * 출력
 * 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 * <p>
 * 예제 입력
 * 3 16
 * <p>
 * 예제 출력
 * 3
 * 5
 * 7
 * 11
 * 13
 */
public class BaekJoon_1929 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer m = scan.nextInt();
        Integer n = scan.nextInt();

        for (int x : solution(m, n)) {
            System.out.println(x);
        }
    }

    public static List<Integer> solution(Integer m, Integer n) {
        int[] answer = new int[n + 1];
        List<Integer> list = new ArrayList<>();

        answer[1] = 1;

        for (int i = 2; i * i <= n; i++) {
            if (answer[i] == 0) {
                for (int j = i * i; j <= n; j += i) {
                    answer[j] = 1;
                }
            }
        }

        for (int i = m; i <= n; i++) {
            if (answer[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
