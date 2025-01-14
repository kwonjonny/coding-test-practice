package z_baekjoon.silver.sliding_window;

import java.util.Scanner;

/**
 * 블로그
 *
 * 시간 제한	메모리 제한	제출	    정답	    맞힌 사람	정답 비율
 * 1 초	    512 MB	    16242	6884	5591	    41.516%
 *
 * 문제
 * 찬솔이는 블로그를 시작한 지 벌써
 * $N$일이 지났다.
 *
 * 요즘 바빠서 관리를 못 했다가 방문 기록을 봤더니 벌써 누적 방문 수가 6만을 넘었다.
 *
 * 찬솔이는
 *
 * $X$일 동안 가장 많이 들어온 방문자 수와 그 기간들을 알고 싶다.
 *
 * 찬솔이를 대신해서
 *
 * $X$일 동안 가장 많이 들어온 방문자 수와 기간이 몇 개 있는지 구해주자.
 *
 * 입력
 * 첫째 줄에 블로그를 시작하고 지난 일수
 * $N$와
 * $X$가 공백으로 구분되어 주어진다.
 *
 * 둘째 줄에는 블로그 시작
 * $1$일차부터
 * $N$일차까지 하루 방문자 수가 공백으로 구분되어 주어진다.
 *
 * 출력
 * 첫째 줄에
 * $X$일 동안 가장 많이 들어온 방문자 수를 출력한다. 만약 최대 방문자 수가 0명이라면 SAD를 출력한다.
 *
 * 만약 최대 방문자 수가 0명이 아닌 경우 둘째 줄에 기간이 몇 개 있는지 출력한다.
 *
 * 제한
 * 1 <= X <= N <= 250,000
 * 0 <= 방문자 수 <= 8,000
 *
 * 예제 입력 1
 * 5 2
 * 1 4 2 5 1
 *
 * 예제 출력 1
 * 7
 * 1
 *
 * 예제 입력 2
 * 7 5
 * 1 1 1 1 1 5 1
 *
 * 예제 출력 2
 * 9
 * 2
 *
 * 예제 입력 3
 * 5 3
 * 0 0 0 0 0
 *
 * 예제 출력 3
 * SAD
 */
public class Silver3_21921 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer length = scan.nextInt();
        Integer order = scan.nextInt();
        Integer[] intArray = new Integer[length];
        for(int i = 0; i < length; i++) {
            intArray[i] = scan.nextInt();
        }
        solution(length, order, intArray);
    }
    public static void solution(Integer length, Integer order, Integer[] intArray) {
        int max = 0;
        int currentSum = 0;
        int count = 0;
        for(int i = 0; i < order; i++) {
            currentSum = currentSum + intArray[i];
        }
        max = currentSum;
        count = 1;


        for(int right = order; right < length; right++) {
            currentSum = currentSum + intArray[right] - intArray[right - order];
            if(currentSum > max) {
                count = 1;
                max = currentSum;
            }
            else if (currentSum == max) count++;
        }

        if(max == 0) {
            System.out.println("SAD");
        }
        else {
            System.out.println(max);
            System.out.println(count);
        }
    }
}
