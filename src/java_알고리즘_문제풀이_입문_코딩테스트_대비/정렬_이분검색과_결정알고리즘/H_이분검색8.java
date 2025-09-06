package java_알고리즘_문제풀이_입문_코딩테스트_대비.정렬_이분검색과_결정알고리즘;

/**
 * 8. 이분검색
 * 설명
 * <p>
 * 임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
 * <p>
 * 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 한 줄에 자연수 N(3<=N<=1,000,000)과 M이 주어집니다.
 * <p>
 * 두 번째 줄에 N개의 수가 공백을 사이에 두고 주어집니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 줄에 정렬 후 M의 값의 위치 번호를 출력한다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    8 32
    23 87 65 12 57 32 99 81
 * 예시 출력 1
 * <p>
 * 3
 */

import java.util.*;

public class H_이분검색8 {

    public static class H_이분검색8_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            solution(N, T, array);
        }
        public static void solution(int N, int T, int[] array) {
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N - 1; j++) {
                    if(array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            int lt = 0;
            int rt = array.length - 1;
            int ret = Integer.MIN_VALUE;
            while(rt >= lt) {
                int mid = (lt + rt) / 2;
                if(array[mid] == T) {
                    ret = mid + 1;
                    break;
                }
                else if (array[mid] > T) rt = mid - 1;
                else if (array[mid] < T) lt = mid + 1;
            }
            System.out.println(ret);
        }
    }
}
