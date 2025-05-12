package java_알고리즘_문제풀이_입문_코딩테스트_대비.배열1_2차원;

/**
 * 12. 멘토링
 * 설명
 * <p>
 * 현수네 반 선생님은 반 학생들의 수학점수를 향상시키기 위해 멘토링 시스템을 만들려고 합니다.
 * <p>
 * 멘토링은 멘토(도와주는 학생)와 멘티(도움을 받는 학생)가 한 짝이 되어 멘토가 멘티의 수학공부를 도와주는 것입니다.
 * <p>
 * 선생님은 M번의 수학테스트 등수를 가지고 멘토와 멘티를 정합니다.
 * <p>
 * 만약 A학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야 합니다.
 * <p>
 * M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 번째 줄에 반 학생 수 N(1<=N<=20)과 M(1<=M<=10)이 주어진다.
 * <p>
 * 두 번째 줄부터 M개의 줄에 걸쳐 수학테스트 결과가 학생번호로 주어진다. 학생번호가 제일 앞에서부터 1등, 2등, ...N등 순으로 표현된다.
 * <p>
 * 만약 한 줄에 N=4이고, 테스트 결과가 3 4 1 2로 입력되었다면 3번 학생이 1등, 4번 학생이 2등, 1번 학생이 3등, 2번 학생이 4등을 의미합니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 번째 줄에 짝을 만들 수 있는 총 경우를 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    4 3
    3 4 1 2
    4 3 2 1
    3 1 4 2
 * 예시 출력 1
 * <p>
 * 3
 * 힌트
 * <p>
 * 출력설명
 * <p>
 * (3, 1), (3, 2), (4, 2)와 같이 3가지 경우의 (멘토, 멘티) 짝을 만들 수 있다.
 */

import java.util.*;

public class L_멘토링12 {

