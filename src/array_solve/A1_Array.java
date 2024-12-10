package array_solve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *  큰 수 출력하기
 *
 * 설명: N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 *
 * (첫 번째 수는 무조건 출력한다)
 *
 * 조건:
 * 1. 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 *
 * 입력:
 * - 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 *
 * 출력:
 * - 첫 줄에 해당 문자의 개수를 출력합니다.
 *
 * 예제:
 * 입력:
 *   6
 *   7 3 9 5 6 12
 * 출력:
 *   7 9 6 12
 */
public class A1_Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer aInt = scan.nextInt();
        int[] arrayInt = new int[aInt];
        for(int i = 0; i < aInt; i++) {
            arrayInt[i] = scan.nextInt();
        }
        List<Integer> solution = solution(aInt, arrayInt);
        for(int a : solution) {
            System.out.print(a + " ");
        }
    }

    public static List<Integer> solution(Integer aInt, int[] arrayInt) {
        List<Integer> array = new ArrayList<>();
        array.add(arrayInt[0]);

        for(int i = 1; i < aInt; i++) {
            if(arrayInt[i] >= arrayInt[i - 1]) {
                array.add(arrayInt[i]);
            }
        }
        return array;
    }

    /**
     * 재 복습: 2024-12-09
     */
    public static class A1Array {
        public static void main(String[] args) {
            A1Array a1String = new A1Array();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] array = new Integer[count];
            for(int i = 0; i < array.length; i++) {
                array[i] = scan.nextInt();
            }
            List<Integer> arrayList = a1String.solution(count, array);
            for(Integer x : arrayList) {
                System.out.print(x + " ");
            }
        }

        public List<Integer> solution(Integer count, Integer[] array) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(array[0]);
            for(int i = 1; i <  array.length; i++) {
                if(array[i] >= array[i - 1]) {
                    arrayList.add(array[i]);
                }
            }
            return arrayList;
        }
    }

    /**
     * 재 복습: 2024-12-10
     */
    public static class A2Array {
        public static void main(String[] args) {
            A2Array a2Array = new A2Array();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] arrayInteger = new Integer[count];
            for(int i = 0; i < count; i++) {
                arrayInteger[i] = scan.nextInt();
            }

            List<Integer> arrayList = a2Array.solution(count, arrayInteger);
            System.out.print(arrayList + " ");
        }


        public List<Integer> solution(Integer count, Integer[] arrayInteger) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int i = 1; i < count; i++) {
                if(arrayInteger[i] >= arrayInteger[i - 1])  {
                    arrayList.add(arrayInteger[i]);
                }
            }
            return arrayList;
        }
    }
}
