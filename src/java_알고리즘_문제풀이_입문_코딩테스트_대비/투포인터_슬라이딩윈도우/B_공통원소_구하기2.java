package java_알고리즘_문제풀이_입문_코딩테스트_대비.투포인터_슬라이딩윈도우;

/**
 * 2. 공통원소 구하기
 * 설명
 * <p>
 * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
 * <p>
 * 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 * <p>
 * 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
 * <p>
 * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 * <p>
 * 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     5
     1 3 9 5 2
     5
     3 2 5 7 8
 * 예시 출력 1
 * <p>
 * 2 3 5
 */

import java.util.*;

public class B_공통원소_구하기2 {

    /**
     * 재 복습: 2025-05-08
     */
    public static class B_공통원소_구하기2_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int A = scan.nextInt();
            int[] aArray = new int[A];
            for(int i = 0; i < A; i++) {
                aArray[i] = scan.nextInt();
            }
            int B = scan.nextInt();
            int[] bArray = new int[B];
            for(int i = 0; i < B; i++) {
                bArray[i] = scan.nextInt();
            }
            solution(A, aArray, B, bArray);
        }
        public static void solution(int A, int[] aArray, int B, int[] bArray) {
            List<Integer> answer = new ArrayList<>();
            Arrays.sort(aArray);
            Arrays.sort(bArray);
            int a1 = 0;
            int b1 = 0;
            while (A > a1 && B > b1) {
                if(aArray[a1] == bArray[b1]) {
                    answer.add(aArray[a1++]);
                    b1++;
                }
                else if (aArray[a1] > bArray[b1]) b1++;
                else if (aArray[a1] < bArray[b1]) a1++;
            }
            for(int x : answer) {
                System.out.print(x + " ");
            }
        }
    }

    
    /**
     * 재 복습: 2025-03-05
     */
    public static class B_공통원소_구하기2_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int first = scan.nextInt();
            int[] firstArray = new int[first];
            for(int i = 0; i < first; i++) {
                firstArray[i] = scan.nextInt();
            }
            int second = scan.nextInt();
            int[] secondArray = new int[second];
            for(int i = 0; i < second; i++) {
                secondArray[i] = scan.nextInt();
            }
            int[] answer = solution(first, firstArray, second, secondArray);
            for(int x : answer) {
                System.out.print(x + " ");
            }
        }
        public static int[] solution(int first, int[] firstArray, int second, int[] secondArray) {
            List<Integer> answer = new ArrayList<>();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            int f1 = 0;
            int s1 = 0;
            while(f1 < first && s1 < second) {
                if(firstArray[f1] == secondArray[s1]) {
                    answer.add(firstArray[f1++]);
                    s1++;
                }
                else if (firstArray[f1] > secondArray[s1]) s1++;
                else if (firstArray[f1] < secondArray[s1]) f1++;
            }

            return answer.stream().mapToInt(e -> e).toArray();
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] first = new int[N];
        for (int i = 0; i < N; i++) first[i] = scan.nextInt();

        int T = scan.nextInt();
        int[] second = new int[T];
        for (int i = 0; i < T; i++) second[i] = scan.nextInt();

        int[] answer = solution(N, first, T, second);
        for (int x : answer) {
            System.out.print(x + " ");
        }
    }

    public static int[] solution(int N, int[] first, int T, int[] second) {
        int f1 = 0;
        int s1 = 0;
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(first);
        Arrays.sort(second);
        while (N > f1 && T > s1) {
            if (first[f1] == second[s1]) {
                answer.add(first[f1++]);
                s1++;
            } else if (first[f1] < second[s1]) f1++;
            else if (first[f1] > second[s1]) s1++;
        }

        return answer.stream().mapToInt(e -> e).toArray();
    }
}
