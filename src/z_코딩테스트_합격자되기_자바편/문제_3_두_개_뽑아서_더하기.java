package z_코딩테스트_합격자되기_자바편;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 문제_3_두_개_뽑아서_더하기 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        int[] answer = solution(numbers);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(e -> e).toArray();
    }
}
