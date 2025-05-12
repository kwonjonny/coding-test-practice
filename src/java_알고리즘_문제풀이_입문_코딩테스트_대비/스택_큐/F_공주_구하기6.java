package java_알고리즘_문제풀이_입문_코딩테스트_대비.스택_큐;

/**
 * 6. 공주 구하기
 * 설명
 * <p>
 * 정보 왕국의 이웃 나라 외동딸 공주가 숲속의 괴물에게 잡혀갔습니다.
 * <p>
 * 정보 왕국에는 왕자가 N명이 있는데 서로 공주를 구하러 가겠다고 합니다.
 * <p>
 * 정보왕국의 왕은 다음과 같은 방법으로 공주를 구하러 갈 왕자를 결정하기로 했습니다.
 * <p>
 * 왕은 왕자들을 나이 순으로 1번부터 N번까지 차례로 번호를 매긴다.
 * <p>
 * 그리고 1번 왕자부터 N번 왕자까지 순서대로 시계 방향으로 돌아가며 동그랗게 앉게 한다.
 * <p>
 * 그리고 1번 왕자부터 시계방향으로 돌아가며 1부터 시작하여 번호를 외치게 한다.
 * <p>
 * 한 왕자가 K(특정숫자)를 외치면 그 왕자는 공주를 구하러 가는데서 제외되고 원 밖으로 나오게 된다.
 * <p>
 * 그리고 다음 왕자부터 다시 1부터 시작하여 번호를 외친다.
 * <p>
 * 이렇게 해서 마지막까지 남은 왕자가 공주를 구하러 갈 수 있다.
 * <p>
 * 예를 들어 총 8명의 왕자가 있고, 3을 외친 왕자가 제외된다고 하자. 처음에는 3번 왕자가 3을 외쳐 제외된다.
 * <p>
 * 이어 6, 1, 5, 2, 8, 4번 왕자가 차례대로 제외되고 마지막까지 남게 된 7번 왕자에게 공주를 구하러갑니다.
 * <p>
 * N과 K가 주어질 때 공주를 구하러 갈 왕자의 번호를 출력하는 프로그램을 작성하시오.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 자연수 N(5<=N<=1,000)과 K(2<=K<=9)가 주어진다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 줄에 마지막 남은 왕자의 번호를 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    8 3
 * 예시 출력 1
 * <p>
 * 7
 */

import java.util.*;

public class F_공주_구하기6 {

    /**
     * 재 복습: 2025-05-12
     */
    public static class F_공주_구하기6_3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            solution(N, T);
        }
        public static void solution(int N, int T) {
            Queue<Integer> Q = new LinkedList<>();
            for(int i = 1; i <= N; i++) {
                Q.offer(i);
            }
            while(!Q.isEmpty()) {
                for(int i = 0; i < 2; i++) {
                    Q.offer(Q.poll());
                }
                Q.poll();
                if(Q.size() == 1) break;
            }
            System.out.println(Q.poll());
        }
    }


    /**
     * 재 복습: 2025-03-27
     */
    public static class F_공주_구하기6_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            solution(N, T);
        }
        public static void solution(int N, int T) {
            Queue<Integer> Q = new LinkedList<>();
            for(int i = 1; i <= N; i++) {
                Q.offer(i);
            }
            int answer = 0;
            while(!Q.isEmpty()) {
                for(int i = 0; i < T - 1; i++) {
                    Q.offer(Q.poll());
                }
                Q.poll();
                if(Q.size() == 1) answer = Q.poll();
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-03-05
     */
    public static class F_공주_구하기6_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            int answer = solution(N, T);
            System.out.println(answer);
        }
        public static int solution(int N, int T) {
            Queue<Integer> Q = new LinkedList<>();
            for(int i = 1; i <= N; i++) {
                Q.offer(i);
            }
            int answer = 0;
            while(!Q.isEmpty()) {
                for(int i = 1; i < T; i++) {
                    Q.offer(Q.poll());
                }
                Q.poll();
                if(Q.size() == 1) answer = Q.poll();
            }
            return answer;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();
        int answer = solution(N, T);
        System.out.println(answer);
    }
    public static int solution(int N, int T) {
        Queue<Integer> Q = new LinkedList<>();
        int answer = 0;
        for(int i = 1; i <= N; i++) {
            Q.offer(i);
        }
        while(!Q.isEmpty()) {
            for(int i = 0; i < T - 1; i++) {
                Q.offer(Q.poll());
            }
            Q.poll();
            if(Q.size() == 1) answer = Q.poll();
        }
        return answer;
    }
}
