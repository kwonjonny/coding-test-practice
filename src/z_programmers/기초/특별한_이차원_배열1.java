package z_programmers.기초;

import java.util.*;

/**
 * 문제 설명
 * 정수 n이 매개변수로 주어질 때, 다음과 같은 n × n 크기의 이차원 배열 arr를 return 하는 solution 함수를 작성해 주세요.
 *
 * arr[i][j] (0 ≤ i, j < n)의 값은 i = j라면 1, 아니라면 0입니다.
 * 제한사항
 * 1 ≤ n ≤ 100
 * 입출력 예
 * n	result
 * 3	[[1, 0, 0], [0, 1, 0], [0, 0, 1]]
 * 6	[[1, 0, 0, 0, 0, 0], [0, 1, 0, 0, 0, 0], [0, 0, 1, 0, 0, 0], [0, 0, 0, 1, 0, 0], [0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 0, 1]]
 * 1	[[1]]
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 예제 1번의 n의 값은 3으로 다음과 같이 2차원 배열을 채울 수 있습니다.
 * i \ j	0	1	2
 * 0	1	0	0
 * 1	0	1	0
 * 2	0	0	1
 * 따라서 [[1, 0, 0], [0, 1, 0], [0, 0, 1]]을 return 합니다.
 * 입출력 예 #2
 *
 * 예제 2번의 n의 값은 6으로 다음과 같이 2차원 배열을 채울 수 있습니다.
 * i \ j	0	1	2	3	4	5
 * 0	1	0	0	0	0	0
 * 1	0	1	0	0	0	0
 * 2	0	0	1	0	0	0
 * 3	0	0	0	1	0	0
 * 4	0	0	0	0	1	0
 * 5	0	0	0	0	0	1
 * 따라서 [[1, 0, 0, 0, 0, 0], [0, 1, 0, 0, 0, 0], [0, 0, 1, 0, 0, 0], [0, 0, 0, 1, 0, 0], [0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 0, 1]]을 return 합니다.
 * 입출력 예 #3
 *
 * 예제 1번의 n의 값은 1이고 다음과 같이 2차원 배열을 채울 수 있습니다.
 * i \ j	0
 * 0	1
 * 따라서 [[1]]을 return 합니다.
 */
public class 특별한_이차원_배열1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] answer = solution(N);
        System.out.println(Arrays.toString(answer));
    }
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) answer[i][j] = 1;
                else answer[i][j] = 0;
            }
        }
        return answer;
    }
}
