package z_baekjoon.silver.two_pointers;

import java.util.Scanner;

/**
 * 배열 합치기
 *
 * 시간 제한	메모리 제한	제출	    정답	    맞힌 사람	정답 비율
 * 1.5 초	256 MB	    47015	22450	14949	    46.472%
 * 문제
 * 정렬되어있는 두 배열 A와 B가 주어진다. 두 배열을 합친 다음 정렬해서 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 배열 A의 크기 N, 배열 B의 크기 M이 주어진다. (1 ≤ N, M ≤ 1,000,000)
 *
 * 둘째 줄에는 배열 A의 내용이, 셋째 줄에는 배열 B의 내용이 주어진다. 배열에 들어있는 수는 절댓값이 109보다 작거나 같은 정수이다.
 *
 * 출력
 * 첫째 줄에 두 배열을 합친 후 정렬한 결과를 출력한다.
 *
 * 예제 입력 1
 * 2 2
 * 3 5
 * 2 9
 * 예제 출력 1
 * 2 3 5 9
 *
 * 예제 입력 2
 * 2 1
 * 4 7
 * 1
 * 예제 출력 2
 * 1 4 7
 *
 * 예제 입력 3
 * 4 3
 * 2 3 5 9
 * 1 4 7
 * 예제 출력 3
 * 1 2 3 4 5 7 9
 */
public class Silver5_11728 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer firstLength = scan.nextInt();
        Integer secondLength = scan.nextInt();
        Integer[] firstArray = new Integer[firstLength];
        for(int i = 0; i < firstLength; i++) {
            firstArray[i] = scan.nextInt();
        }
        Integer[] secondArray = new Integer[secondLength];
        for(int i = 0; i < secondLength; i++) {
            secondArray[i] = scan.nextInt();
        }
        solution(firstLength, firstArray, secondLength, secondArray);
    }
    public static void solution(Integer firstLength, Integer[] firstArray, Integer secondLength, Integer[] secondArray) {
        Integer[] answerArray = new Integer[firstLength + secondLength];
        int p1 = 0;
        int p2 = 0;
        int idx = 0;
        while(p1 < firstLength && p2 < secondLength) {
            if(firstArray[p1] < secondArray[p2]) answerArray[idx++] = firstArray[p1++];
            else answerArray[idx++] = secondArray[p2++];
        }
        while(p1 < firstLength) answerArray[idx++] = firstArray[p1++];
        while(p2 < secondLength) answerArray[idx++] = secondArray[p2++];

        StringBuilder sb = new StringBuilder();
        for (Integer x : answerArray) {
            sb.append(x).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}