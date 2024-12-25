package two_pointers;

import java.util.*;

/**
 * 공통원소 구하기
 * <p>
 * 설명: A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
 * <p>
 * 조건:
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
 * 출력:
 * - 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
 * <p>
 * 예제:
 * 입력:
   5
   1 3 9 5 2
   5
   3 2 5 7 8
 * <p>
 * 출력:
 * 2 3 5
 */
public class A_TwoPointers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer aCount = scan.nextInt();
        Integer[] aArray = new Integer[aCount];
        for (int i = 0; i < aCount; i++) {
            aArray[i] = scan.nextInt();
        }

        Integer bCount = scan.nextInt();
        Integer[] bArray = new Integer[bCount];
        for (int i = 0; i < bCount; i++) {
            bArray[i] = scan.nextInt();
        }
        for (Integer x : solution(aCount, bCount, aArray, bArray)) {
            System.out.print(x + " ");
        }
    }

    public static List<Integer> solution(Integer aCount, Integer bCount, Integer[] aArray, Integer[] bArray) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(aArray);
        Arrays.sort(bArray);

        int p1 = 0, p2 = 0;
        while (p1 < aCount && p2 < bCount) {
            if (Objects.equals(aArray[p1], bArray[p2])) {
                list.add(aArray[p1++]);
                p2++;
            } else if (aArray[p1] < bArray[p2]) p1++;
            else if (aArray[p1] > bArray[p2]) p2++;
        }

        return list;
    }

    /**
     * 오답 왜 틀렸을까? 로직을 상상으로 먼저 테스트해보자
     * Two Pointer 알고리즘에 필요한 로직
     * 재 복습: 2024-12-23
     */
    public static class ATwoPointers2 {
        public static void main(String[] args) {
            ATwoPointers2 aTwoPointers2 = new ATwoPointers2();
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int[] aArray = new int[a];
            for (int i = 0; i < a; i++) {
                aArray[i] = scan.nextInt();
            }

            int b = scan.nextInt();
            int[] bArray = new int[b];
            for (int i = 0; i < b; i++) {
                bArray[i] = scan.nextInt();
            }
            for (Integer x : aTwoPointers2.solution(a, aArray, b, bArray)) {
                System.out.print(x + " ");
            }
        }

        public List<Integer> solution(int a, int[] aArray, int b, int[] bArray) {
            List<Integer> list = new ArrayList<>();
            int p1 = 0, p2 = 0;

            Arrays.sort(aArray);
            Arrays.sort(bArray);

            while (p1 < a && p2 < b) {
                if (aArray[p1] == bArray[p2]) {
                    list.add(aArray[p1++]);
                    p2++;
                }
                else if (aArray[p1] < bArray[p2]) p1++;
                else if (aArray[p1] > bArray[p2]) p2++;
            }
            return list;
        }
    }

    /**
     * 재 복습: 2024-12-25
     */
    public static class ATwoPointers3 {
        public static void main(String[] args) {
            ATwoPointers3 aTwoPointers3 = new ATwoPointers3();
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

            for(Integer x : aTwoPointers3.solution(a, aArray, b, bArray)) {
                System.out.print(x + " ");
            }
        }

        public List<Integer> solution(int a, int[] aArray, int b, int[] bArray) {
            List<Integer> list = new ArrayList<>();

            Arrays.sort(aArray);
            Arrays.sort(bArray);

            int p1 = 0;
            int p2 = 0;

            while(p1 < a && p2 < b) {
                if(aArray[p1] == bArray[p2]) {
                    list.add(aArray[p1++]);
                    p2++;
                }
                else if(aArray[p1] < bArray[p2]) {
                    p1++;
                }
                else if(aArray[p1] > bArray[p2]) {
                    p2++;
                }
            }
            return list;
        }
    }
}