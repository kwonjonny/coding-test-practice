package java_알고리즘_문제풀이_입문_코딩테스트_대비.정렬_이분검색과_결정알고리즘;

/**
 * 1. 선택 정렬
 * 설명
 * <p>
 * N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 * <p>
 * 정렬하는 방법은 선택정렬입니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
 * <p>
 * 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 오름차순으로 정렬된 수열을 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    6
    13 5 11 7 23 15
 * 예시 출력 1
 * <p>
 * 5 7 11 13 15 23
 */

import java.util.*;

public class A_선택정렬1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        int[] answer = solution(N,array);
        for(int x : answer) {
            System.out.print(x + " ");
        }
    }
    public static int[] solution(int N, int[] array) {
        for(int i = 0; i < N - 1; i++) {
            for(int j = i + 1; j < N; j++) {
                if(array[i] > array[j]) {
                   int temp = array[j];
                   array[j] = array[i];
                   array[i] = temp;
                }
            }
        }
        return array;
    }
}
