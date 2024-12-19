package array_solve;

import java.util.Scanner;

/**
 * 봉우리
 * <p>
 * 설명:
 * 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
 * <p>
 * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
 * <p>
 * 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
 * <p>
 * 만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
 * <p>
 * 0     0     0     0     0     0     0
 * 0    '5'    3    '7'    2    '3'    0
 * 0     3    '7'    1    '6'    1     0
 * 0    '7'    2     5     3    '4'    0
 * 0     4     3    '6'    4     1     0
 * 0    '8'    7     3    '5'    2     0
 * 0     0     0     0     0     0     0
 * <p>
 * <p>
 * <p>
 * 입력:
 * - 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * - 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 * <p>
 * 출력:
 * - 봉우리의 개수를 출력하세요.
 * <p>
 * 예제:
 * 입력:
 * 5
 5 3 7 2 3
 3 7 1 6 1
 7 2 5 3 4
 4 3 6 4 1
 8 7 3 5 2
 * <p>
 * 출력:
 * 10
 */
public class B1_Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer count = scan.nextInt();
        Integer[][] intArray = new Integer[count][count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                intArray[i][j] = scan.nextInt();
            }
        }
        System.out.println(solution(count, intArray));
    }

    public static Integer solution(Integer count, Integer[][] intArray) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int answer = 0;

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                boolean isPeak = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < count && ny >= 0 && ny < count) {
                        if (intArray[i][j] <= intArray[nx][ny]) {
                            isPeak = false;
                            break;
                        }
                    }
                }
                if (isPeak) answer++;
            }
        }
        return answer;
    }

    /**
     * 재 복습: 2024-12-18
     */
    public static class B1Array1 {
        public static void main(String[] args) {
            B1Array1 b1Array1 = new B1Array1();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[][] intArray = new Integer[count][count];
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            System.out.println(b1Array1.solution(count, intArray));
        }
        public Integer solution(Integer count, Integer[][] intArray) {
            int[] dx = {-1, 0, 1, 0};
            int[] dy = {0, 1, 0, -1};
            int answer = 0;
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    boolean isPeak = true;
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx >= 0 && nx < count && ny >= 0 && ny < count) {
                            if (intArray[i][j] <= intArray[nx][ny]) {
                                isPeak = false;
                                break;
                            }
                        }
                    }
                    if (isPeak) answer++;
                }
            }
            return answer;
        }
    }
}