package z_baekjoon.bronze;

import java.util.Scanner;

/**
 * 문제 A+B - 2
 * <p>
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * <p>
 * 입력
 * 첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
 * <p>
 * 출력
 * 첫째 줄에 A+B를 출력한다
 * <p>
 * 예제 입력
 * 1
 * 2
 * <p>
 * 예제 출력
 * 3
 */
public class Bronze5_1000 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer a = scan.nextInt();
        Integer b = scan.nextInt();
        System.out.println(solution(a, b));
    }

    public static Integer solution(Integer a, Integer b) {
        return a + b;
    }
}
