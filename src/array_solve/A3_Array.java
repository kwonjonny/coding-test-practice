package array_solve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *  가위 바위 보
 *
 * 설명: A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 *
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 *
 * 예를 들어 N=5이면
 *
 * 회수            1  2  3  4  5
 * A의 정보        2  3  3  1  3
 * B의 정보        1  1  2  2  3
 * 승자            A  B  A  B  D
 *
 * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
 *
 * 입력:
 * - 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
 *
 * - 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 *
 * - 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 *
 * 출력:
 * - 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
 *
 * 예제:
 * 입력:
    5
    2 3 3 1 3
    1 1 2 2 3
 * 출력:
 *   A
 *   B
 *   A
 *   B
 *   D
 */
public class A3_Array {

    /**
     * 재 복습: 2025-01-14
     */
    public static class A3Array9 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] A = new Integer[length];
            for(int i = 0; i < length; i++) {
                A[i] = scan.nextInt();
            }
            Integer[] B = new Integer[length];
            for(int i = 0; i < length; i++) {
                B[i] = scan.nextInt();
            }
            A3Array9.solution(length, A, B);
        }
        public static void solution(Integer length, Integer[] A, Integer[] B) {
            List<String> answer = new ArrayList<>();
            for(int i = 0; i < length; i++) {
                Integer a = A[i];
                Integer b = B[i];
                if(a.equals(b)) answer.add("D");
                else if (a.equals(1) && b.equals(3) || a.equals(2) && b.equals(1) || a.equals(3) && b.equals(2)) answer.add("A");
                else answer.add("B");
            }
            for(String x : answer) {
                System.out.println(x);
            }
        }
    }

    /**
     * 재 복습: 2025-01-10
     */
    public static class A3Array8 {
        public static void main(String[] args) {
            A3Array8 a3Array8 = new A3Array8();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] aArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                aArray[i] = scan.nextInt();
            }
            Integer[] bArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                bArray[i] = scan.nextInt();;
            }
            a3Array8.solution(length, aArray, bArray);
        }
        public void solution(Integer length, Integer[] aArray, Integer[] bArray) {
            List<String> answer = new ArrayList<>();
            for(int i = 0; i < length; i++) {
                Integer a = aArray[i];
                Integer b = bArray[i];
                if(a.equals(b)) answer.add("D");
                else if (a.equals(1) && b.equals(3) || a.equals(2) && b.equals(1) || a.equals(3) && b.equals(2)) answer.add("A");
                else answer.add("B");
            }
            for(String x : answer) {
                System.out.println(x);
            }
        }
    }

    /**
     * 재 복습: 2025-01-09
     */
    public static class A3Array7 {
        public static void main(String[] args) {
            A3Array7 a3Array7 = new A3Array7();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] aArray=  new Integer[length];
            for(int i = 0; i < length; i++) {
                aArray[i] = scan.nextInt();
            }
            Integer[] bArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                bArray[i] = scan.nextInt();
            }
            a3Array7.solution(length, aArray, bArray);
        }
        public void solution(Integer length, Integer[] aArray, Integer[] bArray) {
            List<String> answer = new ArrayList<>();
            for(int i = 0; i < length; i++) {
                Integer a = aArray[i];
                Integer b = bArray[i];
                if(a.equals(b)) answer.add("D");
                else if (a.equals(1) && b.equals(3) || a.equals(2) && b.equals(1) || a.equals(3) && b.equals(2)) answer.add("A");
                else answer.add("B");
            }
            for(String x : answer) {
                System.out.println(x);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer count = scan.nextInt();
        Integer[] aArray = new Integer[count];
        Integer[] bArray = new Integer[count];

        for(int i = 0; i < count; i++) {
            aArray[i] = scan.nextInt();
        }

        for(int i = 0; i < count; i++) {
            bArray[i] = scan.nextInt();
        }

        List<String> solution = solution(count, aArray, bArray);
        for(String x : solution) {
            System.out.println(x);
        }
    }

    public static List<String> solution(Integer count, Integer[] aArray, Integer[] bArray) {
        List<String> stringArrayList = new ArrayList<>();
        for(int i = 0; i < count; i++) {
           Integer a = aArray[i];
           Integer b = bArray[i];

           if(a.equals(b)) {
               stringArrayList.add("D");
           } else if (a == 1 && b == 3 || a == 2 && b == 1 || a == 3 && b ==2) {
               stringArrayList.add("A");
           } else {
               stringArrayList.add("B");
           }
        }
        return stringArrayList;
    }

    /**
     * 재 복습: 2024-12-11
     */
    public static class A3Array {
        public static void main(String[] args) {
            A3Array a3Array = new A3Array();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] aArray = new Integer[count];
            Integer[] bArray = new Integer[count];

            for(int i = 0; i < count; i++) {
                aArray[i] = scan.nextInt();
            }

            for(int i = 0; i < count; i++) {
                bArray[i] = scan.nextInt();
            }

            List<String> solution = a3Array.solution(count, aArray, bArray);
            for(String x : solution) {
                System.out.println(x);
            }
        }
        public List<String> solution(Integer count, Integer[] aArray, Integer[] bArray) {
            List<String> solution = new ArrayList<>();
            for(int i = 0; i < count; i++) {
                Integer a = aArray[i];
                Integer b = bArray[i];
                if(a.equals(b)) {
                    solution.add("D");
                } else if (a == 1 && b == 3 || a == 2 && b == 1 || a == 3 && b == 2) {
                    solution.add("A");
                } else {
                    solution.add("B");
                }
            }
            return solution;
        }
    }

    /**
     * 재 복습: 2024-12-15
     */
    public static class A3Array1 {
        public static void main(String[] args) {
            A3Array1 a3Array1 = new A3Array1();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] aArray = new Integer[count];
            Integer[] bArray = new Integer[count];
            for(int i = 0; i < count; i++) {
                aArray[i] = scan.nextInt();
            }
            for(int i  = 0; i < count; i++) {
                bArray[i] = scan.nextInt();
            }
            for(String x : a3Array1.solution(count, aArray, bArray)) {
                System.out.println(x);
            }
        }
        public List<String> solution(Integer count, Integer[] aArray, Integer[] bArray) {
            List<String> stringArrayList = new ArrayList<>();
            for(int i = 0; i < count; i++) {
                Integer a = aArray[i];
                Integer b = bArray[i];

                if(a == 1 && b == 3 || a == 2 && b == 1 || a == 3 && b == 2) {
                    stringArrayList.add("A");
                } else if (a.equals(b)) {
                    stringArrayList.add("D");
                } else {
                    stringArrayList.add("B");
                }
            }
            return stringArrayList;
        }
    }

    /**
     * 재 복습: 2024-12-18
     */
    public static class A3Array3 {
        public static void main(String[] args) {
            A3Array3 a3Array3 = new A3Array3();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] aArray = new Integer[count];
            for(int i = 0; i < count; i++) {
                aArray[i] = scan.nextInt();
            }
            Integer[] bArray = new Integer[count];
            for(int i = 0; i < count; i++) {
                bArray[i] = scan.nextInt();
            }
            for(String x : a3Array3.solution(count, aArray, bArray)) {
                System.out.println(x);
            }
        }
        public List<String> solution(Integer count, Integer[] aArray, Integer[] bArray) {
            List<String> list = new ArrayList<>();
            for(int i = 0; i < count; i++) {
                Integer a = aArray[i];
                Integer b = bArray[i];
                if(a.equals(b)) {
                    list.add("D");
                } else if (a == 1 && b == 3 || a == 2 && b == 1 || a == 3 && b == 2) {
                    list.add("A");
                } else {
                    list.add("B");
                }
            }
            return list;
        }
    }

    /**
     * 재 복습: 2024-12-26
     */
    public static class A3Array4 {
        public static void main(String[] args) {
            A3Array4 a3Array4 = new A3Array4();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] aArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                aArray[i] = scan.nextInt();
            }
            Integer[] bArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                bArray[i] = scan.nextInt();
            }
            for(String x : a3Array4.solution(length, aArray, bArray)) {
                System.out.println(x);
            }
        }
        public List<String> solution(Integer length, Integer[] aArray, Integer[] bArray) {
            List<String> listString = new ArrayList<>();
            for(int i = 0; i < length; i++) {
                Integer a = aArray[i];
                Integer b = bArray[i];
                if(a.equals(b)) {
                    listString.add("D");
                } else if(a.equals(1) && b.equals(3) || a.equals(2) && b.equals(1) || a.equals(3) && b.equals(2)) {
                    listString.add("A");
                } else {
                    listString.add("B");
                }
            }
            return listString;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class A3Array5 {
        public static void main(String[] args) {
            A3Array5 a3Array5 = new A3Array5();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] aArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                aArray[i] = scan.nextInt();
            }
            Integer[] bArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                bArray[i] = scan.nextInt();
            }
            a3Array5.solution(length, aArray, bArray);
        }
        public void solution(Integer length, Integer[] aArray, Integer[] bArray) {
            List<String> answerList = new ArrayList<>();

            for(int i = 0; i < length; i++) {
                Integer a = aArray[i];
                Integer b = bArray[i];
                if(a.equals(b)) {
                    answerList.add("D");
                }
                else if(a.equals(1) && b.equals(3) || a.equals(2) && b.equals(1) || a.equals(3) && b.equals(2)) {
                    answerList.add("A");
                }
                else answerList.add("B");
            }
            for(String x : answerList) {
                System.out.println(x);
            }
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class A3Array6 {
        public static void main(String[] args) {
            A3Array6 a3Array6 = new A3Array6();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] aArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                aArray[i] = scan.nextInt();
            }
            Integer[] bArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                bArray[i] = scan.nextInt();
            }
            a3Array6.solution(length, aArray, bArray);
        }
        public void solution(Integer length, Integer[] aArray, Integer[] bArray) {
            List<String> list = new ArrayList<>();
            for(int i = 0; i < length; i++) {
                Integer a = aArray[i];
                Integer b = bArray[i];
                if(a.equals(b)) list.add("D");
                else if (a.equals(1) && b.equals(3) || a.equals(2) && b.equals(1) || a.equals(3) && b.equals(2)) list.add("A");
                else list.add("B");
            }
            for(String  x : list) {
                System.out.println(x);
            }
        }
    }
}