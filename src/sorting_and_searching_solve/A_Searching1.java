package sorting_and_searching_solve;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * 중복 확인
 *
 * 설명
 * 현수네 반에는 N명의 학생들이 있습니다.
 *
 * 선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어 내라고 했습니다.
 *
 * 만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고,
 *
 * N명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 번째 줄에 자연수 N(5<=N<=100,000)이 주어진다.
 *
 * 두 번째 줄에 학생들이 적어 낸 N개의 자연수가 입력된다.
 *
 *
 * 출력
 * 첫 번째 줄에 D 또는 U를 출력한다.
 *
 * 예시 입력 1
    8
    20 25 52 30 39 33 43 33
 *
 * 예시 출력 1
 * U
 */
public class A_Searching1 {

    /**
     * 재 복습: 2025-01-14
     */
    public static class ASearching2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            ASearching2.solution(length, intArray);
        }
        public static void solution(Integer length, Integer[] intArray) {
            Arrays.sort(intArray);
            String answer = "";
            for(int i = 0; i < length -1; i++) {
                if(intArray[i].equals(intArray[i + 1])) answer = "D";
                else answer = "U";
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-01-11
     */
    public static class ASearching1 {
        public static void main(String[] args) {
            ASearching1 aSearching1 = new ASearching1();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length;i ++) {
                intArray[i] = scan.nextInt();
            }
            aSearching1.solution(length, intArray);
        }
        public void solution(Integer length, Integer[] intArray) {
            String answer = "";
            Arrays.sort(intArray);
            for(int i = 0; i < length - 1; i++) {
                if(intArray[i].equals(intArray[i + 1])) answer = "D";
                else answer = "U";
            }
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer length = scan.nextInt();
        Integer[] intArray = new Integer[length];
        for(int i = 0; i < length; i++) {
            intArray[i] = scan.nextInt();
        }
        solution(length, intArray);
    }
    public static void solution(Integer length, Integer[] intArray) {
        HashSet<Integer> hashSet = new LinkedHashSet<>();
        Boolean isDuplicated = false;
        for(int i = 0; i < length; i++) {
            int findInt = intArray[i];
            if(hashSet.contains(findInt)) {
                isDuplicated = true;
                break;
            }
            hashSet.add(findInt);
        }
        String answer = isDuplicated ? "D" : "U";
        System.out.println(answer);
    }
}