    /**
     * 재 복습: 2025-05-12
     */
    public static class L_멘토링14_6 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            int[][] array = new int[T + 1][N + 1];
            for(int i = 1; i <= T; i++) {
                for(int j = 1; j <= N; j++) {
                    array[i][j] = scan.nextInt();
                }
            }
            solution(N, T, array);
        }
        public static void solution(int N, int T, int[][] array) {
            int answer = 0;
            for(int mentor = 1; mentor <= N; mentor++) {
                for(int mentee = 1; mentee <= N; mentee++) {
                    if(mentor == mentee) continue;
                    boolean canMentor = true;
                    for(int i = 1; i <= T; i++) {
                        int mentorScore = 0;
                        int menteeScore = 0;
                        for(int j = 1; j <= N; j++) {
                            if(array[i][j] == mentor) mentorScore = j;
                            if(array[i][j] == mentee) menteeScore = j;
                        }
                        if(mentorScore > menteeScore) {
                            canMentor = false;
                            break;
                        }
                    }
                    if(canMentor) answer++;
                }
            }
            System.out.println(answer);
        }
    }


    /**
     * 재 복습: 2025-05-08
     */
    public static class L_멘토링14_5 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            int[][] array = new int[T + 1][N + 1];
            for(int i = 1; i <= T; i++) {
                for(int j = 1; j <= N; j++) {
                    array[i][j] = scan.nextInt();
                }
            }
            solution(N, T, array);
        }
        public static void solution(int N, int T, int[][] array) {
            int answer = 0;
            for(int mentor = 1; mentor <= N; mentor++) {
                for(int mentee = 1; mentee <= N; mentee++) {
                    if(mentor == mentee) continue;
                    boolean canMentor = true;
                    for(int i = 1; i <= T; i++) {
                        int mentorScore = 0;
                        int menteeScore = 0;
                        for(int j = 1; j <= N; j++) {
                            if(array[i][j] == mentee) menteeScore = j;
                            if(array[i][j] == mentor) mentorScore = j;
                        }
                        if(mentorScore > menteeScore) {
                            canMentor = false;
                        }
                    }
                    if(canMentor) answer++;
                }
            }
            System.out.println(answer);
        }
    }


    /**
     * 재 복습: 2025-05-07
     */
    public static class L_멘토링_12_4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            int[][] array = new int[T + 1][N + 1];
            for(int i = 1; i <= T; i++) {
                for(int j = 1; j <= N; j++) {
                    array[i][j] = scan.nextInt();
                }
            }
            solution(N, T, array);
        }
        public static void solution(int N, int T, int[][] array) {
            int answer = 0;
            for(int mentor = 1; mentor <= N; mentor++) {
                for(int mentee = 1; mentee <= N; mentee++) {
                    if(mentor == mentee) continue;
                    boolean canMentor = true;
                    for(int i = 1; i <= T; i++) {
                        int mentorScore = 0;
                        int menteeScore = 0;
                        for(int j = 1; j <= N; j++) {
                            if(array[i][j] == mentee) menteeScore = j;
                            if(array[i][j] == mentor) mentorScore = j;
                        }
                     if(menteeScore < mentorScore) {
                         canMentor = false;
                        }
                    }
                    if(canMentor) answer++;
                }
            }
            System.out.println(answer);
        }
    }

    
    /**
     * 재 복습: 2025-04-11
     */
    public static class L_멘토링_12_3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            int[][] array = new int[T + 1][N + 1];
            for(int i = 1;i <= T; i++) {
                for(int j = 1; j <= N; j++) {
                    array[i][j] = scan.nextInt();
                }
            }
            solution(N, T, array);
        }
        public static void solution(int N, int T, int[][] array) {
            int answer = 0;
            for(int mentor = 1; mentor <= N; mentor++) {
                for(int mentee = 1; mentee <= N; mentee++) {
                    if(mentor == mentee) continue;
                    boolean canMentor = true;

                    for(int i = 1; i<= T; i++) {
                        int mentorScore = 0;
                        int menteeScore = 0;
                        for(int j = 1; j <= N; j++) {
                            if(array[i][j] == mentor) mentorScore = j;
                            if(array[i][j] == mentee) menteeScore = j;
                        }
                        if(mentorScore >= menteeScore) {
                            canMentor = false;
                        }
                    }
                    if(canMentor) answer++;
                }
            }
            System.out.println(answer);
        }
    }


    /**
     * 재 복습: 2025-04-02
     */
    public static class L_멘토링_12_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int length = scan.nextInt();
            int testCount = scan.nextInt();
            int[][] array = new int[testCount + 1][length + 1];
            for(int i = 1; i <= testCount; i++) {
                for(int j = 1; j <= length; j++) {
                    array[i][j] = scan.nextInt();
                }
            }
            solution(length, testCount, array);
        }
        public static void solution(int length, int testCount, int[][] array) {
            int answer = 0;
            for(int mentor = 1; mentor <= length; mentor++) {
                for(int mentee = 1; mentee <= length; mentee++) {
                    if(mentor == mentee) continue;
                    boolean canMentor = true;
                    for(int i = 1; i <= testCount; i++) {
                        int mentorScore = 0;
                        int menteeScore = 0;
                        for(int j = 1; j <= length; j++) {
                            if(array[i][j] == mentor) mentorScore = j;
                            if(array[i][j] == mentee) menteeScore = j;
                        }
                        if(mentorScore > menteeScore) {
                            canMentor = false;
                        }
                    }
                    if(canMentor) answer++;
                }
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-03-06
     */
    public static class L_멘토링_12_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            int[][] array = new int[T + 1][N + 1];
            for(int i = 1; i <= T; i++) {
                for(int j = 1; j <= N; j++) {
                    array[i][j] = scan.nextInt();
                }
            }
            int answer = solution(N ,T, array);
            System.out.println(answer);
        }
        public static int solution(int N, int T, int[][] array) {
            int answer = 0;
            for(int mentor = 1; mentor <= N; mentor++) {
                for(int mentee = 1; mentee <= N; mentee++) {
                    if(mentor == mentee) continue;
                    boolean canMentor = true;

                    for(int i = 1; i <= T; i++) {
                        int mentorScore = 0;
                        int menteeScore = 0;
                        for(int j = 1; j <= N; j++) {
                            if(array[i][j] == mentor) mentorScore = j;
                            if(array[i][j] == mentee) menteeScore = j;
                        }
                        if(mentorScore > menteeScore) {
                            canMentor = false;
                        }
                    }
                    if(canMentor) {
                        answer++;
                    }
                }
            }
            return answer;
        }
    }


    /**
     * 재 복습: 2025-03-04
     */
    public static class L_멘토링12_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int L = scan.nextInt();
            int T = scan.nextInt();
            int[][] array = new int[T + 1][L + 1];
            for(int i = 1; i < T + 1; i++) {
                for(int j = 1; j < L +1; j++) {
                    array[i][j] = scan.nextInt();
                }
            }
            int answer = solution(L, T, array);
            System.out.println(answer);
        }
        public static int solution(int L, int T, int[][] array) {
            int answer = 0;
            for(int mentor = 1; mentor <= L; mentor++) {
                for(int mentee = 1; mentee <= L; mentee++) {
                    if(mentor == mentee) continue;
                    boolean cansMentor = true;
                    for(int k = 1; k <= T; k++) {
                        int mentorScore = 0;
                        int menteeScore = 0;
                        for(int i = 1; i <= L; i++) {
                            if(array[k][i] == mentor) mentorScore = i;
                            if(array[k][i] == mentee) menteeScore = i;
                        }
                        if(mentorScore >= menteeScore) {
                            cansMentor = false;
                        }
                    }
                    if(cansMentor) answer++;
                }
            }
            return answer;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int testCount = scan.nextInt();
        int[][] array = new int[testCount + 1][length + 1];
        for(int i = 1; i <= testCount; i++) {
            for(int j = 1; j <= length; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        int answer = solution(length, testCount, array);
        System.out.println(answer);
    }
    public static int solution(int length, int testCount, int[][] array) {
        int answer = 0;
        for(int mentor = 1; mentor <= length; mentor++) {
            for(int mentee = 1; mentee <= length; mentee++) {
                if(mentor == mentee) continue;
                boolean isValid = true;
                for(int k = 1; k <= testCount; k++) {
                    int mentorScore = 0, menteeScore = 0;
                    for(int l = 1; l <= length; l++) {
                        if(array[k][l] == mentee) menteeScore = l;
                        if(array[k][l] == mentor) mentorScore = l;
                    }
                    if(mentorScore >= menteeScore) {
                       isValid = false;
                       break;
                   }
                }
                if(isValid) answer++;
            }
        }
        return answer;
    }
}
