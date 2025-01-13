package two_pointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 두 배열 합치기
 * <p>
 * 설명: 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
 * <p>
 * 조건:
 * 1. 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
 * <p>
 * 2. 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
 * <p>
 * 3. 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
 * <p>
 * 4. 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
 * <p>
 * 5. 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
 * <p>
 * 출력:
 * - 오름차순으로 정렬된 배열을 출력합니다.
 * <p>
 * 예제:
 * 입력:
     3
     1 3 5
     5
     2 3 6 7 9
 * <p>
 * 출력:
 * 1 2 3 3 5 6 7 9
 */
public class A_TwoPointers1 {

    /**
     * 재 복습: 2025-01-13
     */
    public static class ATwoPointers7 {
        public static void main(String[] args) {
            ATwoPointers7 aTwoPointers7 = new ATwoPointers7();
            Scanner scan = new Scanner(System.in);
            Integer first = scan.nextInt();
            Integer[] firstArray = new Integer[first];
            for(int i = 0; i < first; i++) {
                firstArray[i] = scan.nextInt();
            }
            Integer second = scan.nextInt();
            Integer[] secondArray = new Integer[second];
            for(int i = 0; i < second; i++) {
                secondArray[i] = scan.nextInt();
            }
            aTwoPointers7.solution(first, firstArray, second, secondArray);
        }
        public void solution(Integer first, Integer[] firstArray, Integer second, Integer[] secondArray) {
            int firstPointer = 0;
            int secondPointer = 0;
            List<Integer> answer = new ArrayList<>();
            while(first > firstPointer && second > secondPointer) {
                if(firstArray[firstPointer].equals(secondArray[secondPointer])) answer.add(firstArray[firstPointer++]);
                else answer.add(secondArray[secondPointer++]);
            }
            while(first > firstPointer) answer.add(firstArray[firstPointer++]);
            while(second > secondPointer) answer.add(secondArray[secondPointer++]);
            for(Integer x : answer) {
                System.out.print(x + " ");
            }
        }
    }

    public static void main(String[] args) {
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

        for (Integer x : solution(a, aArray, b, bArray)) {
            System.out.print(x + " ");
        }
    }

    public static List<Integer> solution(int a, int[] aArray, int b, int[] bArray) {
        List<Integer> list = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;
        while (p1 < a && p2 < b) {
            if (aArray[p1] < bArray[p2]) list.add(aArray[p1++]);
            else list.add(bArray[p2++]);
        }
        while (p1 < a) {
            list.add(aArray[p1++]);
        }
        while (p2 < b) {
            list.add(bArray[p2++]);
        }
        return list;
    }

    /**
     * 재 복습: 2024-12-21
     */
    public static class ATwoPointers1 {
        public static void main(String[] args) {
            ATwoPointers1 aTwoPointers1 = new ATwoPointers1();
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

            for (Integer x : aTwoPointers1.solution(aCount, bCount, aArray, bArray)) {
                System.out.print(x + " ");
            }
        }

        public List<Integer> solution(Integer aCount, Integer bCount, Integer[] aArray, Integer[] bArray) {
            List<Integer> list = new ArrayList<>();
            int p1 = 0;
            int p2 = 0;
            while (p1 < aCount && p2 < bCount) {
                if (aArray[p1] < bArray[p2]) list.add(aArray[p1++]);
                else list.add(bArray[p2++]);
            }
            while (p1 < aCount) list.add(aArray[p1++]);
            while (p2 < bCount) list.add(bArray[p2++]);
            return list;
        }
    }

