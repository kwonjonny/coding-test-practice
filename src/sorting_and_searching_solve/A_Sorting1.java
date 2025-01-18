package sorting_and_searching_solve;

import java.util.Scanner;

/**
 * 선택 정렬
 * 설명
 *
 * N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 *
 * 정렬하는 방법은 선택정렬입니다.
 *
 * 입력
 * 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
 *
 * 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
 *
 *
 * 출력
 * 오름차순으로 정렬된 수열을 출력합니다.
 *
 *
 * 예시 입력 1
    6
    13 5 11 7 23 15
 *
 * 예시 출력 1
 * 5 7 11 13 15 23
 */
public class A_Sorting1 {

    /**
     * 재 복습: 2025-01-18
     */
    public static class ASorting4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            ASorting4.solution(length, intArray);
        }
        public static void solution(Integer length, Integer[] intArray) {
            for(int i = 0; i < length; i++) {
                int idx = i;
                for(int j = i + 1; j < length; j++) {
                    if(intArray[idx] > intArray[j]) idx = j;
                }
                int temp = intArray[i];
                intArray[i] = intArray[idx];
                intArray[idx] = temp;
            }
            for(Integer x : intArray) {
                System.out.print(x + " ");
            }
        }
    }

    /**
     * 재 복습: 2025-01-11
     */
    public static class ASSorting2 {
        public static void main(String[] args) {
            ASSorting2 asSorting2 = new ASSorting2();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            asSorting2.solution(length, intArray);
        }
        public void solution(Integer length, Integer[] intArray) {
            for(int i = 0; i < length - 1; i++) {
                int idx = i;
                for(int j = 1; j < length; j++) {
                    if(intArray[idx] > intArray[j]) {
                        idx = j;
                    }
                }
                int temp = intArray[i];
                intArray[i] = intArray[idx];
                intArray[idx] = temp;
            }
            for(Integer x : intArray) {
                System.out.print(x + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer length = scan.nextInt();
        Integer[] intArray = new Integer[length];
        for(int i = 0; i < length; i++) {
            intArray[i] = scan.nextInt();
        }
        for(Integer x : solution(length, intArray)) {
            System.out.print(x + " ");
        }
    }
    public static Integer[] solution(Integer length, Integer[] intArray) {
        for(int i = 0; i < length - 1; i++) {
            int idx = i;
            for(int j = i + 1; j < length; j++) {
                if(intArray[j] < intArray[idx]) idx = j;
            }
            int temp = intArray[i];
            intArray[i] = intArray[idx];
            intArray[idx] = temp;
        }
        return intArray;
    }
}
