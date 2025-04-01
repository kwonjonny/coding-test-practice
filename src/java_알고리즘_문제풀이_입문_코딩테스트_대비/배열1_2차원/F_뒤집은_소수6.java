package java_알고리즘_문제풀이_입문_코딩테스트_대비.배열1_2차원;

/**
 * 6. 뒤집은 소수
 * 설명
 * <p>
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * <p>
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * <p>
 * 첫 자리부터의 연속된 0은 무시한다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
 * <p>
 * 각 자연수의 크기는 100,000를 넘지 않는다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     9
     32 55 62 20 250 370 200 30 100
 * 예시 출력 1
 * <p>
 * 23 2 73 2 3
 */

import java.util.*;

public class F_뒤집은_소수6 {

    /**
     * 재 복습: 2025-04-02
     */
    public static class F_뒤집은_소수6_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            solution(N, array);
        }
        public static void solution(int N, int[] array) {
            List<Integer> answer = new ArrayList<>();
            for(int i = 0; i < N; i++) {
                int temp = array[i];
                int res = 0;
                while(temp > 0) {
                    int t = temp % 10;
                    res = res * 10 + t;
                    temp = temp / 10;
                }
                if(isPrime(res)) {
                    answer.add(res);
                }
            }
            for(int x : answer) {
                System.out.print(x + " ");
            }
        }
        public static boolean isPrime(int num) {
            if(num == 1) return false;
            for(int i = 2; i < num; i++) {
                if(num % i == 0) return false;
            }
            return true;
        }
    }


    /**
     * 재 복습: 2025-03-06
     */
    public static class F_뒤집은_소수6_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            int[] answer = solution(N, array);
            for(int x : answer) {
                System.out.print(x + " ");
            }
        }
        public static int[] solution(int N, int[] array) {
            List<Integer> answer = new ArrayList<>();
            for(int i = 0; i < N; i++) {
                int temp = array[i];
                int res = 0;
                while(temp > 0) {
                    int t = temp % 10;
                    res = res * 10 + t;
                    temp = temp / 10;
                }
                if(isPrime(res)) {
                    answer.add(res);
                }
            }
            return answer.stream().mapToInt(e -> e).toArray();
        }
        public static boolean isPrime(int num) {
            if(num == 1) return false;
            for(int i = 2; i < num; i++) {
                if(num % i == 0) return false;
            }
            return true;
        }
    }

    
    /**
     * 재 복습: 2025-03-04
     */
    public static class F_뒤집은소수6_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int L = scan.nextInt();
            int[] array = new int[L];
            for(int i = 0; i < L; i++) {
                array[i] = scan.nextInt();
            }
            int[] answer = solution(L, array);
            for(int x : answer) {
                System.out.print(x + " ");
            }
        }
        public static int[] solution(int L, int[] array) {
            List<Integer> answer = new ArrayList<>();
            for(int i = 0; i < L; i++) {
                int temp = array[i];
                int res = 0;
                while(temp > 0) {
                    int t = temp % 10;
                    res = res * 10 + t;
                    temp = temp / 10;
                }
                if(isPrime(res)) {
                    answer.add(res);
                }
            }
            return answer.stream().mapToInt(e -> e).toArray();
        }
        public static boolean isPrime(int num) {
            if(num == 1) return false;
            for(int i = 2; i < num; i++) {
                if(num % i == 0) return false;
            }
            return true;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        int[] answer = solution(N, array);
        for(int x : answer) {
            System.out.print(x + " ");
        }
    }
    public static int[] solution(int N, int[] array) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            int temp = array[i];
            int next = 0;
            while(temp > 0) {
               int t = temp % 10;
               next = next * 10 + t;
               temp = temp / 10;
            }
            if(isPrime(next)) answer.add(next);
        }
        return answer.stream().mapToInt(e -> e).toArray();
    }
    public static boolean isPrime(int N) {
        if(N == 1) return false;
        for(int i = 2; i < N; i++) {
            if(N % i == 0) return false;
        }
        return true;
    }
}
