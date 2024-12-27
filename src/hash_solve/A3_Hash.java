package hash_solve;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * 매출액의 종류
 * 설명
 *
 * 현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를
 *
 * 각 구간별로 구하라고 했습니다.
 *
 * 만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
 *
 * 20 12 20 10 23 17 10
 *
 * 각 연속 4일간의 구간의 매출종류는
 *
 * 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
 *
 * 두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
 *
 * 세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
 *
 * 네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
 *
 * N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
 * 매출액의 종류를 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
 * 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
 *
 * 출력
 * 첫 줄에 각 구간의 매출액 종류를 순서대로 출력합니다.
 *
 * 예시 입력 1
   7 4
   20 12 20 10 23 17 10
 *
 * 예시 출력 1
 * 3 4 4 3
 */
public class A3_Hash {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer arrayLength = scan.nextInt();
        Integer length = scan.nextInt();
        Integer[] intArray = new Integer[arrayLength];
        for(int i = 0; i < arrayLength; i++) {
            intArray[i] = scan.nextInt();
        }
        List<Integer> answer = solution(arrayLength, length, intArray);
        for(Integer x : answer) {
            System.out.print(x + " ");
        }
    }

    public static List<Integer> solution(Integer arrayLength,
                                         Integer length,
                                         Integer[] intArray) {
      List<Integer> list = new ArrayList<>();
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int i = 0; i < length; i++) {
          map.put(intArray[i], map.getOrDefault(intArray[i], 0) + 1);
      }
      list.add(map.size());
      for(int rigth = length; rigth < arrayLength; rigth++) {
          map.put(intArray[rigth], map.getOrDefault(intArray[rigth], 0) + 1);

          int left = rigth - length;
          map.put(intArray[left], map.get(intArray[left]) - 1);
          if(map.get(intArray[left]) == 0) map.remove(intArray[left]);
          list.add(map.size());
      }
      return list;
    }
}
