package java_알고리즘_문제풀이_입문_코딩테스트_대비.투포인터_슬라이딩윈도우;

/**
 * 1. 두 배열 합치기
 * 설명
 * <p>
 * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
 * <p>
 * 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
 * <p>
 * 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
 * <p>
 * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
 * <p>
 * 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 오름차순으로 정렬된 배열을 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     3
     1 3 5
     5
     2 3 6 7 9
 * 예시 출력 1
 * <p>
 * 1 2 3 3 5 6 7 9
 */

import java.util.*;

public class A_두_배열_합치기1 {

    /**
     * 재 복습: 2025-03-05
     */
    public static class A_두_배열_합치기1_1 {
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
            int f1 = 0;
            int s1 = 0;
            while(f1 < first && s1 < second) {
                if(firstArray[f1] > secondArray[s1]) answer.add(secondArray[s1++]);
                else answer.add(firstArray[f1++]);
            }
            while(f1 < first) answer.add(firstArray[f1++]);
            while(s1 < second) answer.add(secondArray[s1++]);
            return answer.stream().mapToInt(e -> e).toArray();
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] first = new int[N];
        for(int i = 0; i < N; i++) first[i] = scan.nextInt();

        int T = scan.nextInt();
        int[] second = new int[T];
        for(int i = 0; i < T; i++) second[i] = scan.nextInt();

        int[] answer = solution(N, first, T, second);
        for(int x : answer) {
            System.out.print(x + " ");
        }
    }
    public static int[] solution(int N, int[] first, int T, int[] second) {
        List<Integer> answer = new ArrayList<>();
        int f1 = 0;
        int s1 = 0;
        while(f1 < N && s1 < T) {
            if(first[f1] < second[s1]) answer.add(first[f1++]);
            else answer.add(second[s1++]);
        }
        while(f1 < N) answer.add(first[f1++]);
        while(s1 < T) answer.add(second[s1++]);
        return answer.stream().mapToInt(e -> e).toArray();
    }
}
