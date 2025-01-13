package sorting_and_searching_solve;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 이분검색
 * 설명
 * 임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
 *
 * 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.
 *
 * 입력
 *
 * 첫 줄에 한 줄에 자연수 N(3<=N<=1,000,000)과 M이 주어집니다.
 *
 * 두 번째 줄에 N개의 수가 공백을 사이에 두고 주어집니다.
 *
 * 출력
 * 첫 줄에 정렬 후 M의 값의 위치 번호를 출력한다.
 *
 *
 * 예시 입력 1
    8 32
    23 87 65 12 57 32 99 81
 *
 * 예시 출력 1
 * 3
 */
public class A_Searching3 {

    /**
     * 재 복습: 2025-01-13
     */
    public static class ASearching4 {
        public static void main(String[] args) {
            ASearching4 aSearching4 = new ASearching4();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer target = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            aSearching4.solution(length, target, intArray);
        }
        public void solution(Integer length, Integer target, Integer[] intArray) {
            Arrays.sort(intArray);
            int left = 0;
            int right = length - 1;
            int answer = 0;
            while(right >= left) {
                int mid = (right + left) / 2;
                if(target.equals(intArray[mid])) {
                    answer = mid + 1;
                    break;
                }
                else if (intArray[mid] > target) right = mid - 1;
                else left = mid + 1;
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-01-11
     */
    public static class ASearching3 {
        public static void main(String[] args) {
            ASearching3 aSearching3 = new ASearching3();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer target = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            aSearching3.solution(length, target, intArray);
        }
        public void solution(Integer length, Integer target, Integer[] intArray) {
            Arrays.sort(intArray);
            int left = 0;
            int right = length - 1;
            int answer = 0;
            while(right >= left) {
                int middle = (right + left) / 2;
                if(target.equals(intArray[middle])) {
                    answer = middle + 1;
                    break;
                }
                else if (intArray[middle] > target) right = middle - 1;
                else left = middle + 1;
            }
            System.out.println(answer);
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
    public static void solution(Integer length, Integer target, Integer[] intArray) {
        Arrays.sort(intArray);
        int left = 0;
        int right = length - 1;
        int answer = 0;
        while(right >= left) {
            int mid = (right + left) / 2;
            if(intArray[mid].equals(target)){
                answer = mid + 1;
                break;
            }
            else if (intArray[mid] > target) right = mid - 1;
            else if (intArray[mid] < target) left = mid + 1;
        }
        System.out.println(answer);
    }
}
