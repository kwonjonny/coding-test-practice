package z_코딩테스트_합격자되기_자바편;

import java.util.*;

public class 문제4_모의고사 {
    public static void main(String[] args) {
        int[][] pattern = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5,3,3,1,2,2,4,4,5,5}};
        int[] answer = {1,2,3,4,5};
        int[] score = solution(pattern, answer);
        System.out.println(Arrays.toString(score));
    }
    public static int[] solution(int[][] pattern, int[] answer) {
        int[] solution = new int[pattern.length];
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < pattern.length; j++) {
                if(answer[i] == pattern[j][i % pattern[j].length]) {
                    solution[j]++;
                }
            }
        }
        int maxScore = Arrays.stream(solution).max().getAsInt();
        List<Integer> score = new ArrayList<>();
        for(int i = 0; i < solution.length; i++) {
            if(solution[i] == maxScore) {
                score.add(i + 1);
            }
        }
        return score.stream().mapToInt(e -> e).toArray();
    }
}
