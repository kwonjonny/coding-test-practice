package hash_solve;

import java.util.*;

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

    /**
     * 재 복습: 2025-01-08
     */
    public static class A3Hash3 {
        public static void main(String[] args) {
            A3Hash3 a3Hash3 = new A3Hash3();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer order = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            a3Hash3.solution(length, order, intArray);
        }
        public void solution(Integer length, Integer order, Integer[] intArray) {
            List<Integer> list = new ArrayList<>();
            HashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
            for(int i = 0; i < order; i++) {
                int findInt = intArray[i];
                hashMap.put(findInt, hashMap.getOrDefault(findInt, 0) + 1);
            }
            list.add(hashMap.size());
            for(int right = order; right < length; right++) {
                int findInt = intArray[right];
                hashMap.put(findInt, hashMap.getOrDefault(findInt, 0) + 1);

                int leftInt = right - order;
                hashMap.put(intArray[leftInt], hashMap.get(intArray[leftInt]) - 1);
                if(hashMap.get(intArray[leftInt]) == 0) hashMap.remove(intArray[leftInt]);
                list.add(hashMap.size());
            }
            for(Integer x : list) {
                System.out.print(x + " ");
            }
        }
    }
    
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

    /**
     * 재 복습: 2024-12-28
     */
    public static class A3Hash {
        public static void main(String[] args) {
            A3Hash a3Hash = new A3Hash();
            Scanner scan = new Scanner(System.in);
            Integer arrayLength = scan.nextInt();
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[arrayLength];
            for(int i = 0; i < arrayLength; i++) {
                intArray[i] = scan.nextInt();
            }
            List<Integer> answer = a3Hash.solution(arrayLength, length, intArray);
            for(Integer x : answer) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer length, Integer orderCount, Integer[] intArray) {
            List<Integer> list = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < orderCount; i++) {
                map.put(intArray[i], map.getOrDefault(intArray[i], 0) + 1);
            }
            list.add(map.size());
            for(int right = orderCount; right < length; right++) {
                map.put(intArray[right], map.getOrDefault(intArray[right], 0) + 1);
                int left = right - orderCount;
                map.put(intArray[left], map.getOrDefault(intArray[left], 0) - 1);
                if(map.get(intArray[left]) == 0) map.remove(intArray[left]);
                list.add(map.size());
            }
            return list;
        }
    }

    /**
     * 재 복습: 2024-12-28
     */
    public static class A3Hash1 {
        public static void main(String[] args) {
            A3Hash1 a3Hash1 = new A3Hash1();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer orderCount = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            for(Integer x : a3Hash1.solution(length, orderCount, intArray)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer length, Integer orderCount, Integer[] intArray) {
            List<Integer> list = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < orderCount; i++) {
                map.put(intArray[i], map.getOrDefault(intArray[i], 0) + 1);
            }
            list.add(map.size());
            for(int rigth = orderCount; rigth < length; rigth++) {
                map.put(intArray[rigth], map.getOrDefault(intArray[rigth], 0) + 1);
                int left = rigth - orderCount;
                map.put(intArray[left], map.get(intArray[left]) - 1);
                if(map.get(intArray[left]) == 0) map.remove(intArray[left]);
                list.add(map.size());
            }
            return list;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class A3Hash2 {
        public static void main(String[] args) {
            A3Hash2 a3Hash2 = new A3Hash2();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer orderCount = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            List<Integer> answer = a3Hash2.solution(length, orderCount, intArray);
            for(Integer x : answer) {
                System.out.print(answer + " ");
            }
        }
        public List<Integer> solution(Integer length, Integer orderCount, Integer[] intArray) {
            List<Integer> answerList = new ArrayList<>();
            HashMap<Integer, Integer> hashMap = new HashMap<>();

            for(int i = 0; i < orderCount; i++) {
                int findInteger = intArray[i];
                hashMap.put(findInteger, hashMap.getOrDefault(findInteger, 0) + 1);
            }
            answerList.add(hashMap.size());
            for(int rigth = orderCount; rigth < length; rigth++) {
                int findInteger = intArray[rigth];
                hashMap.put(findInteger, hashMap.getOrDefault(findInteger, 0) + 1);

                int left = rigth - orderCount;
                int findLeftInteger = intArray[left];
                hashMap.put(findLeftInteger, hashMap.getOrDefault(findLeftInteger, 0) - 1);
                if(hashMap.get(intArray[left]) == 0) hashMap.remove(intArray[left]);
                answerList.add(hashMap.size());
            }
            return answerList;
        }
    }
}
