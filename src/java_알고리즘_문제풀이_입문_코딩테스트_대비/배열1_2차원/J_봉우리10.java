package java_알고리즘_문제풀이_입문_코딩테스트_대비.배열1_2차원;

/**
 * 10. 봉우리
 * 설명
 * <p>
 * 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
 * <p>
 * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
 * <p>
 * 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
 * <p>
 * 만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
 * <p>
 * 0 0 0 0 0 0 0
 * 0 5 3 7 2 3 0
 * 0 3 7 1 6 1 0
 * 0 7 2 5 3 4 0
 * 0 4 3 6 4 1 0
 * 0 8 7 3 5 2 0
 * 0 0 0 0 0 0 0
 * <p>
 * 입력
 * <p>
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * <p>
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 봉우리의 개수를 출력하세요.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     5
     5 3 7 2 3
     3 7 1 6 1
     7 2 5 3 4
     4 3 6 4 1
     8 7 3 5 2
 * 예시 출력 1
 * <p>
 * 10
 */

import java.util.Scanner;

public class J_봉우리10 {
    
    public static class J_봉우리10_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[][] array = new int[N][N];
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    array[i][j] = scan.nextInt();
                }
            }
            solution(N, array);
        }
        public static void solution(int N, int[][] array) {
            int[] nx = {-1, 0, 1, 0};
            int[] ny = {0, 1, 0, - 1};
            int cnt = 0;
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    boolean isPeak = true;
                    for(int k = 0; k < 4; k++) {
                        int tx = i + nx[k];
                        int ty = j + ny[k];
                        if(tx >= 0 && ty >= 0 && tx < N && ty < N) {
                            if(array[i][j] <= array[tx][ty]) {
                                isPeak = false;
                                break;
                            }
                        }
                    }
                    if(isPeak) cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
