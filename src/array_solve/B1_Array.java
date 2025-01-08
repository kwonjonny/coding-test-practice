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
 *
     5
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

    /**
     * 왜 틀렷을까? 상 하 좌 우 에 대한 필요성, 3중 for 문에 대한 이해도가 부족해
     * 재 복습: 2024-12-20
     */
    public static class B1Array2 {
        public static void main(String[] args) {
            B1Array2 b1Array2 = new B1Array2();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[][] intArray = new Integer[count][count];
            for(int i = 0; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            System.out.println(b1Array2.solution(count, intArray));
        }
        public Integer solution(Integer count, Integer[][] intArray) {
            int[] dx = {-1, 0, 1, 0};
            int[] dy = {0, 1, 0 ,-1};
            int cnt = 0;

            for(int i = 0; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    boolean isPeak = true;
                    for(int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if(nx >= 0 && nx < count && ny >= 0 && ny < count) {
                            if(intArray[i][j] <= intArray[nx][ny]) {
                                isPeak = false;
                                break;
                            }
                        }

                    }
                    if(isPeak) cnt++;
                }
            }
            return cnt;
        }
    }

    /**
     * 재 복습: 2024-12-21
     */
    public static class B1Array3 {
        public static void main(String[] args) {
            B1Array3 b1Array3 = new B1Array3();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[][] intArray = new Integer[count][count];
            for(int i = 0; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            System.out.println(b1Array3.solution(count, intArray));
        }
        public Integer solution(Integer count, Integer[][] intArray) {
            int[] nx = {-1, 0, 1, 0};
            int[] ny = {0, 1, 0 ,-1};
            int cnt = 0;

            for(int i = 0; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    boolean isPeak = true;

                    for(int k = 0; k < 4; k++) {
                        int dx = i + nx[k];
                        int dy = j + ny[k];

                        if(dx >= 0 && dx < count && dy >= 0 && dy < count) {
                            if(intArray[i][j] <= intArray[dx][dy]) {
                                isPeak = false;
                                break;
                            }
                        }
                    }
                    if(isPeak) cnt++;
                }
            }
            return cnt;
        }
    }

    /**
     * 재 복습: 2024-12-23
     */
    public static class B1Array4 {
        public static void main(String[] args) {
            B1Array4 b1Array4 = new B1Array4();
            Scanner scan = new Scanner(System.in);
            int count = scan.nextInt();
            int[][] intArray = new int[count][count];
            for(int i = 0; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            System.out.println(b1Array4.solution(count, intArray));
        }
        public Integer solution(int count, int[][] intArray) {
            int answer = 0;
            int[] nx = {-1, 0, 1, 0};
            int[] ny = {0, -1, 0 ,1};

            for(int i = 0; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    boolean isPeak = true;

                    for(int k = 0; k < 4; k++) {
                        int dx = i + nx[k];
                        int dy = j + ny[k];

                        if(dx >= 0 && dx < count && dy >= 0 && dy < count) {
                            if(intArray[i][j] <= intArray[dx][dy]) {
                                isPeak = false;
                                break;
                            }
                        }
                    }
                    if(isPeak) answer++;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-25
     */
    public static class B1Array5 {
        public static void main(String[] args) {
            B1Array5 b1Array5 = new B1Array5();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[][] intArray = new Integer[count][count];
            for(int i = 0; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            System.out.println(b1Array5.solution(count, intArray));
        }
        public Integer solution(Integer count, Integer[][] intArray) {
            Integer answer = 0;

            int[] dx = {-1, 0, 1, 0};
            int[] dy = {0, 1, 0, -1};

            for(int i = 0; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    boolean isPeak = true;

                    for(int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if(nx >= 0 && nx < count && ny >= 0 && ny < count) {
                            if(intArray[i][j] <= intArray[nx][ny]) {
                                isPeak = false;
                                break;
                            }
                        }
                    }
                    if(isPeak) answer++;
                }
            }

            return answer;
        }
    }

    /**
     * 재 복습:2024-12-31
     */
    public static class B1Array6 {
        public static void main(String[] args) {
            B1Array6 b1Array6 = new B1Array6();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[][] intArray = new Integer[length][length];
            for(int i = 0; i < length; i++) {
                for(int j = 0; j < length; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            Integer answer = b1Array6.solution(length, intArray);
            System.out.println(answer);
        }
        public Integer solution(Integer length, Integer[][] intArray) {
            Integer answer = 0;
            int[] dx = {-1, 0, 1, 0};
            int[] dy = {0, 1, 0, -1};
            for(int i = 0; i < length; i++) {
                for(int j = 0; j < length; j++) {
                    boolean isPeak = true;
                    for(int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if(nx >= 0 && nx < length && ny >= 0 && ny < length) {
                            if(intArray[i][j] < intArray[nx][ny]) {
                                isPeak = false;
                                break;
                            }
                        }
                    }
                    if(isPeak) answer++;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class B1Array7 {
        public static void main(String[] args) {
            B1Array7 b1Array7 = new B1Array7();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[][] intArray = new Integer[count][count];
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            b1Array7.solution(count, intArray);
        }
        public void solution(Integer length, Integer[][] intArray) {
            int cnt = 0;
            int[] tx = {-1, 0, 1, 0};
            int[] ty = {0, 1, 0, -1};
            for(int i = 0; i < length; i++) {
                for(int j = 0; j < length; j++) {
                    boolean isPeak = true;
                    for(int k = 0; k < 4; k++) {
                        int nx = i + tx[k];
                        int ny = j + ty[k];
                        if (nx >= 0 && nx < length && ny >= 0 && ny < length) {
                            if (intArray[i][j] <= intArray[nx][ny]) {
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