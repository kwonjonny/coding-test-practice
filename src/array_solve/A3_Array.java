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
 *   5
 *   2 3 3 1 3
 *   1 1 2 2 3
 * 출력:
 *   A
 *   B
 *   A
 *   B
 *   D
 */
public class A3_Array {

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

}
