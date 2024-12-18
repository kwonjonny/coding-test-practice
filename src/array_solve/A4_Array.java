package array_solve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *  피보나치 수열
 *
 * 설명:
 * 1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 *
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 *
 * 입력:
 *  - 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 *
 * 출력:
 * - 첫 줄에 피보나치 수열을 출력합니다.
 *
 * 예제:
 * 입력:
 *  10
 *
 * 출력:
 *  1 1 2 3 5 8 13 21 34 55
 */
public class A4_Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer count = scan.nextInt();
        List<Integer> array = solution(count);
        for(Integer x : array) {
            System.out.print(x + " ");
        }
    }

    public static List<Integer> solution(Integer count) {
        List<Integer> arrayList = new ArrayList<>();

        Integer current = 1;
        Integer prev = 0;
        for(int i = 0; i < count; i++) {
            arrayList.add(current);
            Integer temp = current;
            current = prev + current;
            prev = temp;
        }
        return arrayList;
    }

    /**
     * 재 복습: 2024-12-11
     */
    public static class A4Array {
        public static void main(String[] args) {
            A4Array a4Array = new A4Array();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            List<Integer> solution = a4Array.solution(count);
            for(Integer x : solution) {
                System.out.print(x + " ");
            }
        }

        public List<Integer> solution(Integer count) {
            List<Integer> arrayList = new ArrayList<>();

            Integer next = 1;
            Integer prev = 0;
            for(int i = 0; i < count; i ++) {
                arrayList.add(next);
                Integer temp = next;
                next = prev + next;
                prev = temp;
            }
            return arrayList;
        }
    }

    /**
     * 재 복습: 2024-12-12
     */
    public static class A4Array1 {
        public static void main(String[] args) {
            A4Array1 a4Array1 = new A4Array1();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            List<Integer> solution = a4Array1.solution(count);
        }

        public List<Integer> solution(Integer count){
            List<Integer> arrayList = new ArrayList<>();

            Integer prev = 0;
            Integer next = 1;
            for(int i = 0; i < count; i++) {
                arrayList.add(next);
                Integer temp = next;
                next = next + prev;
                prev = temp;
            }
            System.out.println(arrayList);
            return null;
        }
    }

    /**
     * 재 복습: 2024-12-15
     */
    public static class A4Array2 {
        public static void main(String[] args) {
            A4Array2 a4Array2 = new A4Array2();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            for(Integer x : a4Array2.solution(count)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer count) {
            List<Integer> intArrayList = new ArrayList<>();
            Integer prev = 0;
            Integer next = 1;
            for(int i = 0; i < count; i++) {
                intArrayList.add(next);
                int temp = next;
                next = prev + next;
                prev = temp;
            }
            return intArrayList;
        }
    }

    /**
     * 재 복습: 2024-12-17
     */
    public static class A4Array3 {
        public static void main(String[] args) {
            A4Array3 a4Array3 = new A4Array3();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            for(Integer x : a4Array3.solution(count)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer count) {
            List<Integer> arrayList = new ArrayList<>();
            int prev = 0;
            int next = 1;
            for(int i = 0; i < count; i++) {
                arrayList.add(next);
                int temp = next;
                next = next + prev;
                prev = temp;
            }
            return arrayList;
        }
    }

    /**
     * 재 복습: 2024-12-18
     */
    public static class A4Array4 {
        public static void main(String[] args) {
            A4Array4 a4Array4 = new A4Array4();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            for(Integer x : a4Array4.solution(count)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer count) {
            List<Integer> list = new ArrayList<>();
            int prev = 0;
            int next = 1;
            for(int i = 0; i < count; i++) {
                list.add(next);
                int temp = next;
                next = next + prev;
                prev = temp;
            }
            return list;
        }
    }
}
