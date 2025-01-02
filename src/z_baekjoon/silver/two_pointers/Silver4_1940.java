package z_baekjoon.silver.two_pointers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 주몽
 *
 * 시간 제한	메모리 제한	제출	    정답	    맞힌 사람	정답 비율
 * 2 초	    128 MB	    37452	18073	12905	    46.851%
 * 문제
 * 주몽은 철기군을 양성하기 위한 프로젝트에 나섰다. 그래서 야철대장을 통해 철기군이 입을 갑옷을 만들게 하였다. 야철대장은 주몽의 명에 따르기 위하여 연구에 착수하던 중 아래와 같은 사실을 발견하게 되었다.
 *
 * 갑옷을 만드는 재료들은 각각 고유한 번호를 가지고 있다. 갑옷은 두 개의 재료로 만드는데 두 재료의 고유한 번호를 합쳐서 M(1 ≤ M ≤ 10,000,000)이 되면 갑옷이 만들어 지게 된다. 야철대장은 자신이 만들고 있는 재료를 가지고 갑옷을 몇 개나 만들 수 있는지 궁금해졌다. 이러한 궁금증을 풀어 주기 위하여 N(1 ≤ N ≤ 15,000) 개의 재료와 M이 주어졌을 때 몇 개의 갑옷을 만들 수 있는지를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에는 재료의 개수 N(1 ≤ N ≤ 15,000)이 주어진다. 그리고 두 번째 줄에는 갑옷을 만드는데 필요한 수 M(1 ≤ M ≤ 10,000,000) 주어진다. 그리고 마지막으로 셋째 줄에는 N개의 재료들이 가진 고유한 번호들이 공백을 사이에 두고 주어진다. 고유한 번호는 100,000보다 작거나 같은 자연수이다.
 *
 * 출력
 * 첫째 줄에 갑옷을 만들 수 있는 개수를 출력한다.
 *
 * 예제 입력 1
 * 6
 * 9
 * 2 7 4 1 5 3
 * 예제 출력 1
 * 2
 */
public class Silver4_1940 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer length = scan.nextInt();
        Integer orderSum = scan.nextInt();
        Integer[] intArray = new Integer[length];
        for(int i = 0; i < length; i++) {
            intArray[i] = scan.nextInt();
        }
        Integer answer = solution(length, orderSum, intArray);
        System.out.println(answer);
    }
    public static Integer solution(Integer length, Integer orderSum, Integer[] intArray) {
        Arrays.sort(intArray);
        int answer = 0;
        int left = 0, right = length - 1;
        while(right > left) {
            int currentSum = intArray[left] + intArray[right];
            if (orderSum.equals(currentSum)) {
                answer++;
                right--;
                left++;
            } else if (currentSum > orderSum) {
                right--;
            } else {
                left++;
            }
        }
        return answer;
    }
}
