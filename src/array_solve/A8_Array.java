package array_solve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *  등수구하기
 *
 * 설명:
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 *
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 *
 * 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 *
 * 입력:
 *  - 첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
 *
 * 출력:
 * - 입력된 순서대로 등수를 출력한다.
 *
 * 예제:
 * 입력:
    5
    87 89 92 100 76
 *
 * 출력:
 *  4 3 2 1 5
 */
public class A8_Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer count = scan.nextInt();
        Integer[] intArray = new Integer[count];
        for(int i = 0; i < count; i++) {
            intArray[i] = scan.nextInt();
        }
        for(int x : solution(count, intArray)) {
            System.out.print(x + " ");
        }
    }
    public static int[] solution(Integer count, Integer[] intArray) {
        int[] answer = new int[count];
        for(int i = 0; i < count; i++) {
            int cnt = 1;
            for(int j = 0; j < count; j++) {
                if(intArray[i] < intArray[j]) {
                    cnt++;
                }
                answer[i] = cnt;
            }
        }
        return answer;
    }

    /**
     * 재 복습: 2024-12-16
     */
    public static class A8Array1 {
        public static void main(String[] args) {
            A8Array1 a8Array1 = new A8Array1();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] intArray = new Integer[count];
            for(int i = 0; i < count; i++) {
                intArray[i] = scan.nextInt();
            }
            for(Integer x : a8Array1.solution(count, intArray)) {
                System.out.print(x + " ");
            }
        }
        public Integer[] solution(Integer count, Integer[] intArray) {
            Integer[] scores = new Integer[count];
            for(int i = 0; i < count; i++) {
                int score = 1;
                for(int j = 0; j < count; j++) {
                    if(intArray[i] < intArray[j]) {
                        score++;
                    }
                }
                scores[i] = score;
            }
            return scores;
        }
    }

    /**
     * 재 복습: 2024-12-17
     */
    public static class A8Array2 {
        public static void main(String[] args) {
            A8Array2 a8Array2 = new A8Array2();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] intArray = new Integer[count];
            for(int i = 0; i < count; i++) {
                intArray[i] = scan.nextInt();
            }
            for(int x : a8Array2.solution(count, intArray)) {
                System.out.print(x + " ");
            }
        }
        public Integer[] solution(Integer count, Integer[] intArray) {
            Integer[] array = new Integer[count];
            for(int i = 0; i < count; i++) {
                int score = 1;
                for(int j = 0; j < count; j++) {
                    if(intArray[i] < intArray[j]) {
                        score++;
                    }
                }
                array[i] = score;
            }
            return array;
        }
    }

    /**
     * 재 복습: 2024-12-18
     */
    public static class A8Array3 {
        public static void main(String[] args) {
            A8Array3 a8Array3 = new A8Array3();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            int[] intArray = new int[count];
            for(int i = 0; i < count; i++) {
                intArray[i] = scan.nextInt();
            }
            for(Integer x : a8Array3.solution(count, intArray)) {
                System.out.print(x + " ");
            }
        }
        public int[] solution(int count, int[] intArray) {
            int[] answerArray = new int[count];
            int score = 1;
            for(int i = 0; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    if(intArray[i] < intArray[j]) {
                        score++;
                    }
                    answerArray[i] = score;
                    score = 1;
                }
            }
            return answerArray;
        }
    }

    /**
     * 재 복습: 2024-12-20
     */
    public static class A8Array4 {
        public static void main(String[] args) {
            A8Array4 a8Array4 = new A8Array4();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] intArray = new Integer[count];
            for(int i = 0; i < count; i++) {
                intArray[i] = scan.nextInt();
            }
            for(Integer x : a8Array4.solution(count, intArray)) {
                System.out.print(x + " ");
            }
        }
        public int[] solution(Integer count, Integer[] intArray) {
            int[] array = new int[count];
            for(int i = 0; i < count; i++) {
                int cnt = 1;
                for(int j = 0; j < count; j++) {
                    if(intArray[i] < intArray[j]) {
                        cnt++;
                    }
                    array[i] = cnt;
                }
            }
            return array;
        }
    }

    /**
     * 재 복습: 2024-12-25
     */
    public static class A8Array5 {
        public static void main(String[] args) {
            A8Array5 a8Array5 = new A8Array5();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] intArray = new Integer[count];
            for(int i = 0; i < count; i++) {
                intArray[i] = scan.nextInt();
            }
            for(Integer x : a8Array5.solution(count, intArray)) {
                System.out.print(x + " ");
            }
        }
        public Integer[] solution(Integer count, Integer[] intArray) {
            Integer[] list = new Integer[count];
            for(int i = 0; i < count; i++) {
                int studentScore = 1;
                for(int j = 0; j < count; j++) {
                    if(intArray[i] < intArray[j]) {
                        studentScore ++;
                    }
                }
                list[i] = studentScore;
            }
            return list;
        }
    }

    /**
     * 재 복습: 2024-12-28
     */
    public static class A8Array6 {
        public static void main(String[] args) {
            A8Array6 a8Array6 = new A8Array6();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            Integer[] answer = a8Array6.solution(length, intArray);
        }
        public Integer[] solution(Integer length, Integer[] intArray) {
            Integer[] list = new Integer[length];
            for(int i = 0; i < length; i++) {
                int studentSum = 1;
                for(int j = 0; j < length; j++) {
                    if(intArray[i] < intArray[j]) {
                        studentSum++;
                    }
                    list[i] = studentSum;
                }
            }
            for(Integer x : list) {
                System.out.print(x + " ");
            }
            return list;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class A8Array7 {
        public static void main(String[] args) {
            A8Array7 a8Array7 = new A8Array7();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            for(Integer x : a8Array7.solution(length, intArray)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer length, Integer[] intArray) {
            List<Integer> answerArray = new ArrayList<>();
            for(int i = 0; i < length; i++) {
                int studentScore = 1;
                for(int j = 0; j < length; j++) {
                    if(intArray[i] < intArray[j]) {
                        studentScore++;
                    }
                }
                answerArray.add(studentScore);
            }
            return answerArray;
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class A8Array8 {
        public static void main(String[] args) {
            A8Array8 a8Array8 = new A8Array8();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            a8Array8.solution(length, intArray);
        }
        public void solution(Integer length, Integer[] intArray) {
            int[] answerArray = new int[length];
            for(int i = 0; i < length; i++) {
                int cnt = 1;
                for(int j = 0; j < length; j++) {
                    if(intArray[i] < intArray[j]) {
                        cnt++;
                    }
                }
                answerArray[i] = cnt;
            }
            for(Integer x : answerArray) {
                System.out.print(x + " ");
            }
        }
    }
}
