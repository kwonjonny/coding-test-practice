package java_알고리즘_문제풀이_입문_코딩테스트_대비.dfs_bfs_활용;

/**
 * 3. 최대점수 구하기(DFS)
 * 설명
 * <p>
 * 이번 정보올림피아드대회에서 좋은 성적을 내기 위하여 현수는 선생님이 주신 N개의 문제를 풀려고 합니다.
 * <p>
 * 각 문제는 그것을 풀었을 때 얻는 점수와 푸는데 걸리는 시간이 주어지게 됩니다.
 * <p>
 * 제한시간 M안에 N개의 문제 중 최대점수를 얻을 수 있도록 해야 합니다.
 * <p>
 * (해당문제는 해당시간이 걸리면 푸는 걸로 간주한다, 한 유형당 한개만 풀 수 있습니다.)
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 번째 줄에 문제의 개수N(1<=N<=20)과 제한 시간 M(10<=M<=300)이 주어집니다.
 * <p>
 * 두 번째 줄부터 N줄에 걸쳐 문제를 풀었을 때의 점수와 푸는데 걸리는 시간이 주어집니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 번째 줄에 제한 시간안에 얻을 수 있는 최대 점수를 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     5 20
     10 5
     25 12
     15 8
     6 3
     7 4
 * 예시 출력 1
 * <p>
 * 41
 */

import java.util.*;

public class C_최대점수_구하기_DFS3 {