    /**
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
            int p1 = 0;
            int p2 = 0;
            while (p1 < a && p2 < b) {
                if (aArray[p1] < bArray[p2]) list.add(aArray[p1++]);
                else list.add(bArray[p2++]);
            }
            while (a > p1) {
                list.add(aArray[p1++]);
            }
            while (b > p2) {
                list.add(bArray[p2++]);
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
            for (int i = 0; i < a; i++) {
                aArray[i] = scan.nextInt();
            }

            int b = scan.nextInt();
            int[] bArray = new int[b];
            for (int i = 0; i < b; i++) {
                bArray[i] = scan.nextInt();
            }

            for (Integer x : aTwoPointers3.solution(a, b, aArray, bArray)) {
                System.out.print(x + " ");
            }
        }

        public List<Integer> solution(int a, int b, int[] aArray, int[] bArray) {
            List<Integer> list = new ArrayList<>();

            int p1 = 0;
            int p2 = 0;
            while (p1 < a && p2 < b) {
                if (aArray[p1] < bArray[p2]) list.add(aArray[p1++]);
                else list.add(bArray[p2++]);
            }
            while (p1 < a) list.add(aArray[p1++]);
            while (p2 < b) list.add(bArray[p2++]);

            return list;
        }
    }

    /**
     * 재 복습: 2024-12-26
     */
    public static class ATwoPointers4 {
        public static void main(String[] args) {
            ATwoPointers4 aTwoPointers4 = new ATwoPointers4();
            Scanner scan = new Scanner(System.in);
            Integer aLength = scan.nextInt();
            Integer[] aArray = new Integer[aLength];
            for (int i = 0; i < aLength; i++) {
                aArray[i] = scan.nextInt();
            }
            Integer bLength = scan.nextInt();
            Integer[] bArray = new Integer[bLength];
            for (int i = 0; i < bLength; i++) {
                bArray[i] = scan.nextInt();
            }
            for (Integer x : aTwoPointers4.solution(aLength, aArray, bLength, bArray)) {
                System.out.print(x + " ");
            }
        }

        public List<Integer> solution(Integer aLength, Integer[] aArray, Integer bLength, Integer[] bArray) {
            List<Integer> list = new ArrayList<>();
            int p1 = 0;
            int p2 = 0;
            while (p1 < aLength && p2 < bLength) {
                if (aArray[p1] < bArray[p2]) list.add(aArray[p1++]);
                else list.add(bArray[p2++]);
            }
            while (p1 < aLength) list.add(aArray[p1++]);
            while (p2 < bLength) list.add(bArray[p2++]);
            return list;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class ATwoPointers5 {
        public static void main(String[] args) {
            ATwoPointers5 aTwoPointers5 = new ATwoPointers5();
            Scanner scan = new Scanner(System.in);
            Integer firstLength = scan.nextInt();
            Integer[] firstArray = new Integer[firstLength];
            for(int i = 0; i < firstLength; i++) {
                firstArray[i] = scan.nextInt();
            }
            Integer secondLength = scan.nextInt();
            Integer[] secondArray = new Integer[secondLength];
            for(int i = 0; i < secondLength; i++) {
                secondArray[i] = scan.nextInt();
            }
            List<Integer> answer = aTwoPointers5.solution(firstLength, firstArray, secondLength, secondArray);
            for(Integer x : answer) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer firstLength, Integer[] firstArray, Integer secondLength, Integer[] secondArray) {
            List<Integer> answerList = new ArrayList<>();
            int p1 = 0;
            int p2 = 0;
            while (p1 < firstLength && p2 < secondLength) {
                if (firstArray[p1] < secondArray[p2]) answerList.add(firstArray[p1++]);
                else answerList.add(secondArray[p2++]);
            }
            while (p1 < firstLength) {
                answerList.add(firstArray[p1++]);
            }
            while (p2 < secondLength) {
                answerList.add(secondArray[p2++]);
            }
            return answerList;
        }
    }

    /**
     * 재 복습: 2025-01-07
     */
    public static class ATwoPointers6 {
        public static void main(String[] args) {
            ATwoPointers6 aTwoPointers6 = new ATwoPointers6();
            Scanner scan = new Scanner(System.in);
            Integer aLength = scan.nextInt();
            Integer[] aArray = new Integer[aLength];
            for(int i = 0; i < aLength; i++) {
                aArray[i] = scan.nextInt();
            }
            Integer bLength = scan.nextInt();
            Integer[] bArray = new Integer[bLength];
            for(int i = 0; i < bLength; i++) {
                bArray[i] = scan.nextInt();
            }
            for(Integer x : aTwoPointers6.solution(aLength, bLength, aArray, bArray)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer aLength, Integer bLength, Integer[] aArray, Integer[] bArray) {
            List<Integer> answer = new ArrayList<>();
            int a1 = 0, b1 = 0;
            while(a1 < aLength && b1 < bLength) {
                if(aArray[a1] > bArray[b1]) answer.add(bArray[b1++]);
                else answer.add(aArray[a1++]);
            }
            while(a1 < aLength) answer.add(aArray[a1++]);
            while(b1 < bLength) answer.add(bArray[b1++]);
            return answer;
        }
    }
}