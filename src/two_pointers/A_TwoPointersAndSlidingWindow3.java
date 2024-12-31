package two_pointers;

import java.util.Objects;
import java.util.Scanner;

/**
 * 최대 길이 연속부분수열
 * 설명
 *
 * 0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다.
 *
 * 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
 *
 * 만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
 *
 * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
 *
 * 입력
 * 첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.
 * 두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.
 *
 * 출력
 * 첫 줄에 최대 길이를 출력하세요.
 *
 * 예시 입력
   14 2
   1 1 0 0 1 1 0 1 1 0 1 1 0 1
 *
 * 예시 출력
 * 8
 */
public class A_TwoPointersAndSlidingWindow3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int count = scan.nextInt();
        int[] intArray = new int[length];
        for(int i = 0; i < length; i++) {
            intArray[i] = scan.nextInt();
        }
        System.out.println(solution(length, count, intArray));
    }
    public static Integer solution(int length, int count, int[] intArray) {
        int answer = 0;
        int left = 0;
        int zeroCount = 0;
        for(int right = 0; right < length; right++) {
            if(intArray[right] == 0) zeroCount++;

            while(zeroCount > count) {
                if(intArray[left] == 0) zeroCount--;
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }
        return answer;
    }

    /**
     * 재 복습: 2024-12-26
     */
    public static class ATwoPointersAndSlidingWindow3 {
        public static void main(String[] args) {
            ATwoPointersAndSlidingWindow3 aTwoPointersAndSlidingWindow3 = new ATwoPointersAndSlidingWindow3();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer changeCount = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            System.out.println(aTwoPointersAndSlidingWindow3.solution(length, changeCount, intArray));
        }
        public Integer solution(Integer length , Integer changeCount, Integer[] intArray) {
            Integer zeroCount = 0;
            Integer answer = 0;
            Integer left = 0;
            for(int right = 0; right < length; right++) {
                if(intArray[right] == 0) zeroCount++;
                while(zeroCount > changeCount) {
                    if(intArray[left] == 0) zeroCount--;
                    left++;
                }
                answer = Math.max(answer, right - left + 1);
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class ATwoPointersAndSlidingWindow4 {
        public static void main(String[] args) {
            ATwoPointersAndSlidingWindow4 aTwoPointersAndSlidingWindow4 = new ATwoPointersAndSlidingWindow4();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer howManyZero = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            Integer answer = aTwoPointersAndSlidingWindow4.solution(length, howManyZero, intArray);
            System.out.println(answer);
        }
        public Integer solution(Integer length, Integer howManyZero, Integer[] intArray) {
            int answer = 0;
            int cnt = 0;
            int left = 0;

            for(int right = 0; right < length; right++) {
                if(intArray[right].equals(0)) cnt++;

                while(cnt > howManyZero) {
                    if(Objects.equals(intArray[left], 0)) cnt--;
                    left++;
                }
                answer = Math.max(answer, right - left + 1);
            }
            return answer;
        }
    }
}