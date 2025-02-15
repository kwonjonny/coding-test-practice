package z_programmers.기초;

import java.util.*;

public class 빈_배열에_추가_삭제하기 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        int[] answer = solution(arr, flag);
        System.out.println(Arrays.toString(answer));
    }
    public static int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(!flag[i]) {
                int array = arr[i];
                for(int j = 0; j < array; j++) {
                    answer.remove(answer.size() - 1);
                }
            } else {
                int array = arr[i] * 2;
                for(int j = 0; j < array; j++) {
                    answer.add(arr[i]);
                }
            }
        }
        return answer.stream().mapToInt(e -> e).toArray();
    }
}
