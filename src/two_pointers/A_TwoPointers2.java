package two_pointers;

import java.util.*;

/**
 * 공통원소 구하기
 *
 * 설명: A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
 *
 * 조건:
 * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
 *
 * 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 *
 * 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
 *
 * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 *
 * 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
 *
 * 출력:
 * - 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
 *
 * 예제:
 * 입력:
         5
         1 3 9 5 2
         5
         3 2 5 7 8
 *
 * 출력:
 * 2 3 5
 */
public class A_TwoPointers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer aCount = scan.nextInt();
        Integer[] aArray = new Integer[aCount];
        for(int i = 0; i < aCount; i++) {
            aArray[i] = scan.nextInt();
        }

        Integer bCount = scan.nextInt();
        Integer[] bArray = new Integer[bCount];
        for(int i = 0; i < bCount; i++) {
            bArray[i] = scan.nextInt();
        }
        for(Integer x : solution(aCount, bCount, aArray, bArray)) {
            System.out.print(x +" ");
        }
    }

    public static List<Integer> solution(Integer aCount, Integer bCount, Integer[] aArray, Integer[] bArray) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(aArray);
        Arrays.sort(bArray);

        int p1 = 0, p2 = 0;
        while(p1 < aCount && p2 < bCount) {
            if(Objects.equals(aArray[p1], bArray[p2])) {
                list.add(aArray[p1++]);
                p2++;
            }
            else if(aArray[p1] < bArray[p2]) p1++;
            else if(aArray[p1] > bArray[p2]) p2++;
        }

        return list;
    }
}
