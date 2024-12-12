package array_solve;

import java.util.*;

/**
 * 뒤집은 소수
 * <p>
 * 설명:
 * <p>
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * <p>
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * <p>
 * 첫 자리부터의 연속된 0은 무시한다.
 * <p>
 * 입력:
 * - 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
 * <p>
 * - 각 자연수의 크기는 100,000를 넘지 않는다.
 * <p>
 * 출력:
 * - 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 * <p>
 * 예제:
 * 입력:
 * 9
 * 32 55 62 20 250 370 200 30 100
 * <p>
 * 출력:
 * 23 2 73 2 3
 */
public class A6_Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer count = scan.nextInt();
        Integer[] intArray = new Integer[count];
        for (int i = 0; i < count; i++) {
            intArray[i] = scan.nextInt();
        }

        for (Integer x : solution(count, intArray)) {
            System.out.print(x + " ");
        }
    }

    public static List<Integer> solution(Integer count, Integer[] intArray) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int temp = intArray[i];
            int res = 0;
            while (temp > 0) {
                int t = temp % 10;
                res = res * 10 + t;
                temp = temp / 10;
            }
            if (isPrime(res)) {
                arrayList.add(res);
            }
        }

        return arrayList;
    }

    public static Boolean isPrime(Integer num) {
        if (num == 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
