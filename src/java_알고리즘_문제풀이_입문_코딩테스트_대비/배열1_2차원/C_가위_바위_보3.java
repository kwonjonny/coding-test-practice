package java_알고리즘_문제풀이_입문_코딩테스트_대비.배열1_2차원;

/**
 * 3. 가위 바위 보
 * 설명
 * <p>
 * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 * <p>
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 * <p>
 * 예를 들어 N=5이면
 * 회수 1  2  3  4  5
 * A    2  3  3  1  3
 * B    1  1  2  2  3
 * 승자 A  B  A  B  D
 * <p>
 * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
 * <p>
 * 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 * <p>
 * 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     5
     2 3 3 1 3
     1 1 2 2 3
 * 예시 출력 1
 * <p>
 * A
 * B
 * A
 * B
 * D
 */

import java.util.*;

public class C_가위_바위_보3 {

    /**
     * 재 복습: 2025-04-29
     */
    public static class C_가위_바위_보3_3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[] aArray = new int[N];
            int[] bArray = new int[N];
            for(int i = 0; i < N; i++) {
                aArray[i] = scan.nextInt();
            }
            for(int i = 0; i < N; i++) {
                bArray[i] = scan.nextInt();
            }
            solution(N, aArray, bArray);
        }
        public static void solution(int N, int[] aArray, int[] bArray) {
            List<String> answer = new ArrayList<>();
            int p1 = 0;
            while(p1 < N) {
                if (aArray[p1] == bArray[p1]) answer.add("D");
                else if(aArray[p1] == 1 && bArray[p1] == 3 || aArray[p1] == 2 && bArray[p1] == 1 || aArray[p1] == 3 && bArray[p1] == 2) answer.add("A");
                else answer.add("B");
                p1++;
            }
            for(String x : answer) {
                System.out.print(x + " ");
            }
        }
    }


    /**
     * 재 복습: 2025-04-02
     */
    public static class C_가위_바위_보3_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[] aArray = new int[N];
            int[] bArray = new int[N];
            for(int i = 0; i < N; i++) {
                aArray[i] = scan.nextInt();
            }
            for(int i = 0; i < N; i++) {
                bArray[i] = scan.nextInt();
            }
            solution(N, aArray, bArray);
        }
        public static void solution(int N, int[] aArray, int[] bArray) {
            List<String> answer = new ArrayList<>();
            int a = 0;
            int b = 0;
            while(a < N && b < N) {
                if(aArray[a] == bArray[b]) answer.add("D");
                else if ((aArray[a] == 1 && bArray[b] == 3) || (aArray[a] == 2 && bArray[b] == 1) || (aArray[a] == 3 && bArray[b] == 2)) answer.add("A");
                else answer.add("B");
                a++;
                b++;
            }
            for(String x : answer) {
                System.out.println(x);
            }
        }
    }

    /**
     * 재 복습: 2025-03-06
     */
    public static class C_가위_바위_보3_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[] first = new int[N];
            for(int i = 0; i < N; i++) {
                first[i] = scan.nextInt();
            }
            int[] second = new int[N];
            for(int i = 0; i < N; i++) {
                second[i] = scan.nextInt();
            }
            List<String> answer = solution(N, first, second);
            for(String x : answer) {
                System.out.println(x);
            }
        }
        public static List<String> solution(int N, int[] first, int[] second) {
            List<String> answer = new ArrayList<>();
            int first1 = 0;
            int second1 = 0;
            while(first1 < N && second1 < N) {
                if(first[first1] == 1 && second[second1] == 3 || first[first1] == 2 && second[second1] == 1 || first[first1] == 3 && second[second1] == 2) answer.add("A");
                else if(first[first1] == second[second1]) answer.add("D");
                else answer.add("B");
                first1++;
                second1++;
            }
            return answer;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] first = new int[N];
        for(int i = 0; i < N; i++) {
            first[i] = scan.nextInt();
        }
        int[] second = new int[N];
        for(int i = 0; i < N; i++) {
            second[i] = scan.nextInt();
        }
        String[] answer = solution(N, first, second);
        for(String x : answer) {
            System.out.println(x);
        }
    }
    public static String[] solution(int N, int[] first, int[] second) {
        List<String> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while(p1 < N && p2 < N) {
            if(first[p1] == second[p2]) answer.add("D");
            else if(first[p1] == 1 && second[p2] == 3 || first[p1] == 2 && second[p2] == 1 || first[p1] == 3 && second[p2] == 2) answer.add("A");
            else answer.add("B");
            p1++;
            p2++;
        }
        return answer.toArray(new String[0]);
    }
}
