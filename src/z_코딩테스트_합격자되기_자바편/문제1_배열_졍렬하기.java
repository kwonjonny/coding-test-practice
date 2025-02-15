package z_코딩테스트_합격자되기_자바편;

import java.util.*;

public class 문제1_배열_졍렬하기 {
    public static void main(String[] args) {
        int[] array1 = {1, -5, 2, 4, 3};
        int[] answer1 = solution(array1);
        System.out.println(Arrays.toString(answer1));
        int[] array2 = {2, 1, 1, 3, 2, 5, 4};
        int[] answer2 = solution(array2);
        System.out.println(Arrays.toString(answer2));
        int[] array3 = {6, 1, 7};
        int[] answer3 = solution(array3);
        System.out.println(Arrays.toString(answer3));
    }
    public static int[] solution(int[] array) {
        Arrays.sort(array);
        return array;
    }
}
