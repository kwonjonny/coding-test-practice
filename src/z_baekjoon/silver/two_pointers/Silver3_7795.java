package z_baekjoon.silver.two_pointers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 먹을 것인가 먹힐 것인가
 *
 * 시간 제한	메모리 제한	제출	    정답	    맞힌 사람	정답 비율
 * 1 초	    256 MB	    18902	9573	7051	     50.465%
 *
 * 문제
 * 심해에는 두 종류의 생명체 A와 B가 존재한다. A는 B를 먹는다.
 *
 * A는 자기보다 크기가 작은 먹이만 먹을 수 있다.
 *
 * 예를 들어, A의 크기가 {8, 1, 7, 3, 1}이고, B의 크기가 {3, 6, 1}인 경우에 A가 B를 먹을 수 있는 쌍의 개수는 7가지가 있다.
 *
 * 8-3, 8-6, 8-1, 7-3, 7-6, 7-1, 3-1.
 *
 * 두 생명체 A와 B의 크기가 주어졌을 때, A의 크기가 B보다 큰 쌍이 몇 개나 있는지 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스의 첫째 줄에는 A의 수 N과 B의 수 M이 주어진다.
 *
 * 둘째 줄에는 A의 크기가 모두 주어지며, 셋째 줄에는 B의 크기가 모두 주어진다.
 *
 * 크기는 양의 정수이다. (1 ≤ N, M ≤ 20,000)
 *
 * 출력
 * 각 테스트 케이스마다, A가 B보다 큰 쌍의 개수를 출력한다.
 *
 * 예제 입력 1
     2
     5 3
     8 1 7 3 1
     3 6 1
     3 4
     2 13 7
     103 11 290 215
 *
 * 예제 출력 1
     7
     1
 */
public class Silver3_7795 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        Integer testCount = scan.nextInt();
        for (int i = 0; i < testCount; i++) {

            Integer a = scan.nextInt();
            Integer b = scan.nextInt();
            Integer[] aArray = new Integer[a];
            for (int j = 0; j < a; j++) {
                aArray[j] = scan.nextInt();
            }
            Integer[] bArray = new Integer[b];
            for (int j = 0; j < b; j++) {
                bArray[j] = scan.nextInt();
            }
            stringBuilder.append(solution(aArray, bArray)).append("\n");
        }
        System.out.println(stringBuilder);
    }
    public static Integer solution(Integer[] aArray, Integer[] bArray) {
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        int answer = 0;
        int bPointer = 0;
        for (Integer a : aArray) {
            while (bPointer < bArray.length && bArray[bPointer] < a) {
                bPointer++;
            }
            answer = answer + bPointer;
        }
        return answer;
    }

    /**
     * 재 복습: 2025-01-07
     */
    public static class Silver3_7795_1 {
        public static void main(String[] args) {
            Silver3_7795_1 silver377951 = new Silver3_7795_1();
            Scanner scan = new Scanner(System.in);
            StringBuilder stringBuilder = new StringBuilder();
            Integer count = scan.nextInt();
            for(int i = 0; i < count; i++) {
                Integer firstLength = scan.nextInt();
                Integer secondLength = scan.nextInt();
                Integer[] firstArray = new Integer[firstLength];
                for(int j = 0; j < firstLength; j++) {
                    firstArray[j] = scan.nextInt();
                }
                Integer[] secondArray = new Integer[secondLength];
                for(int j = 0; j < secondLength; j++) {
                    secondArray[j] = scan.nextInt();
                }
                Integer answer = silver377951.solution(firstLength, secondLength, firstArray, secondArray);
                stringBuilder.append(answer).append("\n");
            }
            System.out.println(stringBuilder);
        }
        public Integer solution(Integer firstLength, Integer secondLength, Integer[] firstArray, Integer[] secondArray) {
            int answer = 0;
            int secondPoint = 0;
            Arrays.sort(firstArray); Arrays.sort(secondArray);
            for (Integer x : firstArray) {
                while(secondLength > secondPoint && x > secondArray[secondPoint]) {
                    secondPoint++;
                }
                answer = answer + secondPoint;
            }
            return answer;
        }
    }
}