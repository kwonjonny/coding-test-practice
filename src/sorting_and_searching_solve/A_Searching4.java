package sorting_and_searching_solve;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 뮤직비디오(결정알고리즘)
 * 설명
 *
 * 지니레코드에서는 불세출의 가수 조영필의 라이브 동영상을 DVD로 만들어 판매하려 한다.
 *
 * DVD에는 총 N개의 곡이 들어가는데, DVD에 녹화할 때에는 라이브에서의 순서가 그대로 유지되어야 한다.
 *
 * 순서가 바뀌는 것을 우리의 가수 조영필씨가 매우 싫어한다. 즉, 1번 노래와 5번 노래를 같은 DVD에 녹화하기 위해서는
 *
 * 1번과 5번 사이의 모든 노래도 같은 DVD에 녹화해야 한다. 또한 한 노래를 쪼개서 두 개의 DVD에 녹화하면 안된다.
 *
 * 지니레코드 입장에서는 이 DVD가 팔릴 것인지 확신할 수 없기 때문에 이 사업에 낭비되는 DVD를 가급적 줄이려고 한다.
 *
 * 고민 끝에 지니레코드는 M개의 DVD에 모든 동영상을 녹화하기로 하였다. 이 때 DVD의 크기(녹화 가능한 길이)를 최소로 하려고 한다.
 *
 * 그리고 M개의 DVD는 모두 같은 크기여야 제조원가가 적게 들기 때문에 꼭 같은 크기로 해야 한다.
 *
 *
 * 입력
 *
 * 첫째 줄에 자연수 N(1≤N≤1,000), M(1≤M≤N)이 주어진다.
 *
 * 다음 줄에는 조영필이 라이브에서 부른 순서대로 부른 곡의 길이가 분 단위로(자연수) 주어진다.
 *
 * 부른 곡의 길이는 10,000분을 넘지 않는다고 가정하자.
 *
 *
 * 출력
 * 첫 번째 줄부터 DVD의 최소 용량 크기를 출력하세요.
 *
 *
 * 예시 입력 1
    9 3
    1 2 3 4 5 6 7 8 9
 *
 * 예시 출력 1
 * 17
 *
 * 힌트
 * 설명 : 3개의 DVD용량이 17분짜리이면 (1, 2, 3, 4, 5) (6, 7), (8, 9) 이렇게 3개의 DVD로 녹음을 할 수 있다.
 */
public class A_Searching4 {

    /**
     * 재 복습: 2025-01-18
     */
    public static class ASearching4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer target = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            ASearching4.solution(length, target, intArray);
        }
        public static Integer max(Integer[] intArray) {
            int max = 0;
            for(Integer x : intArray) {
                if(x > max) {
                    max = x;
                }
            }
            return max;
        }
        public static Integer sum(Integer[] intArray) {
            int sum = 0;
            for(Integer x : intArray) {
                sum = sum + x;
            }
            return sum;
        }
        public static Boolean count(Integer[] intArray, Integer target, Integer mid) {
            int dvdCount = 1;
            int currentSum = 0;
            for(Integer x : intArray) {
               if(currentSum + x > mid) {
                   dvdCount++;
                   currentSum = x;
                   if(dvdCount > target) {
                       return false;
                   }
               }
               else currentSum = currentSum + x;
            }
            return true;
        }
        public static void solution(Integer length, Integer target, Integer[] intArray) {
            Integer left = ASearching4.max(intArray);
            Integer right = ASearching4.sum(intArray);
            int answer = 0;
            while (right >= left) {
                Integer mid = (left + right) / 2;
                if(ASearching4.count(intArray, target, mid)) {
                    answer = mid;
                    right = mid - 1;
                }
                else left = mid + 1;
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
        int right = Arrays.stream(intArray)
                .mapToInt(Integer::intValue)
                .sum();
        int left = Arrays.stream(intArray)
                .mapToInt(Integer::intValue)
                .max().getAsInt();

        int answer = 0;
        while (right >= left) {
            int mid = (right + left) / 2;
            if (count(intArray, mid, target)) {
                answer = mid;
                right = mid - 1;
            }
            else left = mid + 1;
        }
        System.out.println(answer);
    }
    public static Boolean count(Integer[] array, Integer capacity, Integer target) {
        int dvdCount = 1 ;
        int currentLengthSum = 0;
        for(Integer x : array) {
            if(currentLengthSum + x > capacity) {
                dvdCount++;
                currentLengthSum = x;
                if(dvdCount > target) {
                    return false;
                }
            }
            else currentLengthSum = currentLengthSum + x;
        }
        return true;
    }
}
