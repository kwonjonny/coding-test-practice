package array_solve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *  보이는 학생
 *
 * 설명: 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
 *
 * 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 *
 *
 * 입력:
 * - 첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
 *
 * 출력:
 * - 선생님이 볼 수 있는 최대학생수를 출력한다.
 *
 * 예제:
 * 입력:
 *   8
 *   130 135 148 140 145 150 150 153
 * 출력:
 *   5
 */
public class A2_Array{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer count = scan.nextInt();
        Integer[] array = new Integer[count];
        for(int i = 0; i < count; i++) {
            array[i] = scan.nextInt();
        }

        List<Integer> arrayList = solution(count, array);
        Integer arrayCount = 0;
        for(Integer x : arrayList) {
            arrayCount++;
        }
        System.out.println(arrayCount);
    }

    public static List<Integer> solution(Integer count, Integer[] array) {
        Integer maxHeight = array[0];
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(array[0]);

        for(int i = 1; i < count; i++) {
           if(array[i] > maxHeight) {
               maxHeight = array[i];
               arrayList.add(array[i]);
           }
        }
        return arrayList;
    }
}