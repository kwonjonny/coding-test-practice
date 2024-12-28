package hash_solve;

import java.util.*;

/**
 * K번째 큰 수
 * 설명
 *
 * 현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
 *
 * 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
 *
 * 기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
 *
 * 만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.
 *
 * 입력
 * 첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.
 *
 * 출력
 * 첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.
 *
 * 예시 입력
   10 3
   13 15 34 23 45 65 33 11 26 42
 *
 * 예시 출력
 * 143
 */
public class A5_Hash {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer length = scan.nextInt();
        Integer findOrder = scan.nextInt();
        Integer[] intArray = new Integer[length];
        for(int i = 0; i < length; i++) {
            intArray[i] = scan.nextInt();
        }
        Integer answer = solution(length, findOrder, intArray);
        System.out.println(answer);
    }
    public static Integer solution(Integer length, Integer findOrder, Integer[] intArray) {
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        Integer answer = -1;
        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j < length; j++) {
                for(int t = j + 1; t < length; t++) {
                    treeSet.add(intArray[i] + intArray[j] + intArray[t]);
                }
            }
        }
        int cnt = 0;
        for(Integer x : treeSet) {
            cnt++;
            if(cnt == findOrder) {
                answer = x;
                break;
            }
        }
        return answer;
    }

    /**
     * 재 복습: 2024-12-28
     */
    public static class A5Hash1 {
        public static void main(String[] args) {
            A5Hash1 a5Hash1 = new A5Hash1();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer orderCount = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            Integer answer = a5Hash1.solution(length, orderCount, intArray);
            System.out.println(answer);
        }
        public Integer solution(Integer length, Integer orderCount, Integer[] intArray) {
            Integer answer = -1;
            TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
            for(int i = 0; i < length; i++) {
                for(int j = i + 1; j < length; j++) {
                    for(int k = j + 1; k < length; k++) {
                        treeSet.add(intArray[i] + intArray[j] + intArray[k]);
                    }
                }
            }
            Integer cnt = 0;
            for(Integer x : treeSet) {
                cnt++;
                if(cnt.equals(orderCount)) {
                    answer = x;
                    break;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습; 2024-12-28
     */
    public static class A5Hash2 {
        public static void main(String[] args) {
            A5Hash2 a5Hash2 = new A5Hash2();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer orderCount = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            Integer answer = a5Hash2.solution(length, orderCount, intArray);
            System.out.println(answer);
        }
        public Integer solution(Integer length, Integer orderCount, Integer[] intArray) {
            TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
            Integer answer = -1;
            for(int i = 0; i < length; i++) {
                for(int j = i + 1; j < length; j++) {
                    for(int k = j + 1; k < length; k++) {
                        treeSet.add(intArray[i] + intArray[j] + intArray[k]);
                    }
                }
            }
            Integer cnt = 0;
            for(Integer x : treeSet) {
                cnt++;
                if(cnt.equals(orderCount)) {
                    answer = x;
                    break;
                }
            }
            return answer;
        }
    }
}