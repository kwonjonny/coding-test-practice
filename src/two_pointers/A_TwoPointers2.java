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

    /**
     * 재 복습: 2025-01-31
     */
    public static class ATwoPointers9 {
        public static void main(String[] args) {
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
            ATwoPointers9.solution(firstLength, firstArray, secondLength, secondArray);
        }
        public static void solution(Integer firstLength, Integer[] firstArray, Integer secondLength, Integer[] secondArray) {
            Arrays.sort(firstArray); Arrays.sort(secondArray);
            int p1 = 0;
            int p2 = 0;
            List<Integer> answer = new ArrayList<>();
            while(p1 < firstLength && p2 < secondLength) {
                if(firstArray[p1].equals(secondArray[p2])) {
                    answer.add(firstArray[p1++]);
                    p2++;
                }
                else if (firstArray[p1] > secondArray[p2]) p2++;
                else if (firstArray[p1] < secondArray[p2]) p1++;
            }
            for(Integer x : answer) {
                System.out.print(x + " ");
            }
        }
    }

    /**
     * 재 복습: 2025-01-14
     */
    public static class ATwoPointers8 {
        public static void main(String[] args) {
            ATwoPointers8 aTwoPointers8 = new ATwoPointers8();
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
            aTwoPointers8.solution(first, firstArray, second, secondArray);
        }
        public void solution(Integer first, Integer[] firstArray, Integer second, Integer[] secondArray) {
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            List<Integer> answser = new ArrayList<>();
            int firstP = 0;
            int secondP = 0;
            while(first > firstP && second > secondP) {
                if(firstArray[firstP].equals(secondArray[secondP])) {
                    answser.add(firstArray[firstP++]);
                    secondP++;
                }
                else if (firstArray[firstP] > secondArray[secondP]) secondP++;
                else if (firstArray[firstP] < secondArray[secondP]) firstP++;
            }
            for(Integer x : answser) {
                System.out.print(x + " ");
            }
        }
    }

    /**
     * 재 복습: 2025-01-13
     */
    public static class ATwoPointers7 {
        public static void main(String[] args) {
            ATwoPointers7 aTwoPointers7 = new ATwoPointers7();
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
            aTwoPointers7.solution(firstLength, firstArray, secondLength, secondArray);
        }
        public void solution(Integer firstLength, Integer[] firstArray, Integer secondLength, Integer[] secondArray) {
            Arrays.sort(firstArray); Arrays.sort(secondArray);
            int firstPointer = 0;
            int secondPointer = 0;
            List<Integer> answer = new ArrayList<>();
            while(firstLength > firstPointer && secondLength > secondPointer) {
                if(firstArray[firstPointer].equals(secondArray[secondPointer])) {
                    answer.add(firstArray[firstPointer++]);
                    secondPointer++;
                }
                else if (firstArray[firstPointer] > secondArray[secondPointer]) secondPointer++;
                else if (firstArray[firstPointer] < secondArray[secondPointer]) firstPointer++;
            }

            for(Integer x : answer) {
                System.out.print(x + " ");
            }
        }
    }

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

    /**
     * 재 복습: 2024-12-26
     */
    public static class ATwoPointers4 {
        public static void main(String[] args) {
            ATwoPointers4 aTwoPointers4 = new ATwoPointers4();
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
            for(Integer x : aTwoPointers4.solution(aLength, bLength, aArray, bArray)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer aLength, Integer bLength, Integer[] aArray, Integer[] bArray) {
            List<Integer> list = new ArrayList<>();
            Arrays.sort(aArray); Arrays.sort(bArray);

            int p1 = 0;
            int p2 = 0;
            while(p1 < aLength && p2 < bLength) {
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
            for(Integer x : aTwoPointers5.solution(firstLength, firstArray, secondLength, secondArray)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer firstLength, Integer[] firstArray, Integer secondLength, Integer[] secondArray) {
            List<Integer> answerList = new ArrayList<>();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);

            int p1 = 0;
            int p2 = 0;
            while(p1 < firstLength && p2 < secondLength) {
                if(Objects.equals(firstArray[p1], secondArray[p2])) {
                    answerList.add(firstArray[p1++]);
                    p2++;
                }
                else if (firstArray[p1] < secondArray[p2]) answerList.add(firstArray[p1++]);
                else if (firstArray[p1] > secondArray[p2]) answerList.add(secondArray[p2++]);
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
            Arrays.sort(aArray); Arrays.sort(bArray);
            while(a1 < aLength && b1 < bLength) {
                if(aArray[a1].equals(bArray[b1])) {
                    b1++;
                    answer.add(aArray[a1++]);
                }
                else if (aArray[a1] > bArray[b1]) b1++;
                else if (aArray[a1] < bArray[b1]) a1++;
            }
            return answer;
        }
    }
}