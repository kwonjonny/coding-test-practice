package sorting_and_searching_solve;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 마구간 정하기(결정알고리즘)
 * 설명
 *
 * N개의 마구간이 수직선상에 있습니다. 각 마구간은 x1, x2, x3, ......, xN의 좌표를 가지며, 마구간간에 좌표가 중복되는 일은 없습니다.
 *
 * 현수는 C마리의 말을 가지고 있는데, 이 말들은 서로 가까이 있는 것을 좋아하지 않습니다. 각 마구간에는 한 마리의 말만 넣을 수 있고,
 *
 * 가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치하고 싶습니다.
 *
 * C마리의 말을 N개의 마구간에 배치했을 때 가장 가까운 두 말의 거리가 최대가 되는 그 최대값을 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 *
 * 첫 줄에 자연수 N(3<=N<=200,000)과 C(2<=C<=N)이 공백을 사이에 두고 주어집니다.
 *
 * 둘째 줄에 마구간의 좌표 xi(0<=xi<=1,000,000,000)가 차례로 주어집니다.
 *
 *
 * 출력
 *
 * 첫 줄에 가장 가까운 두 말의 최대 거리를 출력하세요.
 *
 *
 * 예시 입력 1
    5 3
    1 2 8 4 9
 *
 * 예시 출력 1
 * 3
 */
public class A_Searching5 {

    /**
     * 재 복습: 2025-01-31
     */
    public static class ASearching7 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer target = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            ASearching7.solution(length, target, intArray);
        }
        public static Integer count(Integer[] intArray, Integer mid) {
            int horseCount = 1;
            int endPosition = intArray[0];
            for(int i = 1; i < intArray.length; i++) {
                if(intArray[i] - endPosition >= mid) {
                    horseCount++;
                    endPosition = intArray[i];
                }
            }
            return horseCount;
        }
        public static void solution(Integer length, Integer target, Integer[] intArray) {
            Arrays.sort(intArray);
            int left = 0;
            int right = intArray[length - 1];
            int answer = 0;
            while(right >= left) {
                int mid = (right + left) / 2;
                if(count(intArray, mid) >= target) {
                    answer = mid;
                    mid = left++;
                }
                else mid = right--;
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-01-24
     */
    public static class ASearching6 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer target = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            ASearching6.solution(length, target, intArray);
        }
        public static void solution(Integer length, Integer target, Integer[] intArray) {
            Arrays.sort(intArray);
            int left = 1;
            int right = intArray[length - 1];
            int answer = 0 ;
            while(right >= left) {
                int mid = (left + right) / 2;
                if(ASearching6.count(intArray, mid) >= target) {
                    answer = mid;
                    mid = left ++;
                }
                else mid = right--;
            }
            System.out.println(answer);
        }
        public static Integer count(Integer[] intArray, Integer distance) {
            int horse = 1;
            int endPosition = intArray[0];
            for(int i = 1; i < intArray.length; i++) {
                if(intArray[i] - endPosition >= distance) {
                    horse++;
                    endPosition = intArray[i];
                }
            }
            return horse;
        }
    }









    /**
     * 재 복습: 2025-01-19
     */
    public static class ASearching5 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer target = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            solution(length, target, intArray);
        }
        public static void solution(Integer length, Integer target, Integer[] intArray) {
            Arrays.sort(intArray);
            int left = 1;
            int right = intArray[length - 1];
            int answer = 0;
            while(right >= left) {
                int mid = (left + right) / 2;
                if(ASearching5.count(intArray, mid) >= target) {
                    answer = mid;
                    left = mid + 1;
                }
                else right = mid - 1;
            }
            System.out.println(answer);
        }
        public static Integer count(Integer[] intArray, Integer distance) {
            int horse  = 1;
            int endPosition = intArray[0];
            for(int i = 1; i < intArray.length; i++) {
                if(intArray[i] - endPosition >= distance) {
                    horse++;
                    endPosition = intArray[i];
                }
            }
            return horse;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer length = scan.nextInt();
        Integer target = scan.nextInt();
        Integer[] intArray = new Integer[length];
        for(int i = 0; i < length; i++) {
            intArray[i] = scan.nextInt();
        }
        solution(length, target, intArray);
    }
    public static Integer count(Integer[] intArray, Integer distance) {
        int horse = 1;
        int endPosition = intArray[0];
        for(int i = 1; i < intArray.length; i++) {
            if(intArray[i] - endPosition >= distance) {
                horse++;
                endPosition = intArray[i];
            }
        }
        return horse;
    }
    public static void solution(Integer length, Integer target, Integer[] intArray) {
        Arrays.sort(intArray);
        int left = 1;
        int right = intArray[length - 1];
        int answer = 0;
        while(right >= left) {
            int mid = (left + right) / 2;
            if(count(intArray, mid) >= target) {
                answer = mid;
                left = mid + 1;
            }
            else right = mid - 1;
        }
        System.out.println(answer);
    }
}
