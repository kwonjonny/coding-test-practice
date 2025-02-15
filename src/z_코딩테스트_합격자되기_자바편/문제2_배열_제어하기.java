package z_코딩테스트_합격자되기_자바편;

import java.util.*;

public class 문제2_배열_제어하기 {
    public static void main(String[] args) {
        int[] array1 = {4, 2, 2, 1, 3, 4};
        int[] answer1 = solution(array1);
        System.out.println(Arrays.toString(answer1));
        int[] array2 = {2, 1, 1, 3, 2, 5, 4};
        int[] answer2 = solution(array2);
        System.out.println(Arrays.toString(answer2));
    }
    public static int[] solution(int[] array) {
        Integer[] result = Arrays.stream(array).boxed()
                .distinct().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());
        return Arrays.stream(result).mapToInt(e -> e).toArray();
    }

    // Tree Set 으로 중복 제거 연습
    public static int[] solution2(int[] array) {
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for(int x : array) {
            treeSet.add(x);
        }
        return treeSet.stream().mapToInt(e -> e).toArray();
    }
}
