package two_pointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 두 배열 합치기
 *
 * 설명: 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
 *
 * 조건:
 * 1. 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
 *
 * 2. 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
 *
 * 3. 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
 *
 * 4. 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
 *
 * 5. 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
 *
 * 출력:
 * - 오름차순으로 정렬된 배열을 출력합니다.
 *
 * 예제:
 * 입력:
 *  3
 *  1 3 5
 *  5
 *  2 3 6 7 9
 *
 * 출력:
 *   1 2 3 3 5 6 7 9
 */
public class A_TwoPointers1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] aArray = new int[a];
        for(int i = 0; i < a; i++) {
            aArray[i] = scan.nextInt();
        }

        int b = scan.nextInt();
        int[] bArray = new int[b];
        for(int i = 0; i < b; i++) {
            bArray[i] = scan.nextInt();
        }

        for(Integer x : solution(a, aArray, b, bArray)) {
            System.out.print(x + " ");
        }
    }
    public static List<Integer> solution(int a, int[] aArray, int b, int[] bArray) {
        List<Integer> list = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;
        while(p1 < a && p2 < b) {
            if(aArray[p1] < bArray[p2]) list.add(aArray[p1++]);
            else list.add(bArray[p2++]);
        }
        while(p1 < a) {
            list.add(aArray[p1++]);
        }
        while(p2 < b) {
            list.add(bArray[p2++]);
        }
        return list;
    }
}
