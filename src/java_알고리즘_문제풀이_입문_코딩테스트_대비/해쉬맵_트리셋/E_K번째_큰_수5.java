package java_알고리즘_문제풀이_입문_코딩테스트_대비.해쉬맵_트리셋;

/**
 * 5. K번째 큰 수
 * 설명
 * <p>
 * 현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
 * <p>
 * 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
 * <p>
 * 기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
 * <p>
 * 만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    10 3
    13 15 34 23 45 65 33 11 26 42
 * 예시 출력 1
 * <p>
 * 143
 */

import java.util.*;

public class E_K번째_큰_수5 {

    /**
     * 재 복습: 2025-06-04
     */
    public static class E_K번째_큰_수5_3 {
        static int N;
        static int T;
        static int[] array;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            T = scan.nextInt();
            array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            solution();
        }
        public static void solution() {
            Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
            for(int i = 0; i < N; i++) {
                for(int j = i + 1; j < N; j++) {
                    for(int k = j + 1; k < N; k++) {
                        int sum = array[i] + array[j] + array[k];
                        set.add(sum);
                    }
                }
            }
            int answer = 0;
            int X = 0;
            for(int x : set) {
                X++;
                if(X == T) {
                    answer = x;
                    break;
                }
            }
            System.out.println(answer);
        }
    }


    /**
     * 재 복습: 2025-05-12
     */
    public static class E_K번째_큰_수5_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            solution(N, T, array);
        }
        public static void solution(int N, int T, int[] array) {
            Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
            for(int i = 0; i < N; i++) {
                for(int j = i + 1; j < N; j++) {
                    for(int k = j + 1; k < N; k++) {
                        int sum = array[i] + array[j] + array[k];
                        set.add(sum);
                    }
                }
            }
            int cnt = 0;
            int answer = 0;
            for(int x : set) {
                cnt++;
                if(cnt == T) {
                    answer = x;
                    break;
                }
            }
            System.out.println(answer);
        }
    }


    /**
     * 재 복습: 2025-03-28
     */
    public static class E_K_번째_큰_수5_3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            solution(N, T, array);
        }
        public static void solution(int N, int T, int[] array) {
            Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
            for(int i = 0; i < N; i++) {
                for(int j = i + 1; j < N; j++) {
                    for(int k = j + 1; k < N; k++) {
                        int sum = array[i] + array[j] + array[k];
                        set.add(sum);
                    }
                }
            }
            int answer = 0;
            int count = 0;
            for(int x : set) {
                count++;
                if(count == T) {
                    answer = x;
                    break;
                }
            }
            System.out.println(answer);
        }
    }

    
    /**
     * 재 복습: 2025-03-27
     */
    public static class E_K_번째_큰_수5_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            solution(N, T, array);
        }
        public static void solution(int N, int T, int[] array) {
            Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
            for(int i = 0; i < N; i++) {
                for(int j = i + 1; j < N; j++) {
                    for(int k = j + 1; k < N; k++) {
                        int sum = array[i] + array[j] + array[k];
                        set.add(sum);
                    }
                }
            }
            int count = 0;
            int answer = 0;
            for(int x : set) {
                count++;
                if(count == T) {
                    answer = x;
                    break;
                }
            }
            System.out.println(answer);
        }
    }


    /**
     * 재 복습: 2025-03-05
     */
    public static class E_K번째_큰_수5_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            int answer = solution(N, T, array);
            System.out.println(answer);
        }
        public static int solution(int N, int T, int[] array) {
            TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
            for(int i = 0; i < N; i++) {
                for(int j = i + 1; j < N; j++) {
                    for(int k = j + 1; k < N; k++) {
                        treeSet.add(array[i] + array[j] + array[k]);
                    }
                }
            }
            int cnt = 0;
            int answer = 0;
            for(int x : treeSet) {
                cnt++;
                if(cnt == T) {
                    answer = x;
                    break;
                }
            }
            return answer;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        int answer = solution(N, T, array);
        System.out.println(answer);
    }

    public static int solution(int N, int T, int[] array) {
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int currentSum = array[i] + array[j] + array[k];
                    treeSet.add(currentSum);
                }
            }
        }
        if(treeSet.size() < T) {
            return -1;
        }
        int cnt = 0;
        int answer = 0;
        for (int x : treeSet) {
            cnt++;
            if (cnt == T) {
                answer = x;
                break;
            }
        }
        return answer;
    }
}