    /**
     * 재 복습: 2025-06-06
     */
    public static class C_최대점수_구하기_DFS3_7 {
        static int N, T;
        static int[] time, score;
        static int answer = Integer.MIN_VALUE;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            time = new int[N];
            score = new int[N];
            for(int i = 0; i < N; i++) {
                score[i] = scan.nextInt();
                time[i] = scan.nextInt();
            }
            DFS(0, 0, 0);
            System.out.println(answer);
        }
        public static void DFS(int level, int timeSum, int scoreSum) {
            if(timeSum > T) return;
            if(level == N) {
                if(timeSum == T) {
                    answer = Math.max(answer, scoreSum);
                }
            }
            else {
                DFS(level + 1, timeSum + time[level], scoreSum + score[level]);
                DFS(level + 1, timeSum, scoreSum);
            }
        }
    }


    /**
     * 재 복습: 2025-06-02
     */
    public static class C_최대점수_구하기_DFS3_6 {
        static int N;
        static int T;
        static int[] timeArray, scoreArray;
        static int answer = 0;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            scoreArray = new int[N];
            timeArray = new int[N];
            for(int i = 0; i < N; i++) {
                int score = scan.nextInt();
                int time = scan.nextInt();
                scoreArray[i] = score;
                timeArray[i] = time;
            }
            DFS(0, 0, 0);
            System.out.println(answer);
        }
        public static void DFS(int level, int timeSum, int scoreSum) {
            if(timeSum > T) return;
            if(level == N) {
                answer = Math.max(answer, scoreSum);
            }
            else {
                DFS(level + 1, timeSum + timeArray[level], scoreSum + scoreArray[level]);
                DFS(level + 1, timeSum, scoreSum);
            }
        }
    }


    /**
     * 재 복습: 2025-05-30
     */
    public static class C_최대점수_구하기_DFS3_5 {
        static int N;
        static int T;
        static int[] timeArray;
        static int[] scoreArray;
        static int score = 0;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            timeArray = new int[N];
            scoreArray = new int[N];
            for(int i = 0; i < N; i++) {
                int score = scan.nextInt();
                int time = scan.nextInt();
                timeArray[i] = time;
                scoreArray[i] = score;
            }
            DFS(0, 0, 0);
            System.out.println(score);
        }
        public static void DFS(int level, int timeSum, int scoreSum) {
            if(timeSum > T) return;
            if(level == N) {
                score = Math.max(score, scoreSum);
            }
            else {
                DFS(level + 1, timeSum + timeArray[level], scoreSum + scoreArray[level]);
                DFS(level + 1, timeSum, scoreSum);
            }
        }
    }


    /**
     * 재 복습: 2025-05-26
     */
    public static class C_최대점수_구하기_DFS3_4 {
        static int maxScore = 0;
        static int T;
        static int N;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            int[] scoreArray = new int[N];
            int[] timeArray = new int[N];
            for(int i = 0; i < N; i++) {
                int score = scan.nextInt();
                int time = scan.nextInt();
                scoreArray[i] = score;
                timeArray[i] = time;
            }
            DFS(timeArray, scoreArray, 0, 0, 0);
            System.out.println(maxScore);
        }
        public static void DFS(int[] timeArray, int[] scoreArray, int timeAdd, int scoreAdd, int level) {
            if(timeAdd > T) return;
            if(level == N) {
                maxScore = Math.max(maxScore, scoreAdd);
            }
            else {
                DFS(timeArray, scoreArray, timeAdd + timeArray[level], scoreAdd + scoreArray[level], level + 1);
                DFS(timeArray, scoreArray, timeAdd, scoreAdd, level + 1);
            }
        }
    }


    /**
     * 재 복습: 2025-03-014
     */
    public static class C_최대점수_구하기_DFS3_3 {
        static int N;
        static int T;
        static int answer = 0;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            int[] scoreArray = new int[N];
            int[] timeArray = new int[N];
            for(int i = 0; i < N; i++) {
                int score = scan.nextInt();
                int time = scan.nextInt();
                scoreArray[i] = score;
                timeArray[i] = time;
            }
            DFS(0, 0, scoreArray, 0, timeArray);
            System.out.println(answer);
        }
        public static void DFS(int level, int scoreSum, int[] scoreArray, int timeSum, int[] timeArray) {
            if(timeSum > T) return;
            if(level == N) {
                answer = Math.max(answer, scoreSum);
            }
            else {
                DFS(level + 1,scoreSum + scoreArray[level], scoreArray, timeSum + timeArray[level], timeArray);
                DFS(level + 1, scoreSum, scoreArray, timeSum, timeArray);
            }
        }
    }

    /**
     * 재 복습: 2025-03-07
     */
    public static class C_최대점수_구하기_DFS3_2 {
        static int N;
        static int T;
        static int answer = 0;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            int[] scoreArray = new int[N];
            int[] timeArray = new int[N];
            for(int i = 0; i < N; i++) {
                scoreArray[i] = scan.nextInt();
                timeArray[i] = scan.nextInt();
            }
            DFS(0, 0, 0, scoreArray, timeArray);
            System.out.println(answer);
        }
        public static void DFS(int level, int scoreSum, int timeSum, int[] scoreArray, int[] timeArray) {
            if(timeSum > T) return;
            if(level == N) {
                answer = Math.max(answer, scoreSum);
            }
            else {
                DFS(level + 1, scoreSum + scoreArray[level], timeSum + timeArray[level], scoreArray, timeArray);
                DFS(level + 1, scoreSum, timeSum, scoreArray, timeArray);
            }
        }
    }


    /**
     * 재 복습: 2025-03-06
     */
    public static class C_최대점수_구하기_DFS3_1 {
        static int N;
        static int answer = 0;
        static int M;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            M = scan.nextInt();
            int[] array1 = new int[N];
            int[] array2 = new int[N];
            for(int i = 0; i < N; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                array1[i] = a;
                array2[i] = b;
            }
            DFS(0, 0, 0, array1, array2);
            System.out.println(answer);
        }
        public static void DFS(int level, int array1Sum, int array2Sum, int[] array1, int[] array2) {
            if(array2Sum > M) return;
            if(level == N) {
                answer = Math.max(answer, array1Sum);
            }
            else {
                DFS(level + 1, array1Sum + array1[level], array2Sum + array2[level], array1, array2);
                DFS(level + 1, array1Sum, array2Sum, array1, array2);
            }
        }
    }


    static int N;
    static int T;
    static int answer = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        T = scan.nextInt();
        int[] array1 = new int[N];
        int[] array2 = new int[N];
        for (int i = 0; i < N; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            array1[i] = a;
            array2[i] = b;
        }
        DFS(0, 0, 0, array1, array2);
        System.out.println(answer);
    }
    public static void DFS(int level, int array2Sum, int array1Sum, int[] array1, int[] array2) {
        if (array2Sum > T) return;
        if (level == N) {
            answer = Math.max(answer, array1Sum);
        } else {
            DFS(level + 1, array2Sum + array2[level], array1Sum + array1[level], array1, array2);
            DFS(level + 1, array2Sum, array1Sum, array1, array2);
        }
    }
}