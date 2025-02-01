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
     6
     7 3 9 5 6 12
 * 출력:
 *   7 9 6 12
 */
public class A1_Array {

    /**
     * 재 복습: 2025-02-01
     */
    public static class A1Array10 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            A1Array10.solution(length, intArray);
        }
        public static void solution(Integer length, Integer[] intArray) {
            List<Integer> answer = new ArrayList<>();
            answer.add(intArray[0]);
            for(int i = 1; i < length; i++) {
                if(intArray[i] > intArray[i - 1]) {
                    answer.add(intArray[i]);
                }
            }
            for(Integer x : answer) {
                System.out.print(x + " ");
            }
        }
    }

    /**
     * 재 복습: 2025-01-14
     */
    public static class A1Array9 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            A1Array9.solution(length, intArray);
        }
        public static void solution(Integer length, Integer[] intArray) {
            List<Integer> answer = new ArrayList<>();
            answer.add(intArray[0]);
            for(int i = 1; i < length; i++) {
                if(intArray[i] > intArray[i - 1]) {
                    answer.add(intArray[i]);
                }
            }
            for(Integer x: answer) {
                System.out.print(x + " ");
            }
        }
    }

    /**
     * 재 복습: 2025-01-10
     */
    public static class A1Array8 {
        public static void main(String[] args) {
            A1Array8 a1Array8 = new A1Array8();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            a1Array8.solution(length, intArray);
        }
        public void solution(Integer length, Integer[] intArray) {
            List<Integer> answer = new ArrayList<>();
            answer.add(intArray[0]);
            for(int i = 1; i < length; i++) {
                if(intArray[i] > intArray[i - 1]) {
                    answer.add(intArray[i]);
                }
            }
            for(Integer x : answer) {
                System.out.print(x + " ");
            }
        }
    }

    /**
     * 재 복습: 2025-01-09
     */
    public static class A1Array7 {
        public static void main(String[] args) {
            A1Array7 a1Array7 = new A1Array7();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            a1Array7.solution(length, intArray);
        }
        public void solution(Integer length, Integer[] intArray) {
            List<Integer> answer = new ArrayList<>();
            answer.add(intArray[0]);
            for(int i = 1; i < length; i++) {
                if(intArray[i] > intArray[i - 1]) answer.add(intArray[i]);
            }
            for(Integer x : answer) {
                System.out.print(x + " ");
            }
        }
    }

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

    /**
     * 재 복습: 2024-12-11
     */
    public static class A3Array {
        public static void main(String[] args) {
            A3Array a6Array = new A3Array();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] intArray = new Integer[count];
            for(int i = 0; i < count; i ++) {
                intArray[i] = scan.nextInt();
            }
            List<Integer> solution = a6Array.solution(count, intArray);
            for(Integer x : solution) {
                System.out.print(x + " ");
            }
        }

        public List<Integer> solution(Integer count, Integer[] intArray) {
            List<Integer> arrayList = new ArrayList<>();
            arrayList.add(intArray[0]);
            for(int i = 1; i < count; i++) {
                if(intArray[i] >= intArray[i-1]) {
                    arrayList.add(intArray[i]);
                }
            }
            return arrayList;
        }
    }

    /**
     * 재 복습: 2024-12-15
     */
    public static class A1Array1 {
        public static void main(String[] args) {
            A1Array1 a1Array1 = new A1Array1();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] intArray = new Integer[count];
            for(int i = 0; i < count; i++) {
                intArray[i] = scan.nextInt();
            }
            for(Integer x : a1Array1.solution(count, intArray)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer count, Integer[] intArray) {
            List<Integer> newArrayList = new ArrayList<>();
            newArrayList.add(intArray[0]);
            for(int i = 1; i < count; i++) {
                if(intArray[i] > intArray[i -1]) {
                    newArrayList.add(intArray[i]);
                }
            }
            return newArrayList;
        }
    }

    /**
     * 재 복습: 2024-12-18
     */
    public static class A1Array2 {
        public static void main(String[] args) {
            A1Array2 a1Array2 = new A1Array2();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] intArray = new Integer[count];
            for(int i = 0; i < count; i++) {
                intArray[i] = scan.nextInt();
            }
            for(Integer x : a1Array2.solution(count, intArray)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer count, Integer[] intArray) {
            List<Integer> list = new ArrayList<>();
            list.add(intArray[0]);
            for(int i = 0; i < count; i++) {
                if(i < intArray.length -1 && intArray[i] < intArray[i + 1]) {
                    list.add(intArray[i + 1]);
                }
            }
            return list;
        }
    }

    /**
     * 재 복습: 2024-12-26
     */
    public static class A1Array3 {
        public static void main(String[] args) {
            A1Array3 a1Array3 = new A1Array3();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            for(Integer x : a1Array3.solution(length, intArray)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer length, Integer[] intArray) {
            List<Integer> list = new ArrayList<>();
            list.add(intArray[0]);
            for(int i = 1; i < length; i++) {
                if(intArray[i] >= intArray[i - 1]) {
                    list.add(intArray[i]);
                }
            }
            return list;
        }
    }

    /**
     * 재 복습: 2024-12-28
     */
    public static class A1Array4 {
        public static void main(String[] args) {
            A1Array4 a1Array4 = new A1Array4();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            for(Integer x : a1Array4.solution(length, intArray)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer length, Integer[] intArray) {
            List<Integer> list = new ArrayList<>();
            list.add(intArray[0]);
            for(int i = 1; i < length; i++) {
                if(intArray[i] > intArray[i -1]) {
                    list.add(intArray[i]);
                }
            }
            return list;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class A1Array5 {
        public static void main(String[] args) {
            A1Array5 a1Array5 = new A1Array5();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            for(Integer x : a1Array5.solution(length, intArray)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer length, Integer[] intArray) {
            List<Integer> answerList = new ArrayList<>();
            answerList.add(intArray[0]);
            for(int i = 1; i < length; i++) {
                if(intArray[i] > intArray[i - 1]) {
                    answerList.add(intArray[i]);
                }
            }
            return answerList;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class A1Array6 {
        public static void main(String[] args) {
            A1Array6 a1Array6 = new A1Array6();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            a1Array6.solution(length, intArray);
        }
        public void solution(Integer length, Integer[] intArray) {
            List<Integer> answerList = new ArrayList<>();
            answerList.add(intArray[0]);
            for(int i = 1; i < length; i++) {
                if(intArray[i] > intArray[i - 1]) answerList.add(intArray[i]);
            }
            for(Integer x : answerList) {
                System.out.print(x + " ");
            }
        }
    }
}
