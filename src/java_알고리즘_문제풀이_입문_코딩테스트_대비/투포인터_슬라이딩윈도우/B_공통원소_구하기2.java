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

    public static class B_공통원소_구하기2_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[] firstArray = new int[N];
            for(int i = 0; i < N; i++) firstArray[i] = scan.nextInt();
            int T = scan.nextInt();
            int[] secondArray = new int[T];
            for(int i = 0; i < T; i++) secondArray[i] = scan.nextInt();
            solution(N, firstArray, T, secondArray);
        }
        public static void solution(int N, int[] firstArray, int T, int[] secondArray) {
            Arrays.sort(firstArray); Arrays.sort(secondArray);
            List<Integer> ret = new ArrayList<>();
            int N1 = 0;
            int T1 = 0;
            while(N > N1 && T > T1) {
                if(firstArray[N1] == secondArray[T1]) {
                    ret.add(firstArray[N1]);
                    N1++; T1++;
                }
                else if (firstArray[N1] > secondArray[T1]) T1++;
                else if (firstArray[N1] < secondArray[T1]) N1++;
            }
            for(int x : ret) {
                System.out.print(x + " ");
            }
        }
    }
}
